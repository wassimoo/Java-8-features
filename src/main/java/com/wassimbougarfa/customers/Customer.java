package com.wassimbougarfa.customers;

/**
 * Custommer data representation
 */
public class Customer {

    public String firstName;
    public String lasName;
    public String email;
    public String gender;

    private String lastIPAdress;
    public String city;
    public String state;

    private float totalPurshased;
    private int monthsCustomer;

    Customer(String firstName, String lastName, String email, String gender) {
        this.firstName = firstName;
        this.lasName = lastName;
        this.email = email;
        this.gender = gender;

        this.totalPurshased = 0;
        this.monthsCustomer = 0;
    }

    /************************ Getters and Setter *************************/
    public String getLastIPAdress() {
        return lastIPAdress;
    }

    public void setLastIPAdress(String lastIPAdress) {
        this.lastIPAdress = lastIPAdress;
    }

    public int getMonthsCustomer() {
        return monthsCustomer;
    }

    public void setMonthsCustomer(int monthsCustomer) {
        this.monthsCustomer = monthsCustomer;
    }

    public float getTotalPurshased() {
        return totalPurshased;
    }

    public void setTotalPurshased(float totalPurshased) {
        this.totalPurshased = totalPurshased;
    }

    public void addtoTotalPurshased(float amount) {
        this.totalPurshased += amount > 0 ? amount : 0;
    }
    /************************ Getters and Setter *************************/

}