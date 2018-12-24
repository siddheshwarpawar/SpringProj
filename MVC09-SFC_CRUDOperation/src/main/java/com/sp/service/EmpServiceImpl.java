package com.sp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.sp.bo.EmpBO;
import com.sp.dao.EmpDAO;
import com.sp.dto.EmpDTO;

public class EmpServiceImpl implements EmpService {

	public EmpDAO dao;
	public EmpServiceImpl(EmpDAO dao) {
		this.dao = dao;
	}

	public List<EmpDTO> retrive() {
		List<EmpBO> listbo = null;
		
		List<EmpDTO> listdto =new ArrayList();
		
		//use dao
		listbo = dao.getEmps();
		//copy bo to dto
		listbo.forEach(bo1 -> {
			EmpDTO dto = new EmpDTO();
			BeanUtils.copyProperties(bo1, dto);
			listdto.add(dto);
		});
		return listdto;
	}

	@Override
	public String saveEmp(EmpDTO dto) {
		
		// Convert dto to bo
		EmpBO bo = new EmpBO();
		bo.setEid(dto.getEid());
		bo.setEname(dto.getEname());
		bo.setDesg(dto.getDesg());
		bo.setSalary(dto.getSalary());
		
		
		System.out.println(bo.getEid());
		
		// Use dao
		int count = dao.insertData(bo);
		
		if(count != 0) 
			return "Record saved successfully.";
		else 
			return "Failed to save record..";
	}//saveEmp(-)

	@Override
	public String removeEmp(int eid) {
		
		//use dao
		int count = dao.deleteRecord(eid);
		if(count!=0)
			return "Sucessfully deleted";
		else
			return "Failed to delete";
	}

	@Override
	public EmpDTO getEmp(int eid) {
		EmpDTO dto = new EmpDTO();
		// Use dao
		EmpBO bo = dao.getEmpByEid(eid);
		// Convert bo to dto
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}//getEmp()
	
	@Override
	public String updateEmp(EmpDTO dto) {
		//convert dto to bo
		EmpBO bo = new EmpBO();
		BeanUtils.copyProperties(dto, bo);
		//use dao
		int count = dao.updateRecord(bo);
		
		if(count!=0) {
			return "updated successfully";
		}
		else {
			return "failed to update";
		}
	}
}//class
