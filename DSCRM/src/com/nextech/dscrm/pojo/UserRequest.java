package com.nextech.dscrm.pojo;

import java.sql.Timestamp;

public class UserRequest {
	private int id;
	private String name;
	private String mobile;
	private String email;
	private String requirementDescription; 
	private Timestamp requestUpdateTime;
	private Timestamp requesTtime;
	private int requestStatus;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRequirementDescription() {
		return requirementDescription;
	}
	public void setRequirementDescription(String requirementDescription) {
		this.requirementDescription = requirementDescription;
	}
	public Timestamp getRequestUpdateTime() {
		return requestUpdateTime;
	}
	public void setRequestUpdateTime(Timestamp requestUpdateTime) {
		this.requestUpdateTime = requestUpdateTime;
	}
	public int getRequestStatus() {
		return requestStatus;
	}
	public void setRequestStatus(int requestStatus) {
		this.requestStatus = requestStatus;
	}
	public Timestamp getRequesTtime() {
		return requesTtime;
	}
	public void setRequesTtime(Timestamp requesTtime) {
		this.requesTtime = requesTtime;
	}
	
}
