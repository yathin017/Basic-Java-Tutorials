import java.util.Scanner;
class Array2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the number of elements to be reversed: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sc.close();
        }
        System.out.println("Reversed array is: ");
        for(i=n-1;i>=0;i--){
            System.out.println(arr[i]);
        }    
    }
}
