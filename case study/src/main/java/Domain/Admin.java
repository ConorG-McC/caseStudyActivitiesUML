package Domain;

import globals.classENUMS.SystemRoles;

public class Admin extends User {
    public Admin(String userName, String password, SystemRoles systemRoles, String firstName, String surname) {
        super(userName, password, systemRoles, firstName, surname);
    }
}
