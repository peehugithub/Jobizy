package com.intern.peehu;

public class EmployeeInfo {
    private String skills;

    // string variable for storing
    // employee contact number
    private String contactNumber;

    // string variable for storing
    // employee address.
    private String freeText;

    // an empty constructor is
    // required when using
    // Firebase Realtime Database.
    public EmployeeInfo() {

    }

    // created getter and setter methods
    // for all our variables.
    public String getSkills() {
        return skills;
    }

    public void setEmployeeName(String employeeName) {
        this.skills = employeeName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setEmployeeContactNumber(String employeeContactNumber) {
        this.contactNumber = employeeContactNumber;
    }

    public String getFreeText() {
        return freeText;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.freeText = employeeAddress;
    }
}

