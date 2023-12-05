package Pro2CodingTask;

public class Task1 {
    public static void main(String[] args) {

        //Create a program that uses an array to store
        // a list of temperatures for a week, and then
        // uses a loop to find the highest and lowest
        //temperature for the week.

        int [] temp={27,28,29,31,37,25,};

           int highestTemperature = temp [0];
           int lowestTemperature = temp [0];

           for (int i=0; i< temp.length; i++){
               if (temp[i] > highestTemperature) {
                   highestTemperature = temp[i];

               }
               if (temp[i] < lowestTemperature){
                   lowestTemperature = temp[i];

               }
           }

                // Displaying results
                System.out.println("Highest temperature for the week: " + highestTemperature + "degrees celsius");
                System.out.println("Lowest temperature for the week: " + lowestTemperature + "degrees celsius");

            }
        }
