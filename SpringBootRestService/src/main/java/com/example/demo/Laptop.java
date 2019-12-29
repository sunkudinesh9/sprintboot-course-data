package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
	private String name;
	private int ramCapacity;
	private int hdCpacity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRamCapacity() {
		return ramCapacity;
	}

	public void setRamCapacity(int ramCapacity) {
		this.ramCapacity = ramCapacity;
	}

	public int getHdCpacity() {
		return hdCpacity;
	}

	public void setHdCpacity(int hdCpacity) {
		this.hdCpacity = hdCpacity;
	}
	
	public void showLap() {
		System.out.println(name);
		System.out.println(ramCapacity);
		System.out.println(hdCpacity);
	}

}
