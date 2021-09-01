/*
double -> float -> long -> int -> short -> byte
---------------------------------------------->
                 Narrowing
*/
class Explicit {
    public static void main(String args[]){
        double d = 100.004;
        long l = (long)d;
        int i = (int)l;
        System.out.println("double value:"+d);
        System.out.println("long value:"+l);
        System.out.println("int value:"+i);
    }
}
