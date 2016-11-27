package com.org.mvc;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {
	
     static Connection con = null;
     static ResultSet rs = null; 
     static  Statement st=null;
    employee empL = null;
 	String cust_id = null;
 	String cust_firstname = null;
 	String cust_lastname = null;
 	String cust_address = null;
      
     
     public static Login login(Login user)
     {
    	 con = DbConnection.getConnection();
         String username = user.getUsername();    
         String password = user.getPassword();   
         
          try{
        	  
        	  if (con != null) {
                  System.out.println("Connected with connection #1");
            }
        st=con.createStatement();
         ResultSet rs=st.executeQuery(
         "select * from employee where username='"+ username + "' AND password='" + password + "'");
         boolean status=rs.next();
         System.out.println("connection");
             if(!status)
             {  
            	 System.out.println("Sorry, you are not a registered user! Please sign up first");
                 user.setValid(false);
              } 
     	        
              else if (status) 
              {
                 String firstName = rs.getString("Name");
                 System.out.println("Welcome " + firstName);
                 user.setName(firstName);
                 user.setValid(true);
                 
              }
         }
         catch(SQLException e)
         {
        	  e.printStackTrace();
         }
         finally {
        	    if (rs != null) {
        	        try {
        	            rs.close();
        	        } catch (SQLException e) { }
        	    }
        	    if (st != null) {
        	        try {
        	            st.close();
        	        } catch (SQLException e) {}
        	    }
        	    if (con != null) {
        	        try {
        	            con.close();
        	        } catch (SQLException e) {}
        	    }
        	}
         
    	 return user;
     }
        public ArrayList getCustmInfo() {
        	
         ArrayList empList = new ArrayList();
 		  
         try {

 			con = DbConnection.getConnection();
 			st = con.createStatement();
 			rs = st.executeQuery("select id,firstname,lastname,address from emp_info");
 			  
      	  if (con != null) {
                System.out.println("Connected with connection #1");
          }
 			while (rs.next()) {
 				cust_id = rs.getString("id");
 				cust_firstname = rs.getString("firstname");
 				cust_lastname = rs.getString("lastname");
 				cust_address = rs.getString("address");
 				empL = new employee(cust_id, cust_firstname, cust_lastname,cust_address);
 				empList.add(empL);

 			}

 		} catch (SQLException ex) {
 			ex.printStackTrace();
 		}

 		catch (Exception ex) {
 			ex.printStackTrace();
 		}
 		return empList;

 	}
    }


   
