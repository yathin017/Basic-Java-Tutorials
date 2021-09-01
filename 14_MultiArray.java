import java.util.Scanner;

class MultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for 2D array: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        System.out.println("Enter values of a: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int[][] b = new int[n][m];
        System.out.println("Enter values of b: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                b[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int[][] c = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }    
}
