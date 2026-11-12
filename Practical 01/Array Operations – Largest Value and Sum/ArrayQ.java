import java.util.Scanner;

public class ArrayQ {
    public static void main(String[] args) {
        //import scanner class
        Scanner input = new Scanner(System.in);

        // Get 5 integer values from the user
        System.out.print("Enter 5 integer values : ");

        // Create an integer array that can store 5 elements
        int[] numbers = new int[5];

        // Use a for loop to get 5 numbers from the user
        // Store each entered number in the array
        for(int i = 0; i < numbers.length; i++) {
            numbers[i]=input.nextInt();
        }

        // Assume the first element is the largest value
        int largest = numbers[0];
        // Initialize sum to 0 to calculate the total of array elements
        int sum = 0;

        // Traverse through the array to find the largest number and calculate the sum
        for(int i = 0; i < 5 ; i++) {
            // Check whether the current element is greater than the largest value
            if(numbers[i] > largest){
                // Update largest if a bigger number is found
                largest = numbers[i];
            }
            // Add the current array element to the sum
            sum += numbers[i];
        }

        //Print largest value and sum of all array elements
        System.out.println("Largest value "+ largest);
        System.out.println("Sum of element "+ sum);
    }
}
