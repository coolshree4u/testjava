package com.test;

public class Employee {
    public int employeeID;
    public String firstName,lastName;
    public int telephone;
    
    public int hashCode()
    {
        return employeeID;
    }
    public boolean equals(Employee e)
    {
        return this.employeeID==e.employeeID;
    }
    public static void main(String[] args) {
        Employee one =new Employee();
        one.employeeID=101;
        Employee two=new Employee();
        two.employeeID=101;
        if(one.equals(two))
        {
            System.out.println("Success");
        }else
            System.out.println("Failure");
    }
    
}





