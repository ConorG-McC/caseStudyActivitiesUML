package Domain;

import globals.classENUMS.SystemRoles;

import java.util.Objects;
import java.util.UUID;

public abstract class User {

    private UUID UniqueID;
    private String userName;
    private String password;
    private SystemRoles systemRoles;
    private String firstName;
    private String surname;

    public User(String userName, String password, SystemRoles systemRoles, String firstName, String surname) {
        this.userName = userName;
        this.password = password;
        this.systemRoles = systemRoles;
        this.firstName = firstName;
        this.surname = surname;
    }

    public UUID getUniqueID() {
        return UniqueID;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public SystemRoles getSystemRoles() {
        return systemRoles;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    //may need setters for names, so that users can change their name

    @Override
    public String toString() {
        return "User{" +
                "UniqueID=" + UniqueID +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", systemRoles=" + systemRoles +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(UniqueID, user.UniqueID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(UniqueID);
    }
}



