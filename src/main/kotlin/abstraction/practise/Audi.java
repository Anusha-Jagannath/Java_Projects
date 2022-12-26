package abstraction.practise;

public class Audi extends Car{

    public void accelerate() {
        System.out.println("Audi is accelerating");
    }

    public void breaking() {
        System.out.println("Audi is breaking");
    }

    @Override
    public void repairCar(Car car) {
        System.out.println("Audi is repairing");
    }
}
