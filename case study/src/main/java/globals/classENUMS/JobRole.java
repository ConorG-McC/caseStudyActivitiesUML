package globals.classENUMS;

public enum JobRole {
    JUNIOR_DEV("Junior Developer"),
    MID_DEV("Mid-Level Developer"),
    SENIOR_DEV("Senior Developer");

    private final String jobRole;

    JobRole(String jobRole) {
        this.jobRole = jobRole;
    }
}
