package abstraction.practise;

public class RepairShop {

    public static void main(String[] args) {
        System.out.println("Learning abstraction with practise");
        WagonR wagnonR = new WagonR();
        wagnonR.repairCar(wagnonR);

        Audi audi = new Audi();
        audi.repairCar(audi);
    }
//
//    private static void repairCar(WagonR car) {
//        System.out.println("Repairing wagnor ");
//    }
//
//    private static void repairCar(Audi car) {
//        System.out.println("Repairing audi");
//    }
}
