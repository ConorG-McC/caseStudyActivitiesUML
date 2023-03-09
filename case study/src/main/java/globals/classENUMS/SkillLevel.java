package globals.classENUMS;

public enum SkillLevel {
    NONE("No Skill Level"),
    BASIC("Basic Skill Level"),
    ADVANCED("Advanced Skill Level"),
    EXPERT("Expert Skill Level");

    private final String skillLevel;

    SkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }
}
