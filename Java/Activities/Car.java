package activities;

import java.util.Arrays;

public class Car {
    String color;
    int make;
    String transmission;
    int tyres;
    int doors;

    //Constructor
    Car() {
        tyres = 4;
        doors = 4;
    }

    //Class Methods
    public void displayCharacterstics(){
        System.out.println("Color of the Car: " + color);
        System.out.println("Make of the Car: " + make);
        System.out.println("Transmission of the Car: " + transmission);
        System.out.println("Number of doors on the car: " + doors);
        System.out.println("Number of tyres on the car: " + tyres);
    }

    public void accelerate() {
        System.out.println("Car is moving forward.");
    }

    public void brake() {
        System.out.println("Car has stopped.");
    }

    public static class Activity2 {
        public static void main(String[] args) {
            //Initialize the array
            int[] numArr = {10, 77, 10, 54, -11, 10};
            System.out.println("Original Array: " + Arrays.toString(numArr));

            //Set constants
            int searchNum = 10;
            int fixedSum = 30;

            //Print result
            System.out.println("Result: " + result(numArr, searchNum, fixedSum));
        }

        public static boolean result(int[] numbers, int searchNum, int fixedSum) {
            int temp_sum = 0;
            //Loop through array
            for (int number : numbers) {
                //If value is 10
                if (number == searchNum) {
                    //Add them
                    temp_sum += searchNum;
                }

                //Sum should not be more than 30
                if (temp_sum > fixedSum) {
                    break;
                }
            }

            //Return true if condition satisfies
            return temp_sum == fixedSum;
        }
    }
}

