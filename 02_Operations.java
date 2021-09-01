import java.util.Scanner;
class Operations{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();
        sc.close();
        int c=a+b;
        int d=a-b;
        int e=a/b;
        int f=a*b;
        int g=a%b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("a+b = "+c);
        System.out.println("a-b = "+d);
        System.out.println("a/b = "+e);
        System.out.println("a*b = "+f);
        System.out.println("a%b = "+g);

    }
}