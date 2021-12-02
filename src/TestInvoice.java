package Task3_12;

import java.util.Scanner;

public class TestInvoice {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("010101", "Piece1", 3, 24.6);
        Invoice invoice2 = new Invoice("020202", "Piece2", 5, 44.6);

        Invoice invoice3 = new Invoice();

        System.out.println("--------------------------------------");
        System.out.printf("| Id Item = %s%n| Description = %s%n| Quantity = %d%n| Price = %.2f%n",
                invoice1.getIdItem(), invoice1.getDescription(), invoice1.getQuantity(),
                invoice1.getPrice());
        invoice1.getInvoiceAmount();
        System.out.println("----------------");
        System.out.printf("| Final price is : $%.2f%n", invoice1.getPrice());
        System.out.println("---------------------------------------");
        System.out.println("");


        System.out.println("--------------------------------------");
        System.out.printf("| Id Item = %s%n| Description = %s%n| Quantity = %d%n| Price = %.2f%n",
                invoice2.getIdItem(), invoice2.getDescription(), invoice2.getQuantity(),
                invoice2.getPrice());
        invoice1.getInvoiceAmount();
        System.out.println("----------------");
        System.out.printf("| Final price is : $%.2f%n", invoice2.getPrice());
        System.out.println("---------------------------------------");
        System.out.println("");

        //////////////////////////////////////
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Id = ");
        String idItem = input.nextLine();
        invoice3.setIdItem(idItem);

        System.out.print("Enter the Description = ");
        String description = input.nextLine();
        invoice3.setDescription(description);

        System.out.print("Enter the quantity = ");
        int quantity = input.nextInt();
        invoice3.setQuantity(quantity);

        System.out.print("Enter the price = ");
        double price = input.nextDouble();
        invoice3.setPrice(price);
        //invoice3.getInvoiceAmount();

        System.out.println("--------------------------------------");
        System.out.printf("| Id Item = %s%n| Description = %s%n| Quantity = %d%n| Price = %.2f%n",
                invoice3.getIdItem(), invoice3.getDescription(), invoice3.getQuantity(),
                invoice3.getPrice());
        invoice3.getInvoiceAmount();
        System.out.println("----------------");
        System.out.printf("| Final price is : $%.2f%n", invoice3.getPrice());
        System.out.println("---------------------------------------");
        System.out.println("");

    }
}