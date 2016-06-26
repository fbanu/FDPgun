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
public class Machinegun extends Gun {

    @Override
    public void shoot() {
        System.out.println(getName()+"is a Machine Gun and it can shoot.");
    }
    public void test(){
        System.out.println("test");
    
    }
}
