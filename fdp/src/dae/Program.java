/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dae;
import com.leapfrog.fdp.bo.Gun;
import com.leapfrog.fdp.bo.Gunfactory;

/**
 *
 * @author User
 */
public class Program {
    public static void main(String[]args ){
        
        Gun g=Gunfactory.get("mg");
        g.setName("AK-47");
        g.setModel("122-98");
        g.test();
        g.shoot();
    }
}
