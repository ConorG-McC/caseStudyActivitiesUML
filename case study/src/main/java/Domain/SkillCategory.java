package Domain;

import java.util.Objects;
import java.util.UUID;

public class SkillCategory extends Skill {
    private UUID categoryID;
    private String categoryName;

    public SkillCategory(UUID skillID, String skillDescription, UUID categoryID, String categoryName) {
        super(skillID,skillDescription);
        this.categoryID = categoryID;
        this.categoryName = categoryName;
    }

    public UUID getCategoryID() {
        return categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "SkillsCategory{" +
                "categoryID=" + categoryID +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkillCategory that = (SkillCategory) o;
        return Objects.equals(categoryID, that.categoryID) && Objects.equals(categoryName, that.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryID, categoryName);
    }
}
