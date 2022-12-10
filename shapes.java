interface Area{
    public double getArea();
}
interface Volume{
    public double getVolume();
}
class Shape
{
    String name;
    Shape()
    {

    }
    Shape(String name)
    {

        this.name=name;
    }
}
    class Circle extends Shape implements Area
    {

        double radius;
        Circle(double r,String n)
        {
            super(n);
            this.radius=r;
        }
        public double getArea()
        {
            float area= (float) (3.14*radius*radius);
            return area;
        }
    }
    class Square extends Shape implements Area
    {
        double side;
        Square(double side,String n)
        {
            super(n);
            this.side=side;
        }
        public double getArea()
        {
            return(side*side);
        }
    }
    class Sphere extends Circle implements Volume
    {
        Sphere(double r,String n)
        {
            super(r,n);
        }
        public double getVolume()
        {
            return(4/3*3.14*radius*radius*radius);
        }
    }
    class Cube extends Square implements Volume{
        Cube(double side,String n)
        {
            super(side,n);
        }
        public double getVolume()
        {
            return(side*side*side);
        }
    }

    class Cylinder extends Circle implements Volume
    {
        double height;
        Cylinder(double height,double r,String n)
        {
            super(r,n);
            this.height=height;
        }

        @Override
        public double getVolume() {
            return(3.14*radius*radius);
        }
    }
    class Glome extends Sphere implements Volume{
    Glome(double r,String n)
    {
        super(r,n);
    }

        @Override
        public double getVolume() {
            return(0.5*super.getArea()*super.getArea());
        }
    }
class shapes{
    public static void main(String[] args) {
        Circle o1=new Circle(2.3,"Circle");
        System.out.println(o1.getArea());
        Square o2=new Square(4.5,"Square");
        System.out.println(o2.getArea());
        Cylinder o3=new Cylinder(6.6,3.2,"Cyliner");
        System.out.println(o3.getVolume());
        System.out.println(o3.getArea());
        Cube o4=new Cube(3.3,"cube");
        System.out.println(o4.getArea());
        System.out.println(o4.getVolume());
        Sphere o5=new Sphere(4.5,"Sphere");
        System.out.println(o5.getArea());
        System.out.println(o5.getVolume());

    }
}