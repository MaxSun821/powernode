package com.max.oop2;

/**
 * ClassName: Customer
 * Package: com.max.oop2
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/12/29 13:37
 * @Version 1.0
 */
public class Customer {
    private String name;
    private String birthday;
    private boolean gender;
    private String telephone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void shopping() {
        System.out.println("You're shopping");
        pay();
    }

    public void pay() {
        System.out.println("You need to pay");
    }
}
