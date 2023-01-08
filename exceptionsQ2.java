import java.util.Scanner;

class DiffZero extends Exception{
    public DiffZero()
    {
        super("the  difference is zero");
    }
}
class NegativeAns extends Exception{
    public NegativeAns()
    {
        super("The difference is negative");
    }
}


class exceptionsQ2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int c = a - b;
        try{
            if (a - b == 0) {
                throw new DiffZero();
            }

        } catch (DiffZero e) {
            System.out.println(e);
        }
    }
}
