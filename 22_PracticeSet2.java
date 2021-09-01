class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class cellphone{
    public void ringing(){
        System.out.println("Ringing...");
    } 
    public void vibrating(){
        System.out.println("Vibrating...");
    } 
    public void calling(){
        System.out.println("Calling...");
    } 
}

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class rect{
    int l;
    int b;
    public int area(){
        return l*b;
    }
}
class PracticeSet1{
    public static void main(String[] args){
        /*
        Employee1 person1 = new Employee1();
        person1.setName("Yathin");
        System.out.println(person1.getName());
        person1.salary=25000;
        System.out.println(person1.getSalary());
        */

        /*
        cellphone oneplus = new cellphone();
        oneplus.ringing();
        oneplus.calling();
        oneplus.vibrating();
        */

        square sq = new square();
        sq.side = 6;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        rect ab = new rect();
        ab.l = 6;
        ab.b = 5;
        System.out.println(ab.area());
       
    }
}