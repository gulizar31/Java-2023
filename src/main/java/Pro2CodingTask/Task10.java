package Pro2CodingTask;

public class Task10 {
    public static void main(String[] args) {
        //Write a program to print out duplicate elements from an Array of Strings?

        String[] names = {"Alin", "Gulizar", "Bayram", "Alin", "Gulizar"};

        String a = "";
        for (int j = 0; j < names.length; j++) {
            a = names[j];

            for (int i = j + 1; i < names.length; i++) {
                if (a == names[i]) {
                    System.out.println(names[i]);

                }
            }

        }

    }
}