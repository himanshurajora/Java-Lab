import java.util.Scanner;

class Find_second_largest_in_array
{
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

        for (int i = 0; i <size; i++)
        {
            for (int j = i+1; j <5; j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second Largest element in Array is : " + a[size-2]);

        sc.close();
    }
}