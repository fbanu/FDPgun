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
public class Gunfactory {
    public static Gun get(String key){
        if(key.equalsIgnoreCase("r")){
            return new Rifle();
        }
        else if(key.equalsIgnoreCase("mg")){
        return new Machinegun();
        }
        else if(key.equalsIgnoreCase("sg")){
        return new Shotgun();
        }
        return null;
    }
}
