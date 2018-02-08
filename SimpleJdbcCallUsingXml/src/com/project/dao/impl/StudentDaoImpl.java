package com.project.dao.impl;

import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.project.dao.StudentDao;
import com.project.model.Student;



public class StudentDaoImpl implements StudentDao {

	private SimpleJdbcCall simpleJdbcCall;
	
	public void setSimpleJdbcCall(SimpleJdbcCall simpleJdbcCall) {
		this.simpleJdbcCall = simpleJdbcCall;
	}
	
	@Override
	public Student fetchStudentNameandAddressById(int studid) {
		simpleJdbcCall.withProcedureName("getNameandAddress");
		
		MapSqlParameterSource inputMap=new  MapSqlParameterSource();
		
		inputMap.addValue("sid", studid);
		 
		/*Map<String, Object> outMap = */Map<String, Object> map = simpleJdbcCall.execute(inputMap);
		
		//Student student = new Student();
	/*	student.setStudName(((String)outMap.get("name")));
		student.setAddress((String)outMap.get("address"));
		
		
		*/
		
		Student student = new Student();
		return null;
	}

}
