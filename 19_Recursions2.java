import java.util.Scanner;

class Recursions2 {
    static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
        else{
            //System.out.print((fibonacci(n-1)+fibonacci(n-2))+", ");
            return (fibonacci(n-1)+fibonacci(n-2));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        sc.close();
        System.out.print(fibonacci(x));
    }
}
