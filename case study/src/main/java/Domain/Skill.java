package Domain;

import globals.classENUMS.SkillLevel;

import java.time.LocalDate;
import java.util.UUID;

public class Skill {
    private UUID skillID;
    private String skillDescription;
    private SkillCategory skillsCategory;
    private SkillLevel skillLevel;
    private LocalDate expiryDate;
    private String notes;

    public Skill(UUID skillID, String skillDescription, SkillCategory skillsCategory, SkillLevel skillLevel, LocalDate expiryDate, String notes) {
        this.skillID = skillID;
        this.skillDescription = skillDescription;
        this.skillsCategory = skillsCategory;
        this.skillLevel = skillLevel;
        this.expiryDate = expiryDate;
        this.notes = notes;
    }

    //this was being asked for by IDE, CHECK!!
    public Skill(UUID skillID, String skillDescription) {

    }

    public UUID getSkillID() {
        return skillID;
    }


    public String getSkillDescription() {
        return skillDescription;
    }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public SkillCategory getSkillsCategory() {
        return skillsCategory;
    }

    public void setSkillsCategory(SkillCategory skillsCategory) {
        this.skillsCategory = skillsCategory;
    }

    public SkillLevel getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(SkillLevel skillLevel) {
        this.skillLevel = skillLevel;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "skillID=" + skillID +
                ", skillDescription='" + skillDescription + '\'' +
                ", skillsCategory=" + skillsCategory +
                ", skillLevel=" + skillLevel +
                ", expiryDate=" + expiryDate +
                ", notes='" + notes + '\'' +
                '}';
    }
}
