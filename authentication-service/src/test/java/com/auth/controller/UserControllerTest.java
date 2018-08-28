package com.auth.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.auth.entity.Users;

public class UserControllerTest {

	static final String URL_CREATE_EMPLOYEE = "http://localhost:8762/users/";
	public static void main(String[] args) {
		Users newEmployee = new Users(1, "E11", "Tom", "Cleck");
		RestTemplate restTemplate = new RestTemplate();
		 
        // Data attached to the request.
        HttpEntity<Users> requestBody = new HttpEntity<>(newEmployee);
 
        // Send request with POST method.
        ResponseEntity<Users> result 
             = restTemplate.postForEntity(URL_CREATE_EMPLOYEE, requestBody, Users.class);
 
        System.out.println("Status code:" + result.getStatusCode());
        // Code = 200.
        if (result.getStatusCode() == HttpStatus.OK) {
            Users e = result.getBody();
            System.out.println("(Client Side) Employee Created: "+ e.getId());
        }
	}

}
