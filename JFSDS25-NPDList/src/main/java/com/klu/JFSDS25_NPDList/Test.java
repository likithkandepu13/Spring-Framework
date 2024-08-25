package com.klu.JFSDS25_NPDList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Question q = (Question) ac.getBean("quesbean");
		q.display();
		

	}

}
