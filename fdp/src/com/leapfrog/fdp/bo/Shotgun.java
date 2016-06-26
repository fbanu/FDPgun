/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fdp.bo;

/**
 *
 * @author User
 */
public class Shotgun extends Gun {
    @Override
    public void shoot(){
    System.out.println(getName() +"is a shotgun and it can shoot.");
    }
    @Override
    public void test(){
        System.out.println("hmmmmm");
    }

}
