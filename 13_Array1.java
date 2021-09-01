import java.util.Scanner;
import java.util.Arrays;

class Array1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be stored: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Elements entered are: ");
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
        System.out.println("Elements after sorting are: ");
        Arrays.sort(array);
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
        sc.close();
    }
}
