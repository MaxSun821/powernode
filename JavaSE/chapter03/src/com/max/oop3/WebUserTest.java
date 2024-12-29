package com.max.oop3;

public class WebUserTest {
    public static void main(String[] args) {
        WebUser user = new WebUser("001", "12345");
        System.out.println(user.getUserId());
        System.out.println(user.getPassword());
        System.out.println(user.getEmail());
    }
}
