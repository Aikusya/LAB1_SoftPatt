public class SetAdmin {
    private static SetAdmin instance;

    private String databaseURL;
    private String username;
    private String password;

    private SetAdmin() {
        // Load configuration data from a file or other sources
        this.databaseURL = "jdbc:mysql://localhost:1212/mydb";
        this.username = "Raasul";
        this.password = "1212";
    }

    public static SetAdmin getInstance() {
        if (instance == null) {
            instance = new SetAdmin();
        }
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseURL;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
