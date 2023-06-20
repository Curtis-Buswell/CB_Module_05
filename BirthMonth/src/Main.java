//class BirthMonth
//   main()
//        num birthMonth = 0
//        output “What is your birth month? [ 1 - 12 ]”
//        input birthMonth
//        if birthMonth <= 12 then
//        output “Your birth month is” + birthMonth
//        else output “You entered an incorrect month value:” + birthMonth
//        end if
//class end

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int birthMonth;
        System.out.println("What is your birth month? [1-12]");
        if (in.hasNextInt()){}//code just continues on if value is true since there is no error
        else{
            System.out.println("Error. Please Restart the program and enter a Number.");
            System.exit(0);
        }
        birthMonth = in.nextInt();
        if (birthMonth >= 12 || birthMonth <= 0)
            System.out.println("You entered an incorrect month value: " + birthMonth + "\nPlease restart the program and try again.");
        else
            System.out.println("Your birth month is: " + birthMonth);
    }
}