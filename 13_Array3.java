import java.util.Scanner;
import java.util.Arrays;
class Array3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
        sc.close();

    }
}
