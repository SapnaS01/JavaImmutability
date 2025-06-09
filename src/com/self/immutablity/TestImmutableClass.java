package com.self.immutablity;

import java.util.Arrays;

public class TestImmutableClass {

	public static void main(String[] args) {
		Person person= new Person("abc",25,Arrays.asList("Travelling","Reading"));
		
		System.out.println("Name:"+person.getName());
		System.out.println("Age:"+person.getAge());
		System.out.println("Hobbies:"+person.getHobbies());
		person.getHobbies().add("Singing");
		System.out.println("Hobbies After Modification:"+person.getHobbies()); // after modification the o/p will be same as before modification

	}

}
