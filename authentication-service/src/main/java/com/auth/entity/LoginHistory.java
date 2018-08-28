package com.auth.entity;

import java.util.Date;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("login_history")
public class LoginHistory {

	@PrimaryKey("historyid")
	private long historyId;

	@Column("id")
	private long id;

	@Column("ipaddress")
	private String ipAddress;

	@Column("logintime")
	private Date loginTimeStamp;

	public LoginHistory() {
		super();
	}

	public LoginHistory(long historyId, long id, String ipAddress, Date loginTimeStamp) {
		super();

		this.historyId = historyId;
		this.id = id;
		this.ipAddress = ipAddress;
		this.loginTimeStamp = loginTimeStamp;
	}
	
	

		public long getHistoryId() {
		return historyId;
	}

	public void setHistoryId(long historyId) {
		this.historyId = historyId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Date getLoginTimeStamp() {
		return loginTimeStamp;
	}

	public void setLoginTimeStamp(Date loginTimeStamp) {
		this.loginTimeStamp = loginTimeStamp;
	}

		public String toString() {
        return "Users [historyId=" + historyId + ", id=" + id + ", ipAddress=" + ipAddress
                + ", loginTimeStamp=" + loginTimeStamp + "]";
    }   
	

}
