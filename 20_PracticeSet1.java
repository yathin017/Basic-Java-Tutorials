class PracticeSet{
    static void qn1(int n){
        for(int i=1; i<=10; i++){
            System.out.format("%d x %d = %d\n",n,i,n*i);
        }
    }
    static void qn2(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static int qn3(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return n + qn3(n-1);
        }
    }
    public static void main(String[] args){
        // Question 1
        qn1(9);

        // Question 2
        qn2(5);

        // Question 3
        int x = qn3(0);
        System.out.println(x);
    }
}