package globals.classENUMS;

public enum SystemRole {
    ADMIN("Admin"),
    Manager("Manager"),
    StaffUser("Staff User");

    private final String SystemRole;

    SystemRole(String systemRole) {
        SystemRole = systemRole;
    }
}
