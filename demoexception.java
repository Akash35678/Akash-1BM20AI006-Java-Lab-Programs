import java.util.Scanner;

class demoexception
{
    public static void errorMethod()
    {
        int a=9;
        int b=0;
        int c;
        try{
            c=a/b;
            System.out.println("c="+c);
        } catch (Exception e) {
            System.out.println("enter a value which is not zero");
            Scanner sc=new Scanner(System.in);
            int input=sc.nextInt();
            c=a/input;
            System.out.println("c="+c);
        }

        System.out.println("program is over");
    }
    public static void main(String[] args)
    {
        errorMethod();

    }
}