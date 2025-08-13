package com.gqt.corejava.practice;

import java.util.Scanner;

class Student {
    String name;
    int age;
}

public class datatype20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Student();
            System.out.print("Name: ");
            arr[i].name = sc.next();
            System.out.print("Age: ");
            arr[i].age = sc.nextInt();
        }
        for (Student s : arr) {
            System.out.println(s.name + " " + s.age);
        }
    }
}
