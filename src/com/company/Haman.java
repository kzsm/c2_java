package com.company;

/**
 * Created by Administrator on 2017/8/9.
 */
public class Haman extends Animal {

    public Haman() {
    }

    public Haman(String name, int age) {
        super(name, age);
    }

    public Haman(String name, int age, String country) {
        super(name, age);
        this.country = country;
    }

    private String country;

    public void say(){
        System.out.println("this is"+getName()+":"+getAge()+":"+country);
    }
}
