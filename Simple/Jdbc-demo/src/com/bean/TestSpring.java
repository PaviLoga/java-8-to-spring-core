package com.bean;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestSpring {
	public static void main(String[] args) {
		ApplicationContext cxt=new ClassPathXmlApplicationContext("beans.xml");
		Scanner sc=new Scanner(System.in);
		int c=0;
		Employee ee=(Employee)cxt.getBean("employee");
		EmployeeService es=(EmployeeService)cxt.getBean("service");
		
		do
		{
			System.out.println("********Employee Management System*******");
			System.out.println("1)Add 2)Delete by Id 3)DisplayAll 4)Update by Id 5)Exit");
			 c=sc.nextInt();
			switch(c)
			{
			case 1:
				System.out.println("*******Performing insert*****");
				System.out.println("Enter id\n");
				ee.setId(sc.nextInt());
				System.out.println("Enter name\n");
				ee.setName(sc.next());
				System.out.println("Enter salary\n");
				ee.setSalary(sc.nextDouble());
				System.out.println("Enter Designation\n");
				ee.setDesignation(sc.next());
				es.add(ee);
				System.out.println("*****Employee Information Stored Successfully******");
				break;
			case 2:
				System.out.println("*******Performing Delete*****");
				System.out.println("Enter id\n");
				ee.setId(sc.nextInt());
				es.delete(ee);
				System.out.println("*****Employee deleted successfully******");
				break;
			case 3:
				System.out.println("*******Display All Information*****");
				List<Employee> elist = es.getEmployee();
				for(Employee e : elist) {
					System.out.println(e.getId()+ " "+e.getName()+" "+e.getSalary()+" "+e.getDesignation());
				}
					System.out.println("*******And many more based on number of records in a table*****");
				

				break;
			case 4:
				int ch;
				
				System.out.println("*******Update Information*****");
				System.out.println("Enter id\n");
				ee.setId(sc.nextInt());
				es.add(ee);
				
				 
				 do
					{
					 ch=sc.nextInt();
				
					System.out.println("1 name 2 salary 3 Designations 4 Exit");
				switch(ch)
				{
				case 1:
					System.out.println("Enter name\n");
					ee.setName(sc.next());
					es.update(ee);
					break;
				case 2:	
					System.out.println("Enter salary\n");
					ee.setSalary(sc.nextDouble());
					es.update(ee);
					break;
				case 3:
					System.out.println("Enter Designation\n");
					ee.setDesignation(sc.next());
					es.update(ee);
					break;
				case 4:
					System.out.println("Exit");
				}
				}while(ch!=4);
				break;
			case 5:
				
				System.out.println("Exit");
			
				
				
			}
			
		}while(c!=5);
		
		
		

		
	}

}
