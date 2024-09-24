package com.JFSDS25.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.JFSDS25.model.Employee;

@Repository
public class EmployeeDao_Impl implements EmployeeDao
{
	@Autowired
	private HibernateTemplate ht;
	public HibernateTemplate getHt() {
		 return ht;
		 }
	public void setHt(HibernateTemplate ht) {
		 this.ht = ht;
		 }
	

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		ht.persist(e);
	}

}
