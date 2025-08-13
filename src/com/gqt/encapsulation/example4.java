package com.gqt.encapsulation;
class dog3{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}	
}
public class example4 {

	public static void main(String[] args) {
		dog3 d1=new dog3();
		d1.setName("charle");
		d1.setColor("green");
		d1.setBreed("gr");
		d1.setAge(9);
		d1.setCost(5000);
		System.out.println("Name is:"+d1.getName());
		System.out.println("Color is:"+d1.getColor());
		System.out.println("breed is:"+d1.getBreed());
		System.out.println("age is:"+d1.getAge());	
		System.out.println("cost is:"+d1.getCost());	
	}  

	}


