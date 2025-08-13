package com.gqt.encapsulation;
class Student {
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


public class example6 {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Setting values
        s1.setName("John");
        s1.setRollNumber(101);
        s1.setAge(20);

        // Getting values
        System.out.println("Name: " + s1.getName());
        System.out.println("Roll Number: " + s1.getRollNumber());
        System.out.println("Age: " + s1.getAge());
    }
}

