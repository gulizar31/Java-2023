package Pro2CodingTask;

public class Task3 {
    public static void main(String[] args) {
        //Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.


        int[][] numbers = {
                {4, 1, 67, 4, 37},
                {2, 76, 8, 34, 12}
        };

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++)
                if (numbers[row][col] % 2 == 0) {
                    System.out.println(numbers[row][col] + " ");

                }
        }

    }

}

