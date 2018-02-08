package client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.model.Student;
import com.project.service.StudentService;
import com.project.service.impl.StudentServiceImpl;

public class Tests {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("resources/beans.xml");
		StudentService studentService= context.getBean("studentService", StudentServiceImpl.class);
		
		Student student=studentService.getStudentNameandAddressById(61);
		System.out.println("Student Name: "+student.getStudName()+"\t Student Address: "+student.getAddress());
		context.close();
	}
}
