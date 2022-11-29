package stringsextra;


public class Strings {

    public static void main(String[] args) {
        String name = "Rajesh";
        String name2 = "Rajesh";
        System.out.println(name);
        String animal1 = "cat";
        String animal2 = "cat";
        String animal3 = new String("cat");
        System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal3));
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.substring(0));
        System.out.println(name.substring(0,4));
        System.out.println(name.contains("h"));
        System.out.println(name.isEmpty());
        System.out.println(name.isBlank());
        System.out.println(name.concat(animal1));
        System.out.println(name.replace('R','a'));
        String cars = "Hyundai, Maruthi, suzuki,ferrari,swift";
        String allCars[] = cars.split(",");
        for (String car: allCars) {
            System.out.println(car);
        }

        System.out.println(name.indexOf('e'));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name2.trim());
    }
}
