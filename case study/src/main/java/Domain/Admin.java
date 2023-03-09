package Domain;

import globals.classENUMS.SystemRole;

public class Admin extends User{
    public Admin(String userName, String password, SystemRole systemRole, String firstName, String surname) {
        super(userName, password, systemRole, firstName, surname);
    }
}
