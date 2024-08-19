# Spring-Framework
List of Topis:
	• Introduction
	• Why Spring
	• Advantages of Spring
	• Spring Architecture
	• Dependency Injection (DI)
	• Inversion of Control (IOC)
	• Primitive and Non Primitive data types
	• Spring Data Access Object (DAO)
	• Spring DAO using JDBC
	• Spring DAO using Hibernate 
	• Spring MVC

Introduction:
	• Spring is a JAVA Framework which is developed by Rod Johnson in 2003
	• This framework is used to build a JAVA application at an Enterprise level (We can build console applications and Web applications..)
	• It is a lightweight framework, i.e Applications with Spring frameworks executes faster.
	• The core principle of Spring Framework is to simplify the JAVA development process and promote good Design practices.
	• Spring framework comprises of various modules like:
		○ Data Access Objects
		○ Inversion of Control
		○ ORM
		○ WEB-MVC etc..
	
Why Spring:
	• Using Hibernate we can only build the console applications, where as in Spring framework we can able to build applications from console to web.
	• Hibernate is an ORM framework primarily focused on the DATA PERSISTANCE, Spring is a comperhensive  framework that provides a wide features.
	• Spring can be used with various ORM frameworks including Hibernate. [ Spring is called as MASTER/MOTHER Framework ]
	
Advantage of SPRING:
	• It is a Lightweight framework
	• Compared with Hibernate, it is easy to Test and Maintain
	• Spring allows us to use Loose Coupling 
	• It provides pre-defined templates.

Spring Architecture :
	• Spring architecture consists of several modules such as:
		○ IOC
		○ DAO
		○ ORM
		○ WEB MVC
		○ Aspect Oriented Programming (AOP)
	• All these modules are grouped into TEST, SPRING Core Container, DAO, Web-MVC etc..
	
		○ 
	
	
	
	
Dependency Injection & Inversion of Control:

	• Note: Loosely Coupling / Tightly Coupling 
		○ Program:
			§ 2 classes ( 1 class depends on other class)
				□ Tightly Coupled
			§ 2 Classes (1 class not depends on other class)
				□ Loosely coupled 
		○ Spring allows only Loosely coupling 
		○ Example:
			§ Tightly Coupled :
	Class Employee{ 
			Employee & Address	        Employee(){
				                Address add= new Address();
				        }
				}
				-----------------------------------------------------
				class Engine {
				    public void start() {
				        System.out.println("Engine is starting...");
				    }
				}
				
				class Car {
				    private Engine engine = new Engine(); // Tightly coupled to Engine class
				
				    public void drive() {
				        engine.start(); // Directly calling methods of Engine class
				        System.out.println("Car is driving...");
				    }
				}
				
				public class Main {
				    public static void main(String[] args) {
				        Car car = new Car();
				        car.drive();
				    }
				}
				
			Loosely Coupled:	Class Employee{
				        Employee(Address add)
				        {
				                this.add =add;
				        }
				}
				----------------------------------------------------------------------------------------------------
				class Engine {
				    public void start() {
				        System.out.println("Engine is starting...");
				    }
				}
				
				class Car {
				    private Engine engine;
				
				    public Car(Engine engine) { // Dependency injection
				        this.engine = engine;
				    }
				
				    public void drive() {
				        engine.start(); // Uses the Engine instance passed from outside
				        System.out.println("Car is driving...");
				    }
				}
				
				public class Main {
				    public static void main(String[] args) {
				        Engine engine = new Engine();
				        Car car = new Car(engine); // Injecting dependency
				        car.drive();
				    }
				}
				
		○ Lets have a look on the Tightly coupling and Loosely coupling 

Dependency Injection: 
	• DI is a design pattern for software development projects in which object dependencies are provided externally rather than creating itself.
	• Dependency Injection is useful for creating loosely coupled programs / applications.
	• Advantages:
		○ It is easy to test and maintain 
		○ Makes the code loosely 
	• Note: DI is used to remove the dependencies from the program.
	• Types of dependency Injection:
		○ Setter Injection
		○ Constructor Injection 

	Setter Injection:
		○ Generating setter and getters methods in POJO (called as BEAN  in Spring)class
	Constructor Injection:
		○ Generating a constructor in a BEAN class
	
	
Inversion of Control:
	• IOC is also a design pattern, where it is responsible to inject the DEPENDENCIES
	• Different types of IOC Containers are:
		○ BeanFactory
		○ ApplicationContext


Example:
	1. Setter Injection using BeanFactory
	2. Setter Injection using ApplicationContext
	3. Constructor Injection using BeanFactory
	4. Constructor Injection using ApplicationContext

Note:
	In spring Framework, we MUST have the following files: 
	1. POJO Class/ Bean Class
	2. Configuration File
	3. Logic File

Note:
	Syntax for BeanFactory: 	Resource r = new ClassPathResource("configurationfile");
BeanFactory bf =new  XmlBeanFactory(r);
	Syntax for ApplicationContext:	ApplicationContext ac = new ClassPathXmlApplicationContext("configurationfile");


Steps to follow :
	1. Create a Maven Project
	2. Update the Maven Compiler  from 1.7 to 1.8
	3. Add dependencies that are required 
	4. Update the Maven Project
	5. Create Resources directory 
		a. Src-> main-> resources ( configuration file) config.xml
	6. Implement the Spring Concepts
		a. Bean Class
		b. Configuration File 
		c. Logic File
	7. Run as Java Application


Example-1:
Setter injection using BeanFactory :	Bean Class:
----------------
class Employee  {
      private int eid;	
	      private String ename;
	      private double esal;
	    
	    SI -> Generate Getters and Setters
}

Configuration File:
	------------------------------
	(file name can be anything.xml)
	Ex: spconfig.xml
	
	<//ddt>
	<beans>
	        <bean id="empbean" name="com.klu.JFSDS25-SpringDI" class="com.KLU.JFSDS25-SpringDI.Employee"> 
	         //here it is different form hibernate as, we used to write class name it name component too, here we use another attribute class to give Bean class path//
	        <property name="eid" value="111" />
	        <property name="ename" value="ABC" />
	        <property name="esal" value="250000" />
	        
	        </bean>
	</beans>

	Logic File 
	---------------------------------
	(Any name can be used to define the logicfile name)
	Ex: test.java
	
	Class Test {
	        Public static void main(String[] args) {
	                Resource r = ClassPathResource("spconfig.xml");
	                BeanFactory bf = XmlBeanFactory(r);
	                // now we used beanfactory for configre the configuration file.
	                // this may not be used these days as this is outdated
	                Object ob = bf.getBean("empbean");   // we can name empbean with anyname
	                Employee e = (Employee) ob;
	                System.out.println(e.getEid()+" " +e.getEname() + " " + e,getEsal());
	
	        }
	}
	-----------------------------------------------------------------
	Executed code:
	        In the new version of Spring we, don’t use the XmlBeanFactory(r);
	
	package com.klu.JFSDS25_SpringDI;
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	
	public class Test {
	
	    public static void main(String[] args) {
	       
	        ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
	
	        Employee e = (Employee) ac.getBean("empbean");
	
	        System.out.print(e.getEname());
	    }
	}
• XmlBeanFactory Deprecated: The XmlBeanFactory has been deprecated as of Spring 3.1 and is generally discouraged in favor of ApplicationContext, such as ClassPathXmlApplicationContext or FileSystemXmlApplicationContext.

Example-3:
Setter Injection using ApplicationContext	Bean Class:
----------------
class Employee  {
      private int eid;
	      private String ename;
	      private double esal;
	    
	    SI -> Generate Getters and Setters
}

	Configuration File:
	------------------------------
	(file name can be anything.xml)
	Ex: spconfig.xml
	
	<//ddt>
	<beans>
	        <bean id="empbean" name="com.klu.JFSDS25-SpringDI" class="com.KLU.JFSDS25-SpringDI.Employee"> 
	         //here it is different form hibernate as, we used to write class name it name component too, here we use another attribute class to give Bean class path//
	        <property name="eid" value="111" />
	        <property name="ename" value="ABC" />
	        <property name="esal" value="250000" />
	        
	        </bean>
	</beans>

	Logic File 
	---------------------------------
	(Any name can be used to define the logic file name)
	Ex: test1.java
	
	Class Test1 {
	        Public static void main(String[] args) {
	                ApplicationContext ac = ClassPathXmlApplicationContext("spconfig.xml");
	                BeanFactory bf = XmlBeanFactory(r);
	                // now we used beanfactory for configre the configuration file.
	                // this may not be used these days as this is outdated
	                Object ob = bf.getBean("empbean");   // we can name empbean with anyname
	                Employee e = (Employee) ob;
	                System.out.println(e.getEid()+" " +e.getEname() + " " + e,getEsal());
	
	        }
	}
	
	

Alternative way for Example 1 and 2:
SetterInjection	Example -1	Example-2
Bean Class:
----------------
class Employee  {
      private int eid;
	Bean Class:
----------------
class Employee  {
      private int eid;	      private String ename;
	      private String ename;	      private double esal;
	      private double esal;	    
	    	    SI -> Generate Getters and Setters
	    SI -> Generate Getters and Setters	 void display()
	        // we write a method to display	        {
	    void display()	        System.out.println(getEname());
	        {	        
}
	        System.out.println(getEname());	
}

	        
}	
	}
	
		Configuration File:
	Configuration File:	------------------------------
	------------------------------	(file name can be anything.xml)
	(file name can be anything.xml)	Ex: spconfig.xml
	Ex: spconfig.xml	
		<beans>
	<beans>	        <bean id="empbean" name="com.klu.JFSDS25-SpringDI" class="com.KLU.JFSDS25-SpringDI.Employee"> 
	        <bean id="empbean" name="com.klu.JFSDS25-SpringDI" class="com.KLU.JFSDS25-SpringDI.Employee"> 	        <property name="eid" value="111" />
	        <property name="eid" value="111" />	        <property name="ename" value="ABC" />
	        <property name="ename" value="ABC" />	        <property name="esal" value="250000" />
	        <property name="esal" value="250000" />	        
	        	        </bean>
	        </bean>	</beans>
	</beans>	
		Logic File 
	Logic File 	---------------------------------
	---------------------------------	(Any name can be used to define the logic file name)
	(Any name can be used to define the logicfile name)	Ex: test1.java
	Ex: test.java	
		Class Test1 {
	Class Test {	        Public static void main(String[] args) {
	        Public static void main(String[] args) {	                ApplicationContext ac = ClassPathXmlApplicationContext("spconfig.xml");
	                Resource r = ClassPathResource("spconfig.xml");	                BeanFactory bf = XmlBeanFactory(r);
	                BeanFactory bf = XmlBeanFactory(r);	                Object ob = bf.getBean("empbean");   
	                Object ob = bf.getBean("empbean");   	                Employee e = (Employee) ob;
	                Employee e = (Employee) ob;	                e.display();
	                e.display();	
		        }
	        }	}
	}	
	

	
	

Example-3:
Constructor Injection using BeanFactory	Rather than setters and getters we use Constructor here:

Bean Class :
--------------------
class Employee{
	        Private int eid;
	        Private String ename;
	        Private double esal;
	        
	        SI-> Generate only getter methods
	        public Employee(int eid, String ename, double esal)
	        {
	                this.eid=eid;
	                this.ename=ename;
	                this.esal-esal;
	        }
	}
	
	Configuration File: (spconfig.xml)
	----------------------------
	<//ddt>
	
	<//ddt>
	<beans>
	        <bean id="empbean" name="com.klu.JFSDS25-SpringDI" class="com.KLU.JFSDS25-SpringDI.Employee"> 
	        //constructor argument is used instead of property
	        <constructor-arg value="111" type="int" />
	        <constructor-arg value="DEF" type="String"/>
	        <constructor-arg value="32424"  type="double"/>
	        </bean>
	</beans>
	
	Logic File 
	---------------------------------
	(Any name can be used to define the logicfile name)
	Ex: test3.java
	
	Class Test {
	        Public static void main(String[] args) {
	                Resource r = ClassPathResource("spconfig.xml");
	                BeanFactory bf = XmlBeanFactory(r);
	                Object ob = bf.getBean("empbean");   
	                Employee e = (Employee) ob;
	                System.out.println(e.getEid()+" " +e.getEname() + " " + e,getEsal());
	                
	
	        }
	}
	


Example-4:
Constructor Injection using AC:	Rather than setters and getters we use Constructor here:

Bean Class :
--------------------
class Employee{
	        Private int eid;
	        Private String ename;
	        Private double esal;
	        
	        SI-> Generate only getter methods
	        public Employee(int eid, String ename, double esal)
	        {
	                this.eid=eid;
	                this.ename=ename;
	                this.esal-esal;
	        }
	}
	Configuration File: (spconfig.xml)
	----------------------------
	<//ddt>
	
	<//ddt>
	<beans>
	        <bean id="empbean" name="com.klu.JFSDS25-SpringDI" class="com.KLU.JFSDS25-SpringDI.Employee"> 
	        //constructor argument is used instead of property
	        <constructor-arg value="111" type="int" />
	        <constructor-arg value="DEF" type="String"/>
	        <constructor-arg value="32424"  type="double"/>
	        </bean>
	</beans>
	Logic File 
	---------------------------------
	(Any name can be used to define the logic file name)
	Ex: test4.java
	
	Class Test1 {
	        Public static void main(String[] args) {
	                ApplicationContext ac = ClassPathXmlApplicationContext("spconfig.xml");
	                BeanFactory bf = XmlBeanFactory(r);
	                Object ob = bf.getBean("empbean");   
	                Employee e = (Employee) ob;
	                e.display();
	
	        }
	}
	
	Executed Code:
	--------------------------------
	
	package com.klu.JFSDS25_SpringDIConstructor;
	
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	
	
	
	public class Test1 {
	
		public static void main(String[] args) {
			ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
	        Employee e = (Employee) ac.getBean("empbean");
	        System.out.print(e.getEname());
	
		}
	
	}
	
	Configuration File: 
	
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:p="http://www.springframework.org/schema/p"
	xsi:schemaLocation="http://www.springframework.org/schema/beans  
	               http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">
	    <bean id="empbean"  class="com.klu.JFSDS25_SpringDIConstructor.Employee">
	   <constructor-arg value="121" type="int"/>
	   <constructor-arg value="sai" type="String"/>
	   <constructor-arg value="9874599" type="double"/>
	    </bean>
	</beans>
	
	
![Uploading image.png…]()
