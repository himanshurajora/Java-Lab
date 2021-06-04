import java.util.Scanner;

class Finding_min_value_in_array
{
    public static int min(int a[])
    {
        int min = a[0];

        for (int i = 0; i <a.length; i++)
        {
            if(min > a[i])
            
            {
                min = a[i];
            }
        }
        return min;
    }
    
    public static void main(String[] args)
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
        int result = min(a);
        System.out.println("Minimum element in Array is : " + result);

        sc.close();
    }
}