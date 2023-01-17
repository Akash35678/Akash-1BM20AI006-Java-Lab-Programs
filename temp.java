
class myException extends Exception
{
    myException()
    {
        super("temp is zero");
    }
}
class Temperature {
    int temp;

    Temperature(int t) throws myException {
        this.temp = t;
        if (t == 0) {
            throw new myException();
        }
    }
}
class temp
{
    public static void main(String[] args) throws myException {
        try
        {
            Temperature t=new Temperature(0);
            System.out.println("temp is "+t.temp);
        }
        catch(myException e)
        {
            System.out.println(e);
        }

    }
}

