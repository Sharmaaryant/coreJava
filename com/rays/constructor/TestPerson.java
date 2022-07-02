package com.rays.constructor;

public class TestPerson {

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person("ggggg", 25);
		System.out.println(p3.getName() + " " + p3.getAge());

	}

}
