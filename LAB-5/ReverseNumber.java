
import java.util.Scanner;

class ReverseNumber
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:- ");
        int num = sc.nextInt();

        int length = String.valueOf(num).length();

        int reverse = 0;
        for (int i = 0; i < length; i++) {
            reverse = 10*reverse + num%10;
            num /= 10;
        }

        System.out.println("Reverse Number:- " + reverse);
    }
}