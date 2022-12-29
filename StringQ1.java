import java.util.Scanner;
public class StringQ1
{
    public static void main(String args[])
    {

        String str="";
        System.out.println("taking user input");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int countWords = str.split("\\s").length;
        System.out.println(countWords);
        str= str.toUpperCase();
        System.out.println(str);
    }
}