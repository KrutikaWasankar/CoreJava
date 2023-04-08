package com.singleinheritance;

//singale leval inheritance

class Animal1 {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog1 extends Animal1 {
	void bark() {
		System.out.println("barking...");
	}
}

class Single3 {
	public static void main(String args[]) {
		Dog1 c = new Dog1();
		c.bark();
		c.eat();
	}
}
