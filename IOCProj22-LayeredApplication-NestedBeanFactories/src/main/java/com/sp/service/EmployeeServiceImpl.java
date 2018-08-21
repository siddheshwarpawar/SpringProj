package com.sp.service;

import java.util.ArrayList;
import java.util.List;

import com.sp.bo.EmployeeBO;
import com.sp.dao.EmployeeDAO;
import com.sp.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {

		private String type ;
		private EmployeeDAO dao;
		
		public EmployeeServiceImpl(String type, EmployeeDAO dao) {
			this.type = type;
			this.dao = dao;
			System.out.println("Service Impl :: "+type);
		}
		


		public List<EmployeeDTO> getEmpByDesg(String[] desg) throws Exception {
		
			String cond=null;
			List<EmployeeBO> listBO=null;
			List<EmployeeDTO> listDTO=new ArrayList();
			//prepare SQL Query condition from desg[]
			cond="(";                                         // ('CLERK','MANAGER','ANALYST')
			for(int i=0;i<desg.length;++i){
				if(i==desg.length-1)
					cond=cond+"'"+desg[i]+"'";
				else 
					cond=cond+"'"+desg[i]+"',";
			}
			cond=cond+")";
			listBO = dao.retriveEmployeeByDesg(cond);
			
			listDTO=new ArrayList();

			for(EmployeeBO bo:listBO){
				//copy each BO to each DTO

				EmployeeDTO dto=new EmployeeDTO();
				dto=new EmployeeDTO();
				
				dto.setEno(bo.getEno());
				dto.setEname(bo.getEname());
				dto.setSalary(bo.getSalary());
				dto.setDesg(bo.getDesg());
		//		BeanUtils.copyProperties(bo,dto);
				//add BO to list Collection
				listDTO.add(dto);

			}
			return listDTO;
	}
}
