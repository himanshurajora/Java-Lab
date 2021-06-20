
import java.util.*;

class BubbleSort
{
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array:- ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the Elements in the array:- ");
        for (int i=0; i<n; ++i)
        {
            System.out.print(">>");
            arr[i] = sc.nextInt();
        }

        System.out.print("Original Array is:- ");
        ob.printArray(arr);

        ob.bubbleSort(arr);
        System.out.print("Sorted array is:- ");
        ob.printArray(arr);
    }
}