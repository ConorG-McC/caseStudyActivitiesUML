package globals.classENUMS;

public enum SystemRoles {
    ADMIN("Admin"),
    Manager("Manager"),
    Staff("Staff User");

    private final String SystemRole;

    SystemRoles(String systemRole) {
        SystemRole = systemRole;
    }
}
