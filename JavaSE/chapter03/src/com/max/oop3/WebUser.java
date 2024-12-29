package com.max.oop3;

public class WebUser {
    private String userId;
    private String password;
    private String email;

    public WebUser() {}

    public WebUser(String userId, String password) {
        this.userId = userId;
        this.password = password;
        this.email = userId + "@powernode.com";
    }

    public WebUser(String userId, String password, String email) {
        this.userId = userId;
        this.password = password;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
