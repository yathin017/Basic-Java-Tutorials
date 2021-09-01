class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
}

class Classes {
    public static void main(String[] args){
        System.out.println("This is custom class");
        Employee person1 = new Employee();    // Instantiating new Employee object, person1 is the object
        // Setting Attributes
        person1.id = 12;
        person1.name = "Yathin Prakash";

        System.out.println("Printing without any method");
        // Printing Attributes
        System.out.println(person1.id);
        System.out.println(person1.name);

        System.out.println("Printing attributes using method");
        person1.printDetails();


    }
    
}
