import java.util.Scanner;
class ForSum
{
	public static void main(String[] args) {
        int i,sum=0;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer to find the sum");
        int number = sc.nextInt();
        sc.close();
        for(i=0;i<=number;i++)
        {
        sum=i+sum;
        }
        System.out.println("The Answer is "+sum);
	}
}