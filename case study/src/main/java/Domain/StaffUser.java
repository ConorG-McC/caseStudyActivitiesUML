package Domain;

import globals.classENUMS.JobRole;
import globals.classENUMS.SystemRole;

public class StaffUser extends User{

    private JobRole jobRole;

    public StaffUser(String userName, String password, SystemRole systemRole, String firstName, String surname, JobRole jobRole) {
        super(userName, password, systemRole, firstName, surname);
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
