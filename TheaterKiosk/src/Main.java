//class WristBandCheck
//   main()
//        num userAge = 0
//        num DRINKING_AGE = 21
//        output “What is your age?”
//        input userAge
//        if userAge >= DRINKING_AGE then output “Here is your wristband! Be safe.”
//        end if
//        return
//        end class
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userAge;
        int DRINKING_AGE = 21;
        System.out.println("What is your age?");
        if (in.hasNextInt()){}
        else {
            System.out.println("Error. PLease enter a valid age and try again.");
            System.exit(0);
        }
        userAge = in.nextInt();
        if (userAge >= DRINKING_AGE) {
            System.out.println("Here is your wristband!");
        }
    }
}