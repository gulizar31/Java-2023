package Class5;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        //Ask user to enter a number and then categorize if number is small, medium or large
        //Small number is value between 1 and 10
        //Medium number is value between 11 and 100
        //Large number is value between 101 and 1000

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1-24");

        int number =sc.nextInt();

        if (number >= 1 && number <= 11) {
            System.out.println("Morning");
        } else if (number >= 12 && number <= 15) {
            System.out.println("Afternoon");
        } else if (number >= 16 && number <= 20) {
            System.out.println("Evening");
        } else if (number >= 21 && number <= 24) {
            System.out.println("Night");
        } else {
            System.out.println("Invalid");
        }
    }

}
