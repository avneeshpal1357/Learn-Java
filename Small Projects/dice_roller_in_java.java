import java.util.Random;
import java.util.Scanner;

public class dice_roller_in_java {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int noOfDice;
        int sumTotal=0;

        System.out.print("Enter no of dice: ");
        noOfDice = scanner.nextInt();

        if(noOfDice>0){
            for(int i=0;i<noOfDice;i++){
                int roll = random.nextInt(1,7);
                sumTotal += roll;
            }
            System.out.println("Total: "+sumTotal);
        }
        else {
            System.out.println("No of dice must be greater then 0.");
        }
        scanner.close();
    }
}
