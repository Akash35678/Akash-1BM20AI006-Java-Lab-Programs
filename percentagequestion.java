abstract class Marks
{
    abstract void GetPercentage();
}
class A1 extends Marks
{
    int mark1,mark2,mark3;
    A1(int mark1,int mark2,int mark3)
    {
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }
    void GetPercentage()
    {
        int average=(mark1+mark2+mark3)/3;
        System.out.println("Percentage ="+average);
    }
}
    class B1 extends Marks {
        int mark1, mark2, mark3, mark4;

        B1(int mark1, int mark2, int mark3, int mark4) {
            this.mark1 = mark1;
            this.mark2 = mark2;
            this.mark3 = mark3;
            this.mark4 = mark4;
        }

        void GetPercentage() {
            int average = (mark1 + mark2 + mark3 + mark4) / 4;
            System.out.println("Percentage =" + average);
        }

    }
class perentagequestion{
    public static void main(String[] args) {
        A1 o1=new A1(86,88,98);
        B1 o2=new B1(67,88,42,90);
        o1.GetPercentage();
        o2.GetPercentage();
    }
}



