package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alian {
	private String name;
	private int age;
	private String occumpationn;
	@Autowired
	@Qualifier("lap1")
	private Laptop laptop;

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
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

	public String getOccumpationn() {
		return occumpationn;
	}

	public void setOccumpationn(String occumpationn) {
		this.occumpationn = occumpationn;
	}
	
	public void getAlianLap() {
		laptop.showLap();
	}

}
