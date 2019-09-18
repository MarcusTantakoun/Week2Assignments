
import java.util.Scanner;

public class PowersChart {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int exp;
        while (true) {
            System.out.print("Enter exponent value: ");
            exp = s.nextInt();
            if (exp >= 0 && exp <= 10) {
                break;
            }
            System.out.println("Error, number must be from 0 to 10");
        }
        
        System.out.format("%d\t",exp); System.out.format("2^%d\n",exp);
        System.out.println("-----------\t");
        
        for (int i = 0; i < exp; i++) {
            System.out.format("%d\t",i+1);
            System.out.println(Math.pow(2,i+1));
        }
    }
}
