/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fdp.bo;

public abstract class Gun {

    private String name;
    private String model;

    public Gun() {
        System.out.println("Default Constructor");
    }

    public Gun(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    /**
     *
     */
    public abstract void shoot();
    public void test(){
        System.out.println("test from parent");
    }
}


