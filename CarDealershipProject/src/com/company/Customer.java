package com.company;

public class Customer {

    String name;
    String address;
    double cashOnHand;


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cashOnHand=" + cashOnHand +
                '}';
    }

    public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance){
        employee.handleCustomer(this,finance,vehicle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }
}
