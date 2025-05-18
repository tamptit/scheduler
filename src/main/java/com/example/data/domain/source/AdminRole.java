package com.example.data.domain.source;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;


public class AdminRole {

	@Id
	@Column(name = "ROLE_ID")
	private Integer roleId;
	
	@Column(name = "ROLE_NAME")
	private String roleName;
	
	@Column(name = "NOTE")
	private String note;
	
	@Column(name = "LAST_UPDATE")
	private Date lastUpdate;
	
	@Column(name = "ADMIN")
	private Integer admin;
	
	@Column(name = "QTCT")
	private Integer qtct;
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public Integer getAdmin() {
		return admin;
	}
	public void setAdmin(Integer admin) {
		this.admin = admin;
	}
	public Integer getQtct() {
		return qtct;
	}
	public void setQtct(Integer qtct) {
		this.qtct = qtct;
	}
	public AdminRole(Integer roleId, String roleName, String note, Date lastUpdate, Integer admin, Integer qtct) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.note = note;
		this.lastUpdate = lastUpdate;
		this.admin = admin;
		this.qtct = qtct;
	}
	public AdminRole() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
