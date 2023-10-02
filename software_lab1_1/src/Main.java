public class Main {
    public static void main(String[] args) {

        SetAdmin configManager = SetAdmin.getInstance();

        System.out.println("Database URL: " + configManager.getDatabaseUrl());
        System.out.println("Username: " + configManager.getUsername());
        System.out.println("Password: " + configManager.getPassword());

        SetAdmin anotherConfigManager = SetAdmin.getInstance();
        System.out.println(configManager == anotherConfigManager); // Should print true
    }
}