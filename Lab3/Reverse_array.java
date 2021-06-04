import java.util.Scanner;

class Reverse_array
{
   
    public static void main(String[] args)
    {
        PrintReverseArray(new int[]{10,20,30,40,50});
    }

    public static void PrintReverseArray(int a[])
    {
        System.out.println("Original Array :");
        // Printing Original Array
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }

        int j = a.length -1;
        for (int i = 0; i <(a.length)/2; i++)
        {
            
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
        }

        System.out.println("\nReverse Array :");
        //PrintReverseArray
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    
}