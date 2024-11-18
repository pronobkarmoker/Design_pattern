package Miscellaneous;

public class User {
    private String name;
    private boolean hasRestrictedAccess;

    public User(String name, boolean hasRestrictedAccess) {
        this.name = name;
        this.hasRestrictedAccess = hasRestrictedAccess;
    }

    public boolean hasAccessPermission(String itemID) {
        // Simulating access control logic
        return hasRestrictedAccess || !itemID.startsWith("restricted");
    }
}

