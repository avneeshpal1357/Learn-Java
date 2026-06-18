import java.util.Scanner;
public class Temperature_Converter_in_java {
    public static void main(String[] args){
        Scanner temp = new Scanner(System.in);

        System.out.print("Enter the temperature : ");
        double temperature = temp.nextDouble();
        temp.nextLine();

        System.out.print("Enter the unit of temperature (C/F) : ");
        String unit = temp.next().toUpperCase();

        double newtemp = (unit.equals("C")) ? (temperature * 9 / 5) + 32 : (temperature - 32) * 5 / 9;
        System.out.printf("The Converted Temperature is : %.2f",newtemp);

        temp.close();
    }
}
