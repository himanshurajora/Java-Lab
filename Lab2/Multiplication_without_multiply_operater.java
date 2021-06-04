
import java.util.Scanner;

class Multiplication_without_multiply_operater
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n1, n2:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        int result = 0,i;

        for(i=1;i<=n1;i++)
        {
            result = result + n2;
        }

        System.out.println("The multiplication of "+n1+" and "+n2+" is "+result);
    }
    
}