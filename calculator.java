

import java.util.Scanner;

//write a java program to define a simple calculator using switch statements. Handle arithmetic exceptions
class calculator
{
    public static void calci(int a, int b,int i)
    {
        switch (i)
        {
            case 1:
                System.out.println("addition result ="+(a+b));
                break;
            case 2:
                System.out.println("subtraction result="+(a-b));
                break;
            case 3:
                System.out.println("multiplication result="+(a*b));

            case 4:
                try
                {
                    int div=a/b;
                }
                catch (Exception e)
                {
                    System.out.println("the divisor is zero");
                }
                break;
        }
    }
    public static void main(String[] args)
    {

            System.out.println("Welcome to ma calci");
            System.out.println("1 for add");
            System.out.println("2 for sub");
            System.out.println("3 for mult");
            System.out.println("4 for div");
            System.out.println("enter choice");
            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();
            System.out.println("Enter first number");
            int a=sc.nextInt();
            System.out.println("enter second number");
            int b=sc.nextInt();
            calci(a,b,ch);

        }
}

