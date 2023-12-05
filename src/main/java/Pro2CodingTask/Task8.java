package Pro2CodingTask;

public class Task8 {
    public static void main(String[] args) {
 //8. Maximum and minimum number in the array?
        int[] number = {9, 94, 23, 90, 3, 24};

        int max = number[0];
        int min = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
            if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
    }
}



