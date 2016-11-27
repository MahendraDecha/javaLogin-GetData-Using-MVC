package com.org.mvc;

public class employee {
	 private String id;
	    private String firstName;
	    private String lastName;
	    private String address;

	    public employee(String cid, String firstname, String lastname, String addrs)
	    {
	        id = cid;
	        firstName = firstname;
	        lastName = lastname;
	        address = addrs;
	    }

	    public String getAddress()
	    {
	        return address;
	    }

	    public void setAddress(String addrs)
	    {
	        address = addrs;
	    }

	    public String getFirstName()
	    {
	        return firstName;
	    }

	    public void setFirstName(String firstname)
	    {
	        firstName = firstname;
	    }

	    public String getLastName()
	    {
	        return lastName;
	    }

	    public void setLastName(String lastname)
	    {
	        lastName = lastname;
	    }

	    public String getId()
	    {
	        return id;
	    }

	    public void set_id(String cid)
	    {
	        id = cid;
	    }
	    
	    
	}
