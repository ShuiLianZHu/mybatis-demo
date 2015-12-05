package com.caizk.mybatis.entity;

public class User {

	private Long userId;
	private String username;
	private String phone;
	private String address;
	private String remark;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [userId=");
		builder.append(userId);
		builder.append(", username=");
		builder.append(username);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", address=");
		builder.append(address);
		builder.append(", remark=");
		builder.append(remark);
		builder.append("]");
		return builder.toString();
	}
	
	
}
