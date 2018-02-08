package com.project.service.impl;

import com.project.dao.StudentDao;
import com.project.model.Student;
import com.project.service.StudentService;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao studentDao;
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	

	@Override
	public Student getStudentNameandAddressById(int studentID) {
		// TODO Auto-generated method stub
		return studentDao.fetchStudentNameandAddressById(studentID);
	}

}
