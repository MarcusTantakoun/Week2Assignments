
import java.util.Scanner;

public class EmployeePay {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hours;
        double pay = 0, overtime = 0, grandtotal = 0, regtotal = 0, overttotal = 0, total;

        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Enter hours worked for Employee " + (i * 1 + 1) + ": ");
                hours = s.nextInt();
                if (hours >= 1 && hours <= 70) {
                    break;
                }
                System.out.println("Invalid, try again");
            }
            if (hours > 40) {
                pay = 600;
                hours -= 40;
                overtime = hours * 22.50;
            } else if (hours <= 40) {
                pay = hours * 15.00;
            }
            total = pay + overtime;
            grandtotal = pay + overtime;
            regtotal += pay;
            overttotal += overtime;

            System.out.format("Regular Pay:  $%.2f\n", pay);
            System.out.format("Overtime Pay: $%.2f\n", overtime);
            System.out.format("Total Pay:    $%.2f\n", total);
            System.out.println("----------------------");
        }

        System.out.println("Cumulative grand total is    $" + grandtotal);
        System.out.println("Cumulative regular total is  $" + regtotal);
        System.out.println("Cumulative overtime total is $" + overttotal);
    }

}
