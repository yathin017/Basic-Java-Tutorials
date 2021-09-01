// Access Modifiers - Specifier where a property/ method is accessible
// 1. Private
// 2. Default
// 3. Protected
// 4. Public

class MyEmployee{
    private int id;
    private String name;
    
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

class AccessModifiers {
    public static void main(String[] args){
        MyEmployee p1 = new MyEmployee();

        p1.setName("Yathin");
        System.out.println(p1.getName());
        p1.setId(12);
        System.out.println(p1.getId());
    }
}
