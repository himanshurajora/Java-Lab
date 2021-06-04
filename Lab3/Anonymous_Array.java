import java.util.Scanner;

class Anonymous_Array
{
   
    public static void main(String[] args)
    {
        PrintArray(new int[]{10,20,30,40,50});
    }

    public static void PrintArray(int a[])
    {
        for (int i = 0; i <a.length; i++)
        {
            System.out.print(a[i] +" ");
        }        
    }
    
}