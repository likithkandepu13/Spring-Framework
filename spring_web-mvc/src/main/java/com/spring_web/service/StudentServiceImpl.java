package com.spring_web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring_web.dao.StudentDAO;
import com.spring_web.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	@Qualifier("studentDAO_Impl") // Specify the exact bean to inject
	private StudentDAO studentDAO;

	@Override
	@Transactional(readOnly = false)
	public void addNewStudent(Student student) {
		studentDAO.addStudent(student);
	}
}
