package com.capg.lamda;

public class lambdas  {

	
//	public static void main(String[] args) {
//		Person p1 = new Person() {		// annonymous inner class
//			public void eat() {
//				System.out.println("Good Eating");
//			}
//		};
//		
//		p1.eat();
//	}
	

	public static void main(String[] args) {
		Person p1 = () ->  System.out.println("Good Eating");
		
		p1.eat();
	}
	

}
