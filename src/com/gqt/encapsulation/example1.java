package com.gqt.encapsulation;
class Lion{
	private String name;
	private String color;
	private String country;
	private int age;
	
	void setData1() {
		name="kiran";
		color="yellow";
		country="Africa";
		age=9;
	}
	void setData2(String a,String b,String c,int d) {
		name=a;
		color=b;
		country=c;
		age=d;
	}
	void getData() {
		System.out.println("Name is:"+name);
		System.out.println("Color is:"+color);
		System.out.println("Country is:"+country);
		System.out.println("age is:"+age);	
	}
}
public class example1 {

	public static void main(String[] args) {
		Lion l1=new Lion();
	//	l1.name="ramu";//private members cannot be accessed outside the class
	//	l1.color="White";//private members cannot be accessed outside the class
	//	l1.country="India";//private members cannot be accessed outside the class
	//	l1.age=7;//private members cannot be accessed outside the class
		l1.setData1();
		l1.getData();
		System.out.println("            ");
		l1.setData2("deekshitha","white" ,"nellore", 14);
		l1.getData();
	}
	}


