package com.example.scheduler.domain.source;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class AdminFunction {

	@Column(name = "FUNC_ID")
	private Integer funcId;

	@Column(name = "FUNC_NAME")
	private String funcName;

	@Column(name = "FUNC_CODE")
	private String funcCode;

	public Integer getFuncId() {
		return funcId;
	}

	public void setFuncId(Integer funcId) {
		this.funcId = funcId;
	}

	public String getFuncName() {
		return funcName;
	}

	public void setFuncName(String funcName) {
		this.funcName = funcName;
	}

	public String getFuncCode() {
		return funcCode;
	}

	public void setFuncCode(String funcCode) {
		this.funcCode = funcCode;
	}

	public AdminFunction(Integer funcId, String funcName, String funcCode) {
		super();
		this.funcId = funcId;
		this.funcName = funcName;
		this.funcCode = funcCode;
	}

	public AdminFunction() {
		super();
		// TODO Auto-generated constructor stub
	}

}
