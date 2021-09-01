class Derivative{
    public int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am in Derivative class setting x");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a method");
    }
}

class Base extends Derivative{
    public int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        System.out.println("I am in Base class setting y");
        this.y = y;
    }
    public void print(){
        System.out.println("I am a method");
    }
}


class Inheritance {
    public static void main(String[] args){

        Derivative a = new Derivative();
        a.setX(5);
        System.out.println(a.getX());
        a.printMe();

        Base b = new Base();
        b.setX(6);
        System.out.println(b.getX());
        b.printMe();

        b.setY(7);
        System.out.println(b.getY());
        b.print();

    }
}
