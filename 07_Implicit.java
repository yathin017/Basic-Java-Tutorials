/*  
byte -> short -> int -> long -> float -> double
---------------------------------------------->
                 Widening
*/
class Implicit {
    public static void main(String nishoak[]){
        int i = 100;
        long l = i;
        float f = i;
        System.out.println("int value: "+i);
        System.out.println("long value: "+l);
        System.out.println("float value: "+f);

    }
    
}
