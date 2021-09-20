package com.company;

public class Dealership {

    public static void main(String[] args){

        Customer cust1 = new Customer();
        cust1.name ="Thad";
        cust1.address = "124 IDK Lane";
        cust1.cashOnHand = 35000;

        Employee emp1 = new Employee("John");
        Vehicle car1 = new Vehicle("Lexus","ES350", 2016,26000);

        cust1.purchaseCar(car1,emp1,true);

    }

}
