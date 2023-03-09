package Domain;

import globals.classENUMS.JobRole;
import globals.classENUMS.SystemRoles;


public class StaffUser extends User{

    private JobRole jobRole;

    public StaffUser(String userName, String password, SystemRoles systemRoles, String firstName, String surname, JobRole jobRole) {
        super(userName, password, systemRoles, firstName, surname);
        this.jobRole = jobRole;
    }

    public JobRole getJobRole() {
        return jobRole;
    }

    public void setJobRole(JobRole jobRole) {
        this.jobRole = jobRole;
    }

    @Override
    public String toString(){
        return super.toString() + jobRole;

    }
}
