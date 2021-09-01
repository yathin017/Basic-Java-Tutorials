class Derivative1{
    public int x;
    Derivative1(){
        System.out.println("I am a constructor of Derivative class");
    }
    Derivative1(int x){
        System.out.println("This is from class Derivative1 and gives the value of x as "+x);
    }
}

class Base1 extends Derivative1{
    public int y;
    Base1(){
        System.out.println("I am a constructor of Base class");
    }
    Base1(int x, int y){
        super(x);
        System.out.println("This is from class Base1 and gives the value of y as "+y);
    }
}

class Derive extends Base1{
    Derive(){
        System.out.println("I am constructor from Derive class");
    }
    Derive(int x, int y, int z){
        super(x,y);
        System.out.println("This is from class Derive and gives the value of z as "+z);
    }
}


class Constructors_in_Inheritance {
    public static void main(String[] args){
        // No constructor is made in base class

        // Derivative1 a = new Derivative1();
        // Base1 b = new Base1();
        // If no constructor is made in Base class it automatically runs the constructor of the Derivative class.
       
        // After making a constructor in baseclass

        //    Base1 c = new Base1();
        // If a constructor is made in Base class first it runs the constructor of derivative class and then the base class constructor.

        // Over loading constructors

        Derive abc = new Derive(1,2,3);
        System.out.println(abc);

    }
}
