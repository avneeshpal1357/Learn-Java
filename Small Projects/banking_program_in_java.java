import java.util.Scanner;

public class banking_program_in_java {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning){
            System.out.println("==================\nBanking Program\n==================");
            System.out.println("1. Show Balance. \n2. Deposit. \n3. Withdraw. \n4. Exit. ");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice.");
            }

        }

        scanner.close();
    }
    static void showBalance(double balance){
        System.out.printf("Your Balance: $%.2f\n",balance);
    }
    static double deposit(){
        double amount;
        System.out.print("Enter the amount: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can be negative.");
            return 0;
        }
        else {
            return amount;
        }
    }
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter and amount for withdraw: ");
        amount = scanner.nextDouble();

        if(amount<0){
            System.out.println("Amount can be negative.");
            return 0;
        } else if (amount>balance) {
            System.out.println("Insufficient balance.");
            return 0;
        }
        else {
            return amount;
        }
    }
}
