import java.util.Scanner;

class StringQ3
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr1=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the value");
            int n1= sc.nextInt();
            arr1[i]=n1;
        }
        try
        {
            int pos=sc.nextInt();
            System.out.println("value at index pos"+pos+"is"+arr1[pos]);
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bound");
        }



    }
}