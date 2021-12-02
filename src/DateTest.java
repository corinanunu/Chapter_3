package Task3_14;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        //////////////////////////////// test constructor with variables
        Date date1 = new Date(12, 5, 2020);
        Date date2 = new Date(3, 23, 2021);

        System.out.print("The first date is: ");
        date1.displayDate();
        System.out.print("The second date is: ");
        date2.displayDate();

        System.out.println();
        /////////////////////////////////// test the empty contructor()
        Date date3 = new Date();
        Scanner input = new Scanner(System.in);

        System.out.print("Get month: ");
        int month = input.nextInt();
        date3.setMonth(month);

        System.out.print("Get day: ");
        int day = input.nextInt();
        date3.setDay(day);

        System.out.print("Get year: ");
        int year = input.nextInt();
        date3.setYear(year);

        System.out.print("The third date is ");
        date3.displayDate();

    }
}