package Class4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Please enter the amount required");
        Scanner sc=new Scanner(System.in);
        double loanAmount=sc.nextDouble();
        if (loanAmount<=200000) {
            System.out.println("you can get this loan");
        }else{
            System.out.println("This amount cant be given");
        }




    }
}
