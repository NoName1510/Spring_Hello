package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Account acc1 = (Account) context.getBean("account1");
        Account acc2 = (Account) context.getBean("account2");

        System.out.println("Data of acccount 1");
        System.out.println("id " + acc1.getId());
        System.out.println("name " + acc1.getOwnerName());
        System.out.println("balance " + acc1.getBalance());


        System.out.println("Data of acccount 2");
        System.out.println("id " + acc2.getId());
        System.out.println("name " + acc2.getOwnerName());
        System.out.println("balance " + acc2.getBalance());
    }
}