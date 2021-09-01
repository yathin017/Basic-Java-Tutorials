import java.util.Scanner;
class Calculator{
    public static void main(String args[]){
        char operator;
        Double n1,n2,result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operator (+, -, *, /):");
        operator = sc.next().charAt(0);
        System.out.println("Enter number1 and number2:");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        sc.close();
        switch(operator){
            case '+':
            result = n1+n2;
            System.out.println(result);
            break;
            case '-':
            result = n1-n2;
            System.out.println(result);
            break;
            case '*':
            result = n1*n2;
            System.out.println(result);
            break;
            case '/':
            result = n1/n2;
            System.out.println(result);
            break;
            default:
            System.out.println("Invalid Operator");
        }
    }
}