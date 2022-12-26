package abstraction.practise2;

public class Audi extends Car {

    public void accelerate() {
        System.out.println("Audi is accelerating");
    }

    public void brake() {
        System.out.println("Audi is braking");
    }

    @Override
    public void repairCar(Car car) {
        System.out.println("Audi is repaired");
    }

}
