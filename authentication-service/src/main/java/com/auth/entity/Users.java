package com.auth.entity;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("users")
public class Users {

	@PrimaryKey("id")
	private long id;

	@Column("firstName")
	private String firstName;

	@Column("lastName")
	private String lastName;

	@Column("password")
	private String password;

	public Users() {
		super();
	}

	public Users(long id, String firstName, String lastName, String password) {
		super();

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString() {
        return "Users [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
                + ", password=" + password + "]";
    }   
	

}
