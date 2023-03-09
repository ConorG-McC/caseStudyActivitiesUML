package Domain;

import globals.classENUMS.SystemRole;

import java.util.ArrayList;
import java.util.List;

public class Manager extends User{

    private List<StaffUser> staffManaged;

    public Manager(String userName, String password, SystemRole systemRole, String firstName, String surname) {
        super(userName, password, systemRole, firstName, surname);
        this.staffManaged = new ArrayList<>();
    }

    public void addStaff(StaffUser staffUser){
        //validation somewhere/sometime
        staffManaged.add(staffUser);

    }

    public void removeStaff(StaffUser staffUser){
        //validation somewhere/sometime
        staffManaged.remove(staffUser);
    }

    //convert arrayList to array later on

}
