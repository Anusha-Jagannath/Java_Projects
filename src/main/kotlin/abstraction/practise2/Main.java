package abstraction.practise2;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning abstraction");
        Audi audi = new Audi();
        audi.accelerate();
        audi.brake();
        audi.repairCar(audi);
        Wagnor wagnor = new Wagnor();
        wagnor.accelerate();
        wagnor.brake();
        wagnor.repairCar(wagnor);
    }
}
