package com.duyi.domian;

import com.duyi.annotation.MyAnnotation;
import com.duyi.annotation.MyAnnotation1;

@MyAnnotation("user")
public class User {
	@MyAnnotation1(columnName = "name", type = "varchar", length=10)
	private String name;
	@MyAnnotation1(columnName = "age", type = "int", length=10)
	private Integer age;
	@MyAnnotation1(columnName = "sex", type = "int", length=10)
	private String sex;
	
	public User() {
	}
	
	public User(String name, Integer age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return "User{" + "name='" + name + '\'' + ", age=" + age + ", sex='" + sex + '\'' + '}';
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
}
