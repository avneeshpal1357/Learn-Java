import java.util.Scanner;
public class Simple_calculator_in_java {
    public static void main(String[] args){
        Scanner data = new Scanner(System.in);

        System.out.print("Enter first no: ");
        double first = data.nextDouble();
        data.nextLine();

        System.out.print("Enter the operator (+,-,*,/,^): ");
        char ope = data.next().charAt(0);

        System.out.print("Enter second no: ");
        double second = data.nextDouble();

        double result = 0;
        boolean vaild = true;

        switch(ope) {
            case '+' -> result = first+second;
            case '-' -> result = first-second;
            case '*' -> result = first*second;
            case  '/' -> {
                if(second == 0){
                    System.out.println("cannot divided by zero.");
                    vaild = false;
                }
                else {
                    result = first/second;
                }
            }
            case '^' -> result = Math.pow(first,second);
            default -> {
                System.out.println("Enter a valid operator.");
                vaild = false;
            }
        }
        if(vaild) {
            System.out.println(result);
        }

        data.close();
    }
}
