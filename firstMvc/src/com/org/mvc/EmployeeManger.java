package com.org.mvc;

import java.util.ArrayList;

public class EmployeeManger {

	EmployeeDAO employee=new EmployeeDAO();
	
	   public ArrayList getEmployee()
	   {
		  return generateEmployees();
		   
		   
	   }
	   private ArrayList generateEmployees(){

			ArrayList empList = new ArrayList();
			empList =employee.getCustmInfo();
			return empList;
		}
   }
