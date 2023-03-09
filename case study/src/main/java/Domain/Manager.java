package Domain;

import globals.classENUMS.SystemRoles;

import java.util.ArrayList;
import java.util.List;

public class Manager extends User{

    private List<StaffUser> staffManaged;


    public Manager(String userName, String password, SystemRoles systemRoles, String firstName, String surname) {
        super(userName, password, systemRoles, firstName, surname);
        this.staffManaged = new ArrayList<>();
        //need valadation
    }

    public void addStaff(StaffUser staffUser){
        //need valadation
        staffManaged.add(staffUser);
    }
    public void removeStaff(StaffUser staffUser){
        //need valadation
        staffManaged.remove(staffUser);
    }

    //need to command to covert arrayLost to array

}
