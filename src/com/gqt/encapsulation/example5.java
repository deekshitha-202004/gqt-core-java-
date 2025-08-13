package com.gqt.encapsulation;
import java.util.Scanner;
class dog4{
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
public class example5 {

	public static void main(String[] args) {
		dog4 d1=new dog4();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		d1.setName(sc.nextLine());
		System.out.println("enter the color");
		d1.setColor(sc.nextLine());
		System.out.println("enter the breed");
		d1.setBreed(sc.nextLine());
		System.out.println("enter the age");
		d1.setAge(sc.nextInt());
		System.out.println("enter the cost");
		d1.setCost(sc.nextInt());
		System.out.println("Name is:"+d1.getName());
		System.out.println("Color is:"+d1.getColor());
		System.out.println("breed is:"+d1.getBreed());
		System.out.println("age is:"+d1.getAge());	
		System.out.println("cost is:"+d1.getCost());	
	}  
}

	


