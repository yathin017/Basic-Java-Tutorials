import java.util.Scanner;
class Grade
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the marks of four subjects for 100");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        sc.close();
        int total = sub1+sub2+sub3+sub4;
        System.out.println("The Total is "+total+", The Average is "+total/5);
        if (total/500==75){
            System.out.println("Distinction");
        }
        else if( total/500<75 && total/500>=65){
            System.out.println("First division");
        }
        else if( total/500<60 && total/500>=50){
            System.out.println("Second division");
        }
        else if( total/500<50 && total/500>=40){
            System.out.println("Third division");
        }
        else {
            System.out.println("Fail");
        }
	}
}