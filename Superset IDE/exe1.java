class ConfigurationManager {
    private ConfigurationManager() {
        System.out.println("Loading configuration...");
    }

    private static class Holder {
        private static final ConfigurationManager INSTANCE = new ConfigurationManager();
    }

    public static ConfigurationManager getInstance() {
        return Holder.INSTANCE;
    }

    public String getAppName() {
        return "Desk365 Chat System";
    }

    public int getTimeout() {
        return 5000;
    }
}

class Main {
    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        System.out.println("App: " + config1.getAppName());
        System.out.println("Timeout: " + config1.getTimeout());

        ConfigurationManager config2 = ConfigurationManager.getInstance();
        System.out.println(config1 == config2 ? "Same instance" : "Different instances");
    }
}
