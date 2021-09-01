import java.util.Scanner;

class Input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        String a = sc.nextLine();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();
        sc.close();
        System.out.println("The sum of a and b is "+(a+b));
    }
}
