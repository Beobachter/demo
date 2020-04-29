package com.cfx.demo.vo;

public class UserVO {

    private static int sex;

    static {
        System.out.println(sex);
    }


    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
