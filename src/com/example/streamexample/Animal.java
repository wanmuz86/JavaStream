package com.example.streamexample;

public class Animal {
	
	private String name;
	private int age;
	private String type;
	
	
	public Animal(String name, int age, String type) {
		// the keyword super means if this class inherit another class
		// it will call the constructor of the parent class first
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	
	

}
