package com.auth.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.auth.entity.LoginHistory;
import com.auth.entity.Users;
import com.auth.service.LoginHistoryService;
import com.auth.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@Autowired
	private LoginHistoryService loginHistoryService;
	
	public UserController() {
		System.out.println("UserController()");
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	Users create(@RequestBody Users user) {
		return userService.createUser(user);
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	void delete(@PathVariable("id") int id) {
		userService.deleteUser(id);
	}

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	List<Users> findAll() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	Users create() {
		long id = userService.getMaxId();
		id = id <= 0 ? 1 : id+1;
		Users user = new Users(id,"firstName","secondName","password");
		user = userService.createUser(user);
		System.out.println( "User created");
		LoginHistory history = new LoginHistory();
		long historyId = loginHistoryService.getMaxId();
		historyId = historyId <= 0 ? 1 : historyId +1;
		history.setHistoryId( historyId );
		System.out.println( "get History Id --> " + history.getHistoryId() );
		history.setId(user.getId());
		try {
			history.setIpAddress( InetAddress.getLocalHost().toString() );
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		history.setLoginTimeStamp( Calendar.getInstance().getTime() );
		System.out.println( "History time-->"+history.getLoginTimeStamp() );
		loginHistoryService.createHistory(history);
		System.out.println( "History created");
		
		return user;
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	Users findById(@PathVariable("id") int id) {
		return userService.getUser(id);
	}
	
	@RequestMapping(value = "/authentication/{id}/{password}", method = RequestMethod.GET)
	Users authenticateUser(@PathVariable("id") int id, @PathVariable("password") String password) {
		Users user = userService.getUser(id);
		if ( password.equalsIgnoreCase( user.getPassword() )  ) {
			System.out.println( "***************** User AUTHENTICATED SUCCESSFULLY *****************" );
			return user;
		}
		
		System.err.println( "********** AUTHENTICATION FAILED *******************" );
		
		return null;
	}

	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	Users update(@RequestBody Users user) {
		return userService.updateUser(user);
	}
	
	@RequestMapping(value = "/createloginhistory", method = RequestMethod.PUT)
	LoginHistory update(@RequestBody LoginHistory history) {
		return loginHistoryService.createHistory(history);
	}

}
