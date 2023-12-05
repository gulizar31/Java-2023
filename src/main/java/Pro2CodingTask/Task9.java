package Pro2CodingTask;

public class Task9 {

    public static void main(String[] args) {
        //Write a java program to find the second largest number in the array?
        int[] number = {4, 94, 90, 24, 22, 31};

        int largestNumber = 0;
        int secondLargest = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > largestNumber) {
                secondLargest = largestNumber;
                largestNumber = number[i];
            }
        }

        System.out.println("Largest number is " + largestNumber);
        System.out.println("Largest number is " + secondLargest);

    }
}



