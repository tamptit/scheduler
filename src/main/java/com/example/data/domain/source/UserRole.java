package com.example.data.domain.source;

import jakarta.persistence.Column;

public class UserRole {
	@Column(name = "USERNAME")
	private String username;

	@Column(name = "USER_ID")
	private Integer userId;
	
	@Column(name = "USERNAME")
	private String ldapId;
	
	@Column(name = "LAST_NAME")
	private String lastname;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "GROUP_ID")
	private Integer groupId;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLdapId() {
		return ldapId;
	}

	public void setLdapId(String ldapId) {
		this.ldapId = ldapId;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public UserRole(String username, String ldapId, String lastname, String name, Integer groupId, Integer userId) {
		super();
		this.username = username;
		this.ldapId = ldapId;
		this.lastname = lastname;
		this.name = name;
		this.groupId = groupId;
		this.userId = userId;
	}

	public UserRole() {
		super();
		// TODO Auto-generated constructor stub
	}

}
