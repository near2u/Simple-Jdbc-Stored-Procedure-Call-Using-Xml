package com.project.dao;

import com.project.model.Student;

public interface StudentDao {

	public Student fetchStudentNameandAddressById(int studentID);
}
