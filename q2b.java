
abstract class shape{
    abstract void display();
}
class Triangle extends shape{

    int b;
    int h;
    Triangle(int b,int h)
    {
        this.b=b;
        this.h=h;
    }
    double area;
    void calcArea()
    {

        area=0.5*b*h;
    }
    void display()
    {

        System.out.println(area);

    }
}
class Circle extends shape{
    int r;
    double area;
    Circle()
    {

    }
    Circle(int r)
    {
        this.r=r;
    }
    void calcArea()
    {
        area=3.14*r*r;

    }
    void display()
    {
        System.out.println(area);
    }
}

class Hexagon extends shape{
    int s;
    double area;
    Hexagon(int s)
    {
        this.s=s;
    }
    void calcArea()
    {
        area = ((3*1.73)/2)*s*s;

    }
    void display()
    {
        System.out.println(area);
    }
}
class circle3d extends Circle
{
    double area;
    circle3d(int r)
    {
        this.r=r;
    }
    @Override
    void calcArea() {
        area=4*3.14*r*r;
    }

    @Override
    void display() {

        System.out.println(area);
    }
}
class demo{
    public static void main(String[] args) {
        Triangle o1=new Triangle(4,7);
        Circle o2= new Circle(8);
        Hexagon o3=new Hexagon(7);
        circle3d o4=new circle3d(8);
        o1.calcArea();
        o1.display();
        o2.calcArea();
        o2.display();
        o3.calcArea();
        o3.display();
        o4.calcArea();
        o4.display();

    }
}
