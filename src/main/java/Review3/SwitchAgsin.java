import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.println("Enter your mobile number");
        String inputNumber = sc.nextLine();
        inputNumber.matches("\\d{3}-\\d{3}-\\d{4}");
        System.out.println(inputNumber);

        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println(age);

        System.out.println("Your name is "+" "+name+", "+"your age is " +age+" "+"and your number is "+inputNumber);


    }
}

