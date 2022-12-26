package abstraction.practise2;

public class Wagnor extends Car{

    @Override
    public void accelerate() {
        System.out.println("Wagnor is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Wagnor is braking");
    }

    @Override
    public void repairCar(Car car) {
        System.out.println("Wagnor is repaired");
    }
}
