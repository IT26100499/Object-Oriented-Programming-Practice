import java.util.Scanner;

public class EmployeeSystem {
    public static void main(String[] args) {

        //Declare the variables
        int empType, otHours;
        double basicSalary, otRate , totalSalary;

        //Import Scanner class
        Scanner input = new Scanner(System.in);

        //get employee type
        System.out.print("Enter Employee Type(1,2, or 3) :");
        empType = input.nextInt();

        //get basic salary
        System.out.print("Enter Basic Salary :");
        basicSalary = input.nextDouble();

        //get overtime hours
        System.out.print("Overtime Hours :");
        otHours = input.nextInt();

        //initialize OTrate
        otRate = 0;

        //check the emp type
        switch (empType){
            case 1:
                otRate = 1000;
                break;
            case 2:
                otRate = 1500;
                break;
            case 3:
                otRate = 1708;
                break;
            default:
                System.out.println("Invalid employee type");
                return;
        }

        //Calculate total salary
        totalSalary = basicSalary + (otHours * otRate );

        //Print total salary
        System.out.println("Total Salary " + totalSalary);
    }
}
