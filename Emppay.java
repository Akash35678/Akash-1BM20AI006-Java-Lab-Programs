import employee.*;

class Emppay{
    public static void main(String args[]) {
        Emp o1=new Emp("ravi","74V","General",983);
        o1.setAllowance(10);
        o1.setDa(34);
        o1.setHra(50);
        o1.setPf(100);
        o1.setIncometax(10);
        System.out.println(o1.getGrosspay());
        System.out.println(o1.getNpay());
    }
}
