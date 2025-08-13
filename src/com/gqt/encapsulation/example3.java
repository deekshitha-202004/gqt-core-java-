package com.gqt.encapsulation;
class dog2{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
	//shadowing problem
	void setData(String name,String color,String breed,int age,int cost) {
		this.name="name";
		this.color="color";
		this.breed="breed";
		this.age=9;
		this.cost=cost;
	}
	void getData() {
		System.out.println("Name is:"+name);
		System.out.println("Color is:"+color);
		System.out.println("breed is:"+breed);
		System.out.println("age is:"+age);	
		System.out.println("cost is:"+cost);	
	}  
}
public class example3 {

	public static void main(String[] args) {
		dog2 d2=new dog2();
		d2.setData("rocky", "white", "pug", 12,5000);
		d2.getData();


	}

}
