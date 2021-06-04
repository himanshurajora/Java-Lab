import java.util.Scanner;

class ternary_operater
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n1, n2, n3 :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int result = (n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
        System.out.println("The Maximum value is: "+result);
    }
    
}