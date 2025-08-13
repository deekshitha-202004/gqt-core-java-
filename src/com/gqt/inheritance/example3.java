package com.gqt.inheritance;
class Human {
    void eat() {
        System.out.println("Human eats food");
    }

    void sleep() {
        System.out.println("Human sleeps at night");
    }

    void breathe() {
        System.out.println("Human breathes air");
    }
}

class Student extends Human {
    @Override
    void eat() {
        System.out.println("Student eats in the canteen");
    }

    void study() {
        System.out.println("Student studies for exams");
    }
}

class Employee extends Human {
    @Override
    void eat() {
        System.out.println("Employee eats lunch in office");
    }

    void work() {
        System.out.println("Employee works on projects");
    }
}

class Athlete extends Human {
    @Override
    void eat() {
        System.out.println("Athlete eats a healthy diet");
    }

    void exercise() {
        System.out.println("Athlete trains every day");
    }
}

public class example3 {
    public static void main(String[] args) {
        Student st = new Student();
        Employee emp = new Employee();
        Athlete ath = new Athlete();

        st.eat();
        st.sleep();
        st.breathe();
        st.study();
        System.out.println("----------------");

        emp.eat();
        emp.sleep();
        emp.breathe();
        emp.work();
        System.out.println("----------------");

        ath.eat();
        ath.sleep();
        ath.breathe();
        ath.exercise();
    }
}

