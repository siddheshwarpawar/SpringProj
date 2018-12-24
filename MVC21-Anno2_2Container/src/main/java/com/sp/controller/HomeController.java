package com.sp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sp.service.WishServiceImpl;

@Controller
public class HomeController {
	
	@Autowired
	public WishServiceImpl service;
	
	/*@RequestMapping("/wish.htm")
	public ModelAndView getMsg() {
		String wishMsg = service.genrateWishMessage();
		return new ModelAndView("wish", "msg", wishMsg);
	}*/
	
	/*@RequestMapping("/wish.htm")
	public String getMsg(ModelMap map) {
		String wishMsg = service.genrateWishMessage();
		map.addAttribute("msg", wishMsg);
		return "wish";
	}*/
	
	/*
	@RequestMapping("/wish.htm")
	public String process(Model map) {
		String wishMsg = service.genrateWishMessage();
		map.addAttribute("msg", wishMsg);
		return "wish";
	}*/
	/*
	@RequestMapping("/wish.htm")
	public String process(Map map) {
		String wishMsg = service.genrateWishMessage();
		map.put("msg", wishMsg);
		return "wish";
	}
	*/
	/*
	@RequestMapping("/wish.htm")
	public void process(Map map) {
		String wishMsg = service.genrateWishMessage();
		map.put("msg", wishMsg);
	}*/
	/*
	@RequestMapping("/wish.htm")
	public void process(Model map) {
		String wishMsg = service.genrateWishMessage();
		map.addAttribute("msg", wishMsg);
	}*/
	/*
	@RequestMapping("/wish.htm")
	public void process(ModelMap mm) {
		String wishMsg = service.genrateWishMessage();
		mm.addAttribute("msg", wishMsg);
	}*/
	//Recommended
	@RequestMapping("/wish.htm")
	public String process(Map<String , Object> map) {
		//use service
		String wishMsg = service.genrateWishMessage();
		map.put("msg", wishMsg);
		return "wish";
	}
}
