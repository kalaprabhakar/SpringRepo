package com.kuu.service;

import com.kuu.bo.StudentBO;
import com.kuu.dao.IStudentDAO;
import com.kuu.dto.StudentDTO;

public final class StudentServiceImpl implements IStudentService {

	private IStudentDAO dao;

	public StudentServiceImpl(IStudentDAO dao) {
		super();
		this.dao = dao;
	}
		
		@Override
		public String showResult(StudentDTO dto) throws Exception {
			
			try {
				
				int total = dto.getMark1()+dto.getMark2()+dto.getMark3();
				float avg = total /3 ;
				String result ;
				if(avg < 30) {
					result ="Fail";
				}else if (avg >30 && avg <40) {
					result="Third Division";
				}else if (avg>40 && avg <50) {
					result = "Second Division";
				}else {
					result="First Division";
				}
				
				StudentBO bo = new StudentBO();
				bo.setName(dto.getName());
				bo.setCourse(dto.getCourse());
				bo.setAdddress(dto.getAddress());
				bo.setMark1(dto.getMark1());
				bo.setMark2(dto.getMark2());
				bo.setMark3(dto.getMark3());
				bo.setTotal(total);
				bo.setAvg(avg);
				bo.setResult(result);

				
				int i = dao.add(bo);
				
				if(i==1) {
					return "Stdent Added Successfully.....";
				}else {
					return "Failed Stuent Not Added.....";
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
			
			
		}
	}


