class Bool {
    public static void main(String args[]){
        boolean b1 = true;
        boolean b2 = false;
        //boolean b3 = (10>2)? true:false;
        System.out.println("b1 = "+b1);
        System.out.println("b2 = "+b2);
        //System.out.println("b3 = "+b3);
        System.out.println("Testing not conditions");
        System.out.println("b1 = "+b1);
        b1 = !b1;
        System.out.println("b1 = !b1 => "+b1);
        b1 = !b1;
        System.out.println("b1 = !b1 => "+b1);
    }
}
