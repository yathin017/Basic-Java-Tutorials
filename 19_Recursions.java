class Recurssions {
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args){
        int x = 5;
        System.out.println("The factorial of "+x+" is: "+factorial(x));
    }
}
