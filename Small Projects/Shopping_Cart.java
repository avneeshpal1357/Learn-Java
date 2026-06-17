import java.util.Scanner;

public class Shopping_Cart {
    public static void main(String[] args){

        Scanner cart = new Scanner(System.in);

        System.out.print("What item you select in the menu: ");
        String item = cart.nextLine();

        System.out.print("What is the price of item: ");
        double price = cart.nextDouble();

        System.out.print("Hom many would you like: ");
        int quantity = cart.nextInt();

        double total;
        total = price * quantity;

        System.out.println("You have bought " + quantity + " " + item + "'s");
        System.out.println("your total is $:" +total);


        cart.close();
    }

}
