package com.gqt.encapsulation;
class member {
    private String name;
    private int rollNumber;
    private int age;
    
public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class example7{
 public static void main(String[] args) {
     
     Student s1 = new Student();

     
     s1.setName("Alice");
     s1.setRollNumber(101);
     s1.setAge(21);

    
     System.out.println("Student Details:");
     System.out.println("Name: " + s1.getName());
     System.out.println("Roll Number: " + s1.getRollNumber());
     System.out.println("Age: " + s1.getAge());
 }
}

