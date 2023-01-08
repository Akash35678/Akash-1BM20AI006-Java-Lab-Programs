package employee;

public class Emp
{
    String name;
    String empid;
    String category;
    int bpay;
    int hra;
    int da;
    int npay,pf,grosspay,incometax,allowance;
    public Emp(String name,String empid,String category,int bpay)
    {
        this.name=name;
        this.empid=empid;
        this.bpay=bpay;
        this.category=category;
    }

    public void setDa(int da) {
        this.da = da;
    }
    public void setHra(int hra)
    {
        this.hra=hra;
    }
    public void setAllowance(int allowance)
    {
        this.allowance=allowance;
    }

    public void setPf(int pf) {
        this.pf = pf;
    }
    public void setIncometax(int incometax)
    {
        this.incometax=incometax;
    }
    public int getGrosspay()
    {
        return(bpay+hra+da+allowance);
    }
    public int getNpay()
    {
        return(bpay+da+hra+allowance-pf-incometax);
    }
}
