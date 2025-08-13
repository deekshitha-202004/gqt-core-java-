package com.gqt.constructor;  
class Dog{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	//zero parameterized constructor
	public Dog() {
		super();
		System.out.println("Inside the Zero parameterized constructor");
		this.name="Ramu";
		this.color="Brown";
		this.cost=7000;
		this.age=3;
		this.breed="Pomarian";
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("---------------");		
	}
	//one parameterized constructor
	public Dog(String name) {
		this();
		System.out.println("Inside the one parameterized constructor");
		this.name=name;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("---------------");
	}
	//Two parameterized constructor
	public Dog(String name,String color) {
		this("Chintu");
		System.out.println("Inside the two parameterized constructor");
		this.name=name;
		this.color=color;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("---------------");
	}
	//Three parameterized constructor
	public Dog(String name,String color,int cost) {
		this("Tommy"," Blue");
		System.out.println("Inside the three parameterized constructor");
		this.name=name;
		this.color=color;
		this.cost=cost;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("---------------");
	}
	//four parameterized constructor
	
	public Dog(String name,String color,int cost,int age) {
		this("Dobby"," Orange",9000);
		System.out.println("Inside the four parameterized constructor");
		this.name=name;
		this.color=color;
		this.cost=cost;
		this.age=age;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("---------------");
	}
	//five parameterized constructor
	public Dog(String name,String color,int cost,int age,String breed) {
		this("Jimmy"," Purple",7500,7);
		System.out.println("Inside the five parameterized constructor");
		this.name=name;
		this.color=color;
		this.cost=cost;
		this.age=age;
		this.breed=breed;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("---------------");
	}
	
}
public class constructorprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog("Rocky","White",8000,8,"GR");
	}

}

