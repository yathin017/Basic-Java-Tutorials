import java.util.Scanner;

class Divisibility
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();
        sc.close();
        if (num%5==0 && num%7==0){
            System.out.println("Number is divisible by both 5 and 7");
        }
        else if (num%5==0){
            System.out.println("Number is only divisibe by 5");
        }
        else if (num%7==0){
            System.out.println("Number is only divisible by 7");
        }
        else{
            System.out.println("Number is not divisible by both 5 and 7");
        }
	}
}