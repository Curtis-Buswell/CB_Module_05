//class PartyAnimal
//   main()
//        String userParty
//        output “What is your party affiliation? [ RDI ]”
//        input userParty
//        if  userParty == “R” then
//        output “Your party’s animal is the Elephant”
//        else if userParty == “D” then
//        output “Your party’s animal is the Donkey”
//        else
//        output “You get the human!”
//        end if
//class end
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String partyAffiliation;
        System.out.println("What is your party affiliation? [RDI]");
        if (in.hasNextInt()) {
            System.out.println("Please try again and input a valid character. [A-Z]");
            System.exit(0);
        }
        partyAffiliation = in.nextLine();
        if (partyAffiliation.equalsIgnoreCase("r")) {
            System.out.println("Your party's symbol is the Elephant!");
        } else if (partyAffiliation.equalsIgnoreCase("d")) {
            System.out.println("Your party's symbol is the Donkey!");
        } else if (partyAffiliation.equalsIgnoreCase("i")) {
            System.out.println("Your party's symbol is the Human!");
        } else {
            System.out.println("You get...other?");

        }
    }
}