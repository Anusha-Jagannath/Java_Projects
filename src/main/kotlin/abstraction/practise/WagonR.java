package abstraction.practise;

public class WagonR extends Car {

    public void accelerate() {
        System.out.println("Wagnor is accelerting");
    }

    public void breaking() {
        System.out.println("Wagnor is breaking");
    }

    @Override
    public void repairCar(Car car) {
        System.out.println("wagnor is reapairing");
    }
}
