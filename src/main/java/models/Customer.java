package models;

import interfaces.DataAccessCustomer;

public abstract class Customer implements DataAccessCustomer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public Customer() {
    }
    public Customer(int customerId, String firstName, String lastName, String email, String phoneNumber){
        setCustomerId(customerId);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }

    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getCustomerId(int customerId){
        return customerId;
    }
    public String getFirstName(String firstName){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer: " + customerId +
                ". '" + firstName + " " + lastName +
                "with email and number: " + email + " " + phoneNumber;
    }
}
