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
    public void testSuccessfulLower10Cases(){
        assertEquals(1, cF(0));
        assertEquals(120, cF(5));
        assertEquals(720, cF(6));
    }
    @Test
    public void testSuccessfulUpper10Cases(){
        assertEquals(3_628_800, cF(10));
        assertEquals(39_916_800, cF(11));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionNegativeCases(){
        cF(-6);
        cF(-5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionGreater15Cases(){
        cF(16);
        cF(17);
    }
    
    
    
}
