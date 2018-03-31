/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supervisiontracker;

import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergiu Borlovan <sergiuborlovan.co.uk>
 */
public class SupervisionCoreTest {
    
    public SupervisionCoreTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getDate method, of class SupervisionCore.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        SupervisionCore instance = new SupervisionCore();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDate method, of class SupervisionCore.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date s = null;
        SupervisionCore instance = new SupervisionCore();
        instance.setDate(s);

    }

    /**
     * Test of getSupervisionNotes method, of class SupervisionCore.
     */
    @Test
    public void testGetSupervisionNotes() {
        System.out.println("getSupervisionNotes");
        String s = "";
        SupervisionCore instance = new SupervisionCore();
        String expResult = "";
        String result = instance.getSupervisionNotes(s);
        assertEquals(expResult, result);

    }

    /**
     * Test of setSupervisionNotes method, of class SupervisionCore.
     */
    @Test
    public void testSetSupervisionNotes() {
        System.out.println("setSupervisionNotes");
        String s1 = "";
        String s2 = "";
        SupervisionCore instance = new SupervisionCore();
        instance.setSupervisionNotes(s1, s2);

    }
    
}
