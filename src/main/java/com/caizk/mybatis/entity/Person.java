package com.caizk.mybatis.entity;

public class Person {

	private String id;
	private User user;
	private String age;
	private String gender;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [id=");
		builder.append(id);
		builder.append(", user=");
		builder.append(user);
		builder.append(", age=");
		builder.append(age);
		builder.append(", gender=");
		builder.append(gender);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
