class Strings1 {
    public static void main(String[] args){
        String name1 = "Yathin";
        String name2 = "Yathin";
        // name1 and name2 are stored in string pool area so both are equal, hence returns true
        String name3 = new String("Yathin");
        // name3 is not equal to name1 and name2 as name3 is in heap area, hence returns false
        System.out.println(name1==name2);
        System.out.println(name1==name3);
    }
}
