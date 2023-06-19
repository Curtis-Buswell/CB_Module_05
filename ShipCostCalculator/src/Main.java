//        class ShippingCostCalculator
//   main()
//        num FREE_SHIPPING = 100
//        num itemCost = 0
//        num shippingCost = 0
//        num totalCost = 0
//        String purchasingYN = “N”
//        do
//            output “What is the cost of the item being purchased?”
//        input itemCost
//        totalCost = totalCost + itemCost
//        output “Are you done purchasing? [Y/N]”
//        input purchasingYN
//        while PurchasingYN == “Y”
//        if totalCost >= FREE_SHIPPING then
//        output “Hooray! There is no shipping cost on this purchase, your price will remain $” +
//                itemCost
//     else
//        shippingCost = ( totalCost * 1.02 ) - totalCost
//        output “The 2% shipping price will be $” + shippingCost + “, bringing the total from $” +
//                totalCost + “ to $” + totalCost
//        end if
//        return
//                end class


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int FREE_SHIPPING = 100;
        int itemCost;
        double shippingCost;
        int totalCost = 0;
        String purchasingYN;
        do
        { System.out.println("What is the cost of the item being purchased?");
            itemCost = in.nextInt();
            totalCost += itemCost;
            System.out.println("Are you done purchasing? [Y/N]");
            in.nextLine();
            purchasingYN = in.nextLine();
            if (!purchasingYN.equalsIgnoreCase  ("y")&&!purchasingYN.equalsIgnoreCase  ("n"))
                System.out.println("You entered: " + purchasingYN + "\nPlease enter Y or N");
        } while (!purchasingYN.equalsIgnoreCase("y"));

        if (totalCost >= FREE_SHIPPING) {
            System.out.print("Hooray! There is no shipping cost on this purchase, your price will be $" + totalCost);
        }
        else {
            shippingCost = (totalCost*1.02 - totalCost);
            System.out.print("The 2% shipping price will be $" + shippingCost + ", bringing your total from $" + totalCost + " to $" + (totalCost + shippingCost));
        }

    }
}