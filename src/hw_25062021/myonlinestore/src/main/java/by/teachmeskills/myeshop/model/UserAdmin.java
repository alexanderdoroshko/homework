package by.teachmeskills.myeshop.model;

import java.util.Objects;

public class UserAdmin {
    private String name;
    private String password;

    public UserAdmin(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAdmin userAdmin = (UserAdmin) o;
        return name.equals(userAdmin.name) && password.equals(userAdmin.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }

    @Override
    public String toString() {
        return "UserAdmin{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
