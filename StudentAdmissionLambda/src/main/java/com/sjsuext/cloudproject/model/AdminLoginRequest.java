package com.sjsuext.cloudproject.model;

public class AdminLoginRequest {

	private String httpMethod;

	private int id;

	private AdminLogin adminLogin;

	public String getHttpMethod() {
		return httpMethod;
	}

	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AdminLogin getAdminLogin() {
		return adminLogin;
	}

	public void setAdminLogin(AdminLogin adminLogin) {
		this.adminLogin = adminLogin;
	}

	@Override
	public String toString() {
		return "AdminLoginRequest [httpMethod=" + httpMethod + ", id=" + id + ", adminLogin=" + adminLogin + "]";
	}

}
