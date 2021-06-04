import java.util.Scanner;

class Geting_Array
{
    public static int[] number()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        // Declaring array
        int a[] = new int[size];

        System.out.println("Enter the value in array: ");

        for (int i = 0; i <size; i++)
        {
            System.out.print(">> ");
            a[i] = sc.nextInt();
        }
        sc.close();
        return a;
    }
    
    public static void main(String[] args)
    {
        
       int b[] = number();

        System.out.print("Array is: ");

        for (int i = 0; i <b.length; i++)
        {
            System.out.print(b[i] + " ");
            
        }
    }
}