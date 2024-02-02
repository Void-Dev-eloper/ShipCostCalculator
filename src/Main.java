import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        double SHIPPING_FEE = 0.02;
        double freeShipping = 100;
        double finalPrice;
        double shippingCost;

        System.out.print("Enter the price of the item: $");
        double itemPrice = in.nextDouble();

        if (itemPrice >= freeShipping)
        {
            shippingCost = 0;
        }
        else
        {
            shippingCost = itemPrice * SHIPPING_FEE;
        }

        finalPrice = shippingCost + itemPrice;
        System.out.println("The Shipping Cost is: $" + shippingCost);
        System.out.println("The Final Price is: $" + finalPrice);

    }
}