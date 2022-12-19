package singleton;

public class AppConfig {

    private static AppConfig appConfig = null;
    private AppConfig() {

    }

    public static AppConfig getInstance() {
        if(appConfig == null) {
            return new AppConfig();
        }
        return appConfig;
    }
}
