package com.webservice.rest.provider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class StudentRestProovider {
	
	
	@GET
	@Path("/student")
	@Produces(MediaType.APPLICATION_JSON)
    public  Student getStudent(){
		System.out.println("++++++");
    	Student  stu = new Student();
    	stu.setSname("ameer");
    	stu.setSage("23");
    	
    	return stu;
    }

}
