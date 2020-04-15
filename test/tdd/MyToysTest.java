/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import static utils.MyToy.cF;

/**
 *
 * @author HIEULC
 */
public class MyToysTest {
    
    @Test
    public void testSuccessfulCases(){
        assertEquals(1, cF(0));
        assertEquals(120, cF(5));
        assertEquals(720, cF(6));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionCases(){
        cF(-6);
        cF(-5);
    }
    
    
    
}
