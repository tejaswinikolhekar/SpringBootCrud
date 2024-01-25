package com.xadmin.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCrud.bean.Student;
import com.xadmin.SpringBootCrud.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/students")
    public List<Student> getAllStudents()
    {
		return studentService.getAllStudents();
	}
	
	@RequestMapping(method= RequestMethod.POST, value="/students")
	public void addStudent(@RequestBody Student student)
	{
		studentService.addStudent(student);
	}
	
	@RequestMapping(method= RequestMethod.PUT, value="/students/{id}")
	public void updateStudent(@PathVariable String id,@RequestBody Student student)
	{
		studentService.updateStudent(id,student);
	}
	
	public void DeleteStudent(@PathVariable String id)
	{
		studentService.deleteStudent(id);
	}

}
