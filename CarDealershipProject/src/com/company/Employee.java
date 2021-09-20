package com.company;

public class Employee {

        String empName;

    public Employee(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                '}';
    }

    public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle){
            if(finance == true){
                double loanAmount = (vehicle.price - customer.cashOnHand);
                runCreditHistory(customer, loanAmount);
            } else if (vehicle.getPrice() <= customer.getCashOnHand()){
                System.out.println("Customer paid in cash!");
            } else {
                System.out.println("Customer needs more money.");
            }
        }

    public void runCreditHistory(Customer cust, double loanAmount){
        System.out.println("Ran credit history. Customer has been approved!");
    }

}
