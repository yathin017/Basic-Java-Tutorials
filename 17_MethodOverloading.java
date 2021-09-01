class MethodOverloading {
    // Method abc()
    static void abc(){
        System.out.println("abc");
    }
    // Method greet(String a)
    static void greet(String a){
        System.out.println("Hello "+a); 
    }
    // Method change(int a)
    static void change(int a){
        a = 100;
        System.out.println("This is from function to check: "+a);
    }
    // Method change2(int[] arr)
    static void change2(int[] arr){
        arr[0] = 100;
    }
    // Method foo()
    static void foo(){
        System.out.println("Good Night!!!");
    }
    // Method foo(String a)
    static void foo(String a){
        System.out.println("Good Night "+a+"!!!");
    }
    // Method foo(int a)
    static void foo(int a){
        int x = a*a;
        System.out.println(a+" x "+a+" = "+x);
    }
    public static void main(String[] args) {
        // Case 0 
        abc();

        // Case 1
        String name = "Yathin";
        greet(name);

        // Case 2
        int[] marks = {12, 73, 77, 89, 98, 94};
        int x = 45;
        change(x);
        System.out.println("The value of x after running: "+x);     // Value of x remains 45
        change(marks[3]);
        System.out.println("The value of marks[3]: "+marks[3]);     // Value of marks[3] remains 45

        //case 3
        change2(marks);
        System.out.println("The value of marks[0]: "+marks[0]);       
        
        // Value of marks[0] changes to 100 because 
        //we are passing the whole array that is the object and 
        //here marks is called as reference which stores assress of the object.

        // Method Overloading
        foo();

        foo(name);

        int xyz = 45;
        foo(xyz);
        foo(12);

    }
}
