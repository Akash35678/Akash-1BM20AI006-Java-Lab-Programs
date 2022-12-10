abstract class Animal {
    int legs;
    Animal(int legs)
    {
        this.legs=legs;
    }
    public void walk()
    {
        System.out.println("walking");
    }
    public void eat()
    {
        System.out.println("eating");
    }
}
interface Pet
{
    public String getName();
    public String setName(String n);
    public void play();
}
class Spider extends Animal
{
    Spider()
    {
        super(8);
    }
    public void eat()
    {
        System.out.println("spider eats insects");
    }
}
class Cat extends Animal implements Pet
{
    String catName;
    Cat()
    {
        this("");
    }
    Cat(String n)
    {
        super(4);
        this.catName=n;
    }
    public void eat(){
        System.out.println("Cats eat fish");
    }
    public String getName()
    {
        return catName;
    }

    public String setName(String catName) {
        this.catName = catName;
        return catName;
    }

    @Override
    public void play() {
        System.out.println("the cat is playing");
    }
}
    class Fish extends Animal implements Pet{
    String fishName;
    Fish()
    {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("fish eats fishfood");
    }

        @Override
        public String getName() {
            return fishName;
        }

        @Override
        public String setName(String n) {
            this.fishName=n;
            return fishName;
        }

        @Override
        public void play() {
            System.out.println("fish plays with me");
        }

        @Override
        public void walk() {
            System.out.println("Fish cannot walk");
        }
    }
class animals{
    public static void main(String[] args) {
        Fish d=new Fish();
        Cat c=new Cat("fluffy");
        Animal a=new Fish();
        Animal e=new Spider();
        Pet p=new Cat();
        d.setName("Myfish");
        d.eat();
        System.out.println("This fish's name is "+d.getName());
        d.walk();

    }
}
