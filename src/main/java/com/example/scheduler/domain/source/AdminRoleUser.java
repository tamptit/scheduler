package com.example.scheduler.domain.source;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ADMIN_ROLE_USER")
public class AdminRoleUser {

	@Id
	@Column(name = "ROLE_ID")
	private Integer roleId;
	
	@Column(name = "USER_ID")
	private Integer userId;

	public AdminRoleUser(Integer roleId, Integer userId) {
		super();
		this.roleId = roleId;
		this.userId = userId;
	}

	public AdminRoleUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
