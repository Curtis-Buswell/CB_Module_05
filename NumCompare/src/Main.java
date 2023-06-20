import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int value1;
        int value2;
        System.out.print("Please enter the first number: ");
        if (in.hasNextInt()){}
        else {
            System.out.println("Error. Please enter a valid number and try again.");
            System.exit(0);
        }
        value1 = in.nextInt();
        System.out.print("Please enter the second number: ");
        if (in.hasNextInt()){}
        else {
            System.out.println("Error. Please enter a valid second number and try again.");
            System.exit(0);
        }
        value2 = in.nextInt();
        if (value1 == value2){
            System.out.println("The 2 numbers are equal.");
        } else if (value1 > value2) {
            System.out.println("The first number is greater than the second number.");
        }
        else {
            System.out.println("The second number is greater than the first number.");
        }
    }
}