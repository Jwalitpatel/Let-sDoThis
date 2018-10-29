package com.company;

import java.awt.image.VolatileImage;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount Jwalit = new BankAccount();//1235465478L,5000, "Jwalit","jjsdh@kjdhf.com",789456123L);
        System.out.println(Jwalit.getCustomerName(), Jwalit.g);
// System.out.println(Jwalit.getAccountNumber());
//        System.out.println(Jwalit.getBalance());
//        System.out.println(Jwalit.getEmail());
//        System.out.println(Jwalit.getPhoneNumber());
//        System.out.println(Jwalit.getCustomerName());

        BankAccount Viiki = new BankAccount("Jwlait", "adf@asdf.com", 7894564654L);
        System.out.println(Viiki.getAccountNumber() + "is " + Viiki.getCustomerName());
        System.out.println("current balance is " + Viiki.getBalance());
        Viiki.withdraw(150);

// Jwalit.setCustomerName("Jwalit Patel");
//        System.out.println(Jwalit.getCustomerName());
//        Jwalit.setAccountNumber(4578845842L);
//        System.out.println(Jwalit.getAccountNumber());
//        Jwalit.setEmail("jwalit12@ymail.com");
//        System.out.println(Jwalit.getEmail());
//        Jwalit.setPhoneNumber(9879874565L);
//        System.out.println(Jwalit.getPhoneNumber());
//        Jwalit.setBalance(5000);
//        System.out.println(Jwalit.getBalance());

        //Jwalit.deposit(2000);
        //Jwalit.withdraw(1000);
    }
}
