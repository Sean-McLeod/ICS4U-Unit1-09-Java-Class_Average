/*
* This program generates random marks
* and calculates the average of them.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-05-03
*/

import java.util.Random;


final class ClassAverage {
    private ClassAverage() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    public static float averageCalculator(final int[][] studentAssignment) {
        // This function calculates the average
        float sum = 0;
        float average;
        int numberOfMarks = 0;

        for (int row = 0; row < studentAssignment.length; row++) {
            for (int column = 0; column < studentAssignment[row].length;
                 column++) {
                // calculate sum
                sum += studentAssignment[row][column];
                numberOfMarks += 1;
            }
        }
        // calculate average
        average = sum / numberOfMarks;
        // return parameter
        return (average);
    }

    public static void main(final String[] args) {
        final int studentNum = 4;
        final int assignmentNum = 6;
        final int high = 100;
        final int low = 0;
        float average;
        // create array
        int[][] studentAssignment;
        studentAssignment = new int[studentNum][assignmentNum];

        System.out.print("These are the marks: \n");
        for (int row = 0; row < studentAssignment.length; row++) {
            System.out.print("\n");
            for (int column = 0; column < studentAssignment[row].length;
                 column++) {
                // generate randon number
                Random rand = new Random();
                int randomNumber = rand.nextInt(high - low + 1) + low;
                // append values into array
                studentAssignment[row][column] = randomNumber;
                // print marks
                System.out.print(studentAssignment[row][column] + " ");
            }
        }
        // pass & accept parameters
        average = averageCalculator(studentAssignment);
        // output
        System.out.printf("\n\nThe average of the class is: %.2f", average);
    }
}
