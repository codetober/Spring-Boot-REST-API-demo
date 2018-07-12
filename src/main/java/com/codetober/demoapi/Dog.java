package com.codetober.demoapi;

public class Dog {
	
	private final String name;
	private final String breed;
	private final String color;
	private final int tagNumber;
	
	public Dog(String name, String breed, String color, int tagNumber) {
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.tagNumber = tagNumber;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public String getColor() {
		return color;
	}

	public int getTagNumber() {
		return tagNumber;
	}

}
