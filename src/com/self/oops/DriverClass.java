package com.self.oops;

public class DriverClass {
	public static void main(String[] args) {
		Human h= new Employee();
		System.out.println(h.x);
		h.human();
//		h.emp();   can't do that coz the emp method is in the subclass and the h is the upcasted variable so using upcasted variable we can't access the properties of subclass
		Employee e= (Employee) h;  //downcasting
		System.out.println(e.x);
		System.out.println(e.y);
		e.human();
		e.emp();
		
	}

}
