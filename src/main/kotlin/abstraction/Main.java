package abstraction;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning abstraction");
        WagonR wagonR = new WagonR();
        repairCar(wagonR);

        Audi audi = new Audi();
        repairCar(audi);
    }

    public static void repairCar(Car car) {
        System.out.println("repairing wagnor");
    }
}
