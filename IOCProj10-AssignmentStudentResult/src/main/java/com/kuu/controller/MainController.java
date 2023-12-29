package com.kuu.controller;

import com.kuu.dto.StudentDTO;
import com.kuu.service.IStudentService;
import com.kuu.service.StudentServiceImpl;
import com.kuu.vo.StudentVO;

public class MainController {
	
	private IStudentService service;

	public MainController(IStudentService service) {
		super();
		this.service = service;
	}
	
	public String proceeStudent(StudentVO vo)throws Exception{
		
		String msg;
		try {
		StudentDTO dto = new StudentDTO();
		dto.setName(vo.getName());
		dto.setCourse(vo.getCourse());
		dto.setAddress(vo.getAddress());
		dto.setMark1(Integer.parseInt(vo.getMark1()));
		dto.setMark2(Integer.parseInt(vo.getMark2()));
		dto.setMark3(Integer.parseInt(vo.getMark3()));
		
		msg= service.showResult(dto);
		
		}catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		
		return msg;
	}
	

}
