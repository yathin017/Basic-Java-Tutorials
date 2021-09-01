import java.util.Scanner;
class InputChar {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your favourite color?");
        char name = sc.next().charAt(4);
        System.out.println("Your Favourite color is: "+name);
        sc.close();
    }
    
}
