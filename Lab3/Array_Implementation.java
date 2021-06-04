import java.util.Scanner;

class Array_Implementation
{
    public static void main(String[] args)
    {
        // Declaring array
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in array: ");

        for (int i = 0; i <5; i++)
        {
            System.out.print(">> ");
            a[i] = sc.nextInt();
        }

        System.out.print("Array is : ");

        for (int i = 0; i <5; i++)
        {
            System.out.print(a[i] + " ");
            
        }

        // using foreach method
        System.out.println("");
        System.out.print("Using Foreach loop the Array is : ");
        for(int i:a)
        {
            System.out.print(i + " ");
        }

    }
}