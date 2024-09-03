package com.evergent.corejava.collection.abhi.task3;


public class Member {
    private String memberId;
    private String name;
    private int age;
    private double planCost;

    // Constructor for easy initialization
    public Member(String memberId, String name, int age, double planCost) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
        this.planCost = planCost;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPlanCost() {
        return planCost;
    }

    public void setPlanCost(double planCost) {
        this.planCost = planCost;
    }

    // Override toString for better display
    @Override
    public String toString() {
        return "Member ID: " + memberId + ", Name: " + name + ", Age: " + age + ", Plan Cost: $" + planCost;
    }
}

