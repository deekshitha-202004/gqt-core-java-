package com.gqt.inheritance;

class Animal{
	public Animal() {
		super();
		System.out.println("Animal zero parameterized constructor is invoked");	
}
public Animal (String message) {
	super();
	System.out.println("Animal parameterized constructor is invoked");
	System.out.println("the Animal constructor has received the message as:"+message);
}
}
class elephant extends Animal{
	String name;
	double weight;
	public elephant() {
		super("Hello from Elephant");
		System.out.println("Hi from Elephant constructor");
	}
	public elephant (String name,double weight) {
		super();
		this.name=name;
		this.weight=weight;
		System.out.println(this.name);
		System.out.println(this.weight);
	}
}


public class example1 {

	public static void main(String[] args) {
		elephant e=new elephant();
		System.out.println("-----------");
		elephant e1=new elephant("Arjuna",5600);	
	}
	}




