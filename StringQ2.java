import java.util.Scanner;

import static java.lang.Character.isDigit;

public class StringQ2
{
    public static boolean isVowel(char c)
    {
        if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {

        String str="";
        System.out.println("taking user input");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int vowels=0;
        int consonants=0;
        int digits=0;
        int whitespace=0;
        int len=str.length();

        for(int i=0;i<len;i++)
        {
            if(isDigit(str.charAt(i)))
            {
                digits++;
            }
            if(str.charAt(i)==' ')
            {
                whitespace++;
            }
            if(isVowel(str.charAt(i)))
            {
                vowels++;
            }
            else if(isVowel(str.charAt(i))==false && str.charAt(i)>'a'&&str.charAt(i)<'z')
            {
                consonants++;
            }
        }
        System.out.println("no. of digits="+digits);
        System.out.println("no. of whitespaces="+whitespace);
        System.out.println("no of vowels="+vowels);
        System.out.println("no of consonants="+consonants);
    }
}