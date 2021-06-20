
import java.util.*;

class BinarySearch
{
    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1; 

		while (l <= r) { 
			
            int m = l + (r - l) / 2; 

			if (arr[m] == x) 
				return m; 
			if (arr[m] < x) 
				l = m + 1; 
			else
				r = m - 1; 
		}
		return -1; 
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array:-");
        int length = sc.nextInt();

        int a[] = new int[length];
        System.out.println("Enter the value in array in a sorted form:- ");

        for (int i = 0; i <length; i++)
        {
            System.out.print(">> ");
            a[i] = sc.nextInt();
        }

        System.out.print("\nEnter the Element to search:-");
        int x = sc.nextInt();

        BinarySearch b = new BinarySearch();
        
        int result = b.binarySearch(a, x);

        if(result == -1)
        {
            System.out.println("Element not present"); 
        }
        else
        {
            System.out.println("Element found at index " + result);
        }
    }
}