/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1404;

import utils.MyToy;

/**
 *
 * @author HIEULC
 */
public class SE1404 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5! = " + MyToy.cF(5)); //expected 120
        System.out.println("6! = " + MyToy.cF(6));
        System.out.println("0! = " + MyToy.cF(0));
        System.out.println("-5! = " + MyToy.cF(-5));
    }
    
}
