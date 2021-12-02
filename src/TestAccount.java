package Task3_11;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Greeen", 50.00);
        Account account2 = new Account("John Blue", -4.77);

        System.out.printf("%s balance : $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance : $%.2f%n", account2.getName(), account2.getBalance());
        System.out.println("");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1 : ");
        double depositAMount1 = input.nextDouble();
        account1.deposit(depositAMount1);
        System.out.printf("%s balance : $%.2f%n", account1.getName(), account1.getBalance());
        System.out.println("");

        System.out.print("Enter deposit amount for account2 : ");
        double depositAmount2 = input.nextDouble();
        account2.deposit(depositAmount2);
        System.out.printf("%s balance : $%.2f%n", account2.getName(), account2.getBalance());
        System.out.println("");

        System.out.print("Enter widrow amount for account1 : ");
        double widrowAmount1 = input.nextDouble();
        account1.widrow(widrowAmount1);
        System.out.printf("%s balance : $%.2f%n", account1.getName(), account1.getBalance());
        System.out.println("");

        System.out.print("Enter widrow amount for account1 : ");
        double widrowAmount2 = input.nextDouble();
        account2.widrow(widrowAmount2);
        System.out.printf("%s balance : $%.2f%n", account2.getName(), account2.getBalance());
        System.out.println("");
    }
}

