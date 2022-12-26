package abstraction.practise;

public abstract class Car {

    public abstract void accelerate();

    public abstract void breaking();

    public abstract void repairCar(Car car);

    public void horn() {
        System.out.println("The car is honking");
    }
}
