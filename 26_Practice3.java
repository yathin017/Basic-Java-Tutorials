class Cylinder{
    private int height;
    private int radius;

    public Cylinder(int n, int m){
        height = n;
        radius = m;
    }

    public void setHeight(int n){
        height = n;
    }
    public int getHeight(){
        return height;
    }
    public void setRadius(int n){
        radius = n;
    }
    public int getRadius(){
        return radius;
    }
    public float CSA(){
        return 2*(22/7)*getRadius()*getHeight()+2*(22/7)*getRadius()*getRadius();
    }
    public float Volume(){
        return (22/7)*getRadius()*getRadius()*getHeight();
    }
}
class Rectangle{
    private int length;
    private int breadth;
    public Rectangle(){
        this.length = 5;
        this.breadth = 10;
    }
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void setlength(int n){
        length = n;
    }
    public int getlength(){
        return length;
    }
    public void setbreadth(int n){
        breadth = n;
    }
    public int getbreadth(){
        return breadth;
    }
    public float Area(){
        return getlength()*getbreadth();
    }
}

class Practice3 {
    public static void main(String args[]){
        // Cylinder one = new Cylinder(30,40);
        // System.out.println(one.getHeight());
        // System.out.println(one.getRadius());
        // System.out.println("CSA of cylinder is "+one.CSA());
        // System.out.println("Volume of cylinder is "+one.Volume());

        // one.setHeight(10);
        // one.setRadius(5);
        // System.out.println(one.getHeight());
        // System.out.println(one.getRadius());
        // System.out.println("CSA of cylinder is "+one.CSA());
        // System.out.println("Volume of cylinder is "+one.Volume());

        Rectangle two = new Rectangle(20,30);
        System.out.println(two.getlength());
        System.out.println(two.getbreadth());
        System.out.println("Area of Rectangle is "+two.Area());

        two.setlength(50);
        two.setbreadth(100);
        System.out.println(two.getlength());
        System.out.println(two.getbreadth());
        System.out.println("Area of Rectangle is "+two.Area());

        Rectangle three = new Rectangle();
        System.out.println(three.getlength());
        System.out.println(three.getbreadth());
        System.out.println("Area of Rectangle is "+three.Area());

    }
}
