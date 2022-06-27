package com.knoldus.java.lambdaStream;

/**
 * Employee class points the employee having
 * different entities like age,name,sureName
 *
 * @author Shashikant
 * @version 1.0
 * @see Employee
 */
public class Employee {
    private int age;
    private String name;
    private String sureName;
    private double salary;

    /**
     *  The method used for creating the biodata of an employee.
     *
     * @param age employee's age
     * @param name employee's name
     * @param sureName employee's surname
     * @param salary employee's salary
     */
    public Employee(final int age, final String name, final String sureName, final double salary) {
        this.age = age;
        this.name = name;
        this.sureName = sureName;
        this.salary = salary;
    }

    /**
     * default constructor
     */
    public Employee() {
    }
    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }
    public Double getSalary() {
        return salary;
    }

    /**
     *
     * @param salary
     */
    public void setSalary(final Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
