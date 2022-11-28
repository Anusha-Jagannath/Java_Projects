package strings;

public class Strings {

    public static void main(String args[]) {
        System.out.println("Learning strings introduction");
        String name = "Ayush";
        System.out.println(name);
        String another = new String("Ayush");

        if (name.equals(another)) {
            System.out.println("Both names are equal");
        } else {
            System.out.println("Both names are not equal");
        }
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.substring(3));
        System.out.println(name.substring(2,5));
        System.out.println("Ayush"+"Jkl");
        System.out.println("Ayush".concat("JKL"));

        String cars = "Hyundai,Maruthi,Wagnor,Ferari";
        String newCars[] = cars.split(",");
    }
}
