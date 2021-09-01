class MyMainEmployee{
    private int id;
    private String name;

    //1
    // public MyMainEmployee(){
    //     id = 45;
    //     name = "Your-name-here";
    // }

    // 2
    public MyMainEmployee(int n, String m){
        id = n;
        name = m;
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int n){
        this.id = n;
    }
    public int getId(){
        return id;
    }

}
class Constructors {
    public static void main(String[] args){
        // 2
        MyMainEmployee p1 = new MyMainEmployee(45,"Yathin Prakash");
        System.out.println(p1.getId());
        System.out.println(p1.getName());

        // Normal method for access modifiers
        p1.setName("Yathin");
        System.out.println(p1.getName());
        p1.setId(12);
        System.out.println(p1.getId());

        // 1 Comment out lines 6-9, 37-41 to understand this concept
        // System.out.println(p1.getId());
        // System.out.println(p1.getName());
        // System.out.println(p1.getClass());

        // Constructor overloading is also possible


    }
}
