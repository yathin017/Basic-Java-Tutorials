class Strings2 {
    public static void main(String[] args){
        String name = "Yathin Prakash";
        String name1 = "AAAAAA AaaaaA aa";
        String name3 = "    abc     ";
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.substring(1, 7));
        System.out.println(name.contains("Yathin"));
        System.out.println(name.contains("abc"));
        System.out.println(name.isEmpty());
        System.out.println(name.concat(" K"));
        System.out.println(name1.replace('A', 'M'));
        System.out.println(name1.indexOf('A'));
        System.out.println(name1.toLowerCase());
        System.out.println(name1.toUpperCase());
        System.out.println(name3.trim());

        String cars = "Audi,Benz,Rolls,Ferrari";
        String allCars[] = cars.split(",");
        for(String car: allCars){
            System.out.println(car);

        String abc = ("hello world");
        System.out.println(abc);
        }

    }
}

