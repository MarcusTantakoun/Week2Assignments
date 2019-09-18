
import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2, total;

        System.out.print("Enter number 1: ");
        num1 = s.nextInt();
        System.out.print("Enter number 2: ");
        num2 = s.nextInt();
        
        if(num1 > num2){
            total = num1/num2;
            int remain1 = num1%num2;
            System.out.format("%d / %d will be %d and the remainder will be %d\n", num1, num2, total, remain1);
        }
        else if(num2>num1){
            total = num2/num1;
            int remain2 = num2%num1;
            System.out.format("%d / %d will be %d and the remainder will be %d\n", num2, num1, total, remain2);
        }
    }
}
