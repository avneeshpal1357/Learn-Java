import java.util.Random;
import java.util.Scanner;

public class number_guessing_game_in_java {
    public static void main(String[] args) {
        Random no = new Random();
        int randomNo = no.nextInt(1, 101);

        Scanner num = new Scanner(System.in);

        System.out.println("Number Guessing Game 1 to 100 ");
        int guessNo;
        int attempts=0;
        do {
            System.out.print("Enter the number: ");
            guessNo = num.nextInt();
            attempts++;

            if(guessNo < randomNo){
                System.out.println("low");
            }
            else if (guessNo > randomNo){
                System.out.println("High");
            }else {
                System.out.println("You have won");
                System.out.println("No of attempts: "+attempts);
            }

        } while (guessNo != randomNo);

        num.close();

    }
}
