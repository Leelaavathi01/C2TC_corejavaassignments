package com.leelaavathi.assignment_demo;

public class Magazine extends Item {
    private int issueNumber;

    public Magazine(int id, String title, int issueNumber) {
        super(id, title);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine: [ID: " + issueNumber + ", Title: " + getTitle() + ", Issue: " + issueNumber + "]");
    }

    @Override
    public String toString() {
        return getTitle() + " Issue " + issueNumber;
    }
}