package com.gqt.encapsulation;
class dog1{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
	//shadowing problem
	void setData(String name,String color,String breed,int age,int cost) {
		name="name";
		color="color";
		breed="breed";
		age=9;
		cost=cost;
	}
	void getData() {
		System.out.println("Name is:"+name);
		System.out.println("Color is:"+color);
		System.out.println("breed is:"+breed);
		System.out.println("age is:"+age);	
		System.out.println("cost is:"+cost);	
	}  
}
public class example2 {

	public static void main(String[] args) {
		dog1 d1=new dog1();
		d1.setData("rocky", "white", "pug", 12,5000);
		d1.getData();

	}

}
