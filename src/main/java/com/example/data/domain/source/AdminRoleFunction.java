package com.example.data.domain.source;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

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
