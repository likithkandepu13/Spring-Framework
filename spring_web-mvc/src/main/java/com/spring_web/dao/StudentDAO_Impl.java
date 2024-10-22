package com.spring_web.dao;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring_web.model.Student;

@Repository
public class StudentDAO_Impl implements StudentDAO {

	@Autowired
	private HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public void addStudent(Student student) {
		Session session = ht.getSessionFactory().getCurrentSession(); // Get the current session
		session.persist(student);
	}
}
