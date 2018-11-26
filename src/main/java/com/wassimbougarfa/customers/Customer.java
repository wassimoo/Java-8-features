package com.wassimbougarfa.customers;

/**
 * Custommer data representation
 */
public class Customer {

    public String firstName;
    public String lastName;
    public String email;
    public String gender;

    private String lastIPAdress;
    public String city;
    public String state;

    private int totalOrders;
    private float totalPurshased;
    private int monthsCustomer;

    Customer(String firstName, String lastName, String email, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;

        this.totalOrders = 0;
        this.totalPurshased = 0;
        this.monthsCustomer = 0;
    }

    Customer(String[] customerInfo) throws NumberFormatException,Exception {
        if (customerInfo.length != 10)
            throw new Exception();

        firstName = customerInfo[0];
        lastName = customerInfo[1];
        email = customerInfo[2];
        gender = customerInfo[3];

        lastIPAdress = customerInfo[4];
        city = customerInfo[5];
        state = customerInfo[6];
        
        totalOrders = Integer.parseInt(customerInfo[7]);
        totalPurshased = Float.parseFloat(customerInfo[8]);
        monthsCustomer = Integer.parseInt(customerInfo[9]);
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

    public int getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }

    public void addtoTotalOrders(int orders) {
        this.totalOrders += totalOrders > 0 ? orders : 0;
    }
    /************************ Getters and Setter *************************/

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Le client ").append(firstName).append(' ').append(lastName)
                .append(" a un total d'achats = ") .append(totalPurshased);
        return sb.toString();
    }
}