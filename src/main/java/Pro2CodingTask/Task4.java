package Pro2CodingTask;

public class Task4 {

    public static void main(String[] args) {
//Create a 2D array of integers. Develop a program which
//will calculate the sum of even and odd numbers for that array.

        int[][] numbers = {
                {4, 1, 67, 4, 37},
                {2, 76, 8, 34, 12}
        };

        int even = 0;
        int odd = 0;

        for (int[] row : numbers) {
            for (int num : row) {
                if (num % 2 == 0) {
                    even += num;

                } else {
                    odd += num;
                }
            }
        }
        System.out.println("Even numbers:" + even);
        System.out.println("Odd numbers:" + odd);
    }
}
