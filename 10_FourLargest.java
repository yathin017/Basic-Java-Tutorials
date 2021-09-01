import java.util.Scanner;

class Greater
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter all the four numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        sc.close();
        if(num1>num2 && num1>num3 && num1>num4){
            System.out.println("The greatest number is "+num1);
        }
        else if(num2>num1 && num2>num3 && num2>num4){
            System.out.println("The greatest number is "+num2);
        }
        else if(num3>num1 && num3>num2 && num3>num4){
            System.out.println("The greatest number is "+num3);
        }
        else if(num4>num1 && num4>num2 && num4>num3){
            System.out.println("The greatest number is "+num4);
        }
        else{
            System.out.println("Error");
        }
	}
}