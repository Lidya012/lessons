package com.lidiya.project.lesson17;

import java.util.Objects;

public class ClientAuthData {
    public enum Role {
        USER, ADMIN, MODERATOR
    }

    private String userName;
    private String password;
    private Role role;

    public ClientAuthData(String userName, String password, Role role) {
        this.userName = userName;
        this.password = password;
        this.role = role;
    }
    // геттеры, сеттеры, equals, hashCode, toString

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientAuthData that = (ClientAuthData) o;
        return Objects.equals(userName, that.userName) && Objects.equals(password, that.password) && role == that.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, password, role);
    }

    @Override
    public String toString() {
        return "ClientData{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}

