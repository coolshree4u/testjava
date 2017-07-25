package com.tution;


import java.util.*;

class MySort1 {

   public static void main(String[] args) {
        Employee e1 = new Employee("Priya", "Mumbai", 4000.0);
        Employee e2 = new Employee("Arjit", "Pune", 3000.0);
        Employee e3 = new Employee("Sam", "Delhi", 7000.0);
        Employee e4 = new Employee("Vijay", "Patna", 5000.0);

        ArrayList<Employee> e = new ArrayList<Employee>();

        e.add(e1);
        e.add(e2);
        e.add(e3);
        e.add(e4);

        //Collections.sort(e);

        System.out.println("Sorted List:");
        for (Employee e10 : e) {
            System.out.println(e10.name + "" + e10.location + "" + e10.salary);

        }

    }
}
