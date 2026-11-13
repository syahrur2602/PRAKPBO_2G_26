package Jobsheet10.Percobaan5;

import Jobsheet10.Percobaan1.Customer;
import Jobsheet10.Percobaan1.InsufficientBalanceException;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Nadia", "0812-0000-0001");
        Customer c2 = new Customer("Sari", "0812-0000-0002");
        Customer c3 = new Customer("Rian", "0812-0000-0003");

        SavingsAccount acc1 = new SavingsAccount("A001", c1, 500000, 0.01);
        CheckingAccount acc2 = new CheckingAccount("A002", c2, 200000, 50000);
        SavingsAccount acc3 = new SavingsAccount("A003", c3, 100000, 0.02);

        try {
            acc3.withdraw(70000);
            System.out.println("Withdrawal succeeded, new balance: " + acc3.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }

        try {
            acc3.withdraw(30000);
            System.out.println("Withdrawal succeeded, new balance: " + acc3.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }

        Bank bank = new Bank();

        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);

        bank.processMonthEnd();

        bank.printHistory("A003");
    }
}