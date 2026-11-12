import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {

        //Creating a new Scanner Object
        Scanner input = new Scanner(System.in);

        //Declare Variables
        int remainSeconds, minutes, hours, totalSeconds;

        //Get seconds from the user
        System.out.print("Enter the number of seconds : ");
        totalSeconds = input.nextInt();

        //Convert second into hour
        hours = totalSeconds / 3600;

        //Convert seconds into minutes
        minutes = totalSeconds / 60;

        //Find remaining seconds
        remainSeconds = totalSeconds % 60;

        //Display the details
        System.out.println(totalSeconds + " seconds " + "in Hours : " + hours);
        System.out.println(totalSeconds + " seconds " + "in Minutes : " + minutes);
        System.out.println("Remaining Seconds : " + remainSeconds);
    }
}
