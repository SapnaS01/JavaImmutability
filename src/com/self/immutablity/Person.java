package com.self.immutablity;

import java.util.ArrayList;
import java.util.List;

public final class Person {
	private final String name;
	private final int age;
	private final List<String> hobbies;
	
	public Person( String name,int age, List<String> hobbies) {
		this.name=name;
		this.age=age;
		// Defensive copy to avoid external modification
		this.hobbies= new ArrayList<String>(hobbies);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public List<String> getHobbies(){
		// Return a defensive copy to preserve immutability
		return new ArrayList<String>(hobbies);
	}

}
