package Pro2CodingTask;

public class Task2 {
    //Create an array of integer values. After the array is created, calculate
    // the sum of all stored elements in that array.

    public static void main(String[] args) {

        int[] num= {9, 31, 3, 23, 94, 4, 24, 6, 90};

        int sum = 0;

        for (int i =0; i < num.length; i++ ){
            sum += num[i];
        }
        System.out.println(sum);





    }
}
