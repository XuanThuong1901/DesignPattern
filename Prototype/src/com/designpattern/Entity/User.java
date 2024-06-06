package com.designpattern.Entity;

public class User implements IUser, Cloneable{

    private String user;
    private String name;
    private String password;

    public String getUser() {
        return user;
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

    public void setUser(String user) {
        this.user = user;
    }

    public User(String user, String name) {
        this.user = user;
        this.name = name;
    }

    public User(String user, String name, String password) {
        this.user = user;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public User Clone() {
        return new User(this.user, this.name);
    }

    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Không thể xảy ra, vì chúng ta đã triển khai Cloneable
        }
    }
}
