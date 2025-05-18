package com.example.scheduler.domain.source;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class AdminRoleFunction {

	@Id
	@Column(name = "ROLE_ID")
	private Integer roleId;
	
	@Column(name = "FUNC_ID")
	private Integer funcId;

	public AdminRoleFunction(Integer roleId, Integer funcId) {
		super();
		this.roleId = roleId;
		this.funcId = funcId;
	}

	public AdminRoleFunction() {
		super();
		// TODO Auto-generated constructor stub
	}

}
