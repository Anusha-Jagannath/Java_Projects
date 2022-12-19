package singleton;

public class Singleton {

    public static void main(String args[]) {
        System.out.println("Learning singleton pattern");
        AppConfig appConfig = AppConfig.getInstance();
    }
}
