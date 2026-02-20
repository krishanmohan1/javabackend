package com.capg.lamda;

interface Person2{
	public void eat();
}

public class Lambda2Prog {
	
//	public static void main(String[]  args) {
//		Person2 p2 = new Person2() {
//			public void eat() {
//				System.out.println("Rich Food");
//			}
//		};
//		p2.eat();
//	}
	
	
	public static void main(String[]  args) {
		Person2 p2 =() -> System.out.println("Rich Food");
			
		p2.eat();
	}
	

}
