
import java.util.Scanner;

public class EmployeePay {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hours;
        double pay=0, overtime=0;

        for (int i = 1; i < 5; i++) {
            while (true) {
                System.out.print("Enter hours worked for Employee " + (i * 1) + ": ");
                hours = s.nextInt();
                if (hours >= 1 && hours <= 70) {
                    break;
                } 
                System.out.println("Invalid, try again");
            }
            if(hours>40){
                pay = 600;
                hours -=40;
                overtime = hours*22.50;
            }
            else if(hours<=40){
                pay = hours*15.00;
            }
            System.out.format("Regular Pay: $%.2f\n", pay);
            System.out.format("Overtime Pay: $%.2f\n", overtime);
            System.out.println("----------------------");
        }
    }

}
