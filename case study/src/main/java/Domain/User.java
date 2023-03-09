package Domain;

import globals.classENUMS.SystemRole;

import java.util.Objects;
import java.util.UUID;

public abstract class User {
    private UUID userID;
    private String userName;
    private String password;
    private SystemRole systemRole;
    private String firstName;
    private String surname;

    public User(String userName, String password, SystemRole systemRole, String firstName, String surname) {
        this.userName = userName;
        this.password = password;
        this.systemRole = systemRole;
        this.firstName = firstName;
        this.surname = surname;
    }

    public UUID getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public SystemRole getSystemRole() {
        return systemRole;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", systemRole=" + systemRole +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userID, user.userID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID);
    }
}
