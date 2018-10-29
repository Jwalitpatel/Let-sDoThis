package com.company;

public class BankAccount {

    private long accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    //constructor
    public BankAccount(){
        //Using this to call another constructer we NEED TO KEEP IN MIND THAT make suer that its executed in very fist line
        //this is wrong//System.out.println("Empty constructor called");
        this(654654L, 2000, "Jwalit", "sdjf@asdfa.com", 456878945L);
        System.out.println("Empty constructor called");

    }

    //constructor can be overloaded
    public BankAccount(long accountNumber, int balance, String customerName, String email, long phoneNumber){
        System.out.println("Accout constructor with parameter called");
        this.accountNumber = accountNumber;
        //setPhoneNumber(phoneNumber);// won't always work
        this.balance= balance;// this is better way
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, long phoneNumber) {
        this(8798494654L, 100, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

//    public void setAccountNumber(long accountNumber){
//
//        this.accountNumber = accountNumber;
//
//    }

    public long getAcc ountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance){

        this.balance = balance;

    }

    public int getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName){

        this.customerName= customerName;

    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email){

        this.email= email;

    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(long phoneNumber){

        this.phoneNumber= phoneNumber;

    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void deposit(int amt){
        this.balance += amt;
        System.out.println("New balance is " + balance);

    }

    public void withdraw(int amt){
        if(this.balance >= amt) {
            this.balance = balance - amt;
            System.out.println("New balance is " + balance);
        }else{
            System.out.println("Insufficient fund");
        }
    }




}

