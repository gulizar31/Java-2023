package Pro2CodingTask;

public class Task5 {

    public static void main(String[] args) {
 //Write a program to swap 2 numbers without a temporary variable?

        int x = 9;
        int y = 6;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping:" + " x = " + x + ", y = " + y);
    }
}



