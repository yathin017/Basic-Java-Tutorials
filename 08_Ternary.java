class Ternary {
    public static void main(String args[]){
        int a = 20;
        int b = 10;
        int c = 30;
        int d = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("Largest value is "+d);
    }
}
