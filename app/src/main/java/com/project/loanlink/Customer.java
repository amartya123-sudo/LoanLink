package com.project.loanlink;

public class Customer {
    private String id;
    private String name;
    private String email;
    private double salary, expenses;
    private String address;



    public Customer(String id, String name, String email, double salary, double expenses, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.expenses = expenses;
        this.address = address;

    }

    // Getters and Setters for the properties
    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }
}

