package com.bridgelaz;

import java.util.Scanner;

public class AccountProblem2 {
    long balance = 9111;
    public long debitFromAccount(int amount){
        if(balance>=amount){
            balance = balance-amount;
            System.out.println("Money debited successfully.");
            return balance;
        }else {
            System.out.println("Debit amount is exceeding account balance. ");
            return balance;
        }

    }
}
class TestMethodDebit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountProblem2 account = new AccountProblem2();
        int amount;
        do{
            System.out.println("Enter the debit amount : ");
            amount = scanner.nextInt();
            long balance = account.debitFromAccount(amount);
            System.out.println("Your account balance is : " + balance);
        }while (amount>=account.balance);
     }
}
