class gm
{
    gm() {
        System.out.println("inside constructor");
    }
    public String toString()
    {
        return("good morning");
    }
}
class StringFunctions
{
    public static void main(String[] args) {
        char arr[]= {'a','b','c','d','e','f'};
        String str= new String(arr,2,3);
        //System.out.println(str);
        String str1=new String(str);
        //System.out.println(str1);
        str1="hello world";
        String str2="bms college";
        //System.out.println(str=str1+str2);
        gm o1=new gm();
        //System.out.println(o1);
        StringBuffer sob=new StringBuffer("hello");
        sob.setCharAt(2,'i');
        System.out.println(sob);
        String charastring="This is java programming";
        char chs[]=new char[charastring.length()];
        charastring.getChars(0,charastring.length(),chs,0);

        String ss1="hello world";
        String ss2="hello world";
        String ss3="bms college";
        if(ss1.compareTo(ss2)==0)
        {
            System.out.println("strings are equal");
        }
        else if(ss1.compareTo(ss2)>0)
        {
            System.out.println("string 1 is larger");
        }
        else System.out.println("string 2 is larger");

        String ss4="good morning";
        System.out.println(ss4.substring(0,4));

        System.out.println( ss1.replace("hello","greetings"));
        String ss5="Hello BMSCE Good Morning";
        System.out.println(ss5.replaceAll(" ",""));
    }
}
