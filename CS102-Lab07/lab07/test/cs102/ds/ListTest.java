/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs102.ds;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author deniz
 */
public class ListTest {
    
    public ListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addToHead method, of class List.
     */
    @Test
    public void testAddToHead() {
        System.out.println("addToHead");
        String item = "";
        List instance = new List();
        instance.addToHead(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToTail method, of class List.
     */
    @Test
    public void testAddToTail() {
        System.out.println("addToTail");
        String item = "";
        List instance = new List();
        instance.addToTail(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFromHead method, of class List.
     */
    @Test
    public void testRemoveFromHead() {
        System.out.println("removeFromHead");
        List instance = new List();
        String expResult = "";
        String result = instance.removeFromHead();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class List.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        List instance = new List();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class List.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        int index = 0;
        List instance = new List();
        String expResult = "";
        String result = instance.getData(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class List.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        List instance = new List();
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printReverse method, of class List.
     */
    @Test
    public void testPrintReverse() {
        System.out.println("printReverse");
        List instance = new List();
        instance.printReverse();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class List.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        String target = "";
        List instance = new List();
        boolean expResult = false;
        boolean result = instance.contains(target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOrdered method, of class List.
     */
    @Test
    public void testIsOrdered() {
        System.out.println("isOrdered");
        List instance = new List();
        boolean expResult = false;
        boolean result = instance.isOrdered();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class List.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        List instance = new List();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createFrom method, of class List.
     */
    @Test
    public void testCreateFrom_StringArr() {
        System.out.println("createFrom");
        String[] temp = null;
        List expResult = null;
        List result = List.createFrom(temp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createFrom method, of class List.
     */
    @Test
    public void testCreateFrom_String() {
        System.out.println("createFrom");
        String temp = "";
        List expResult = null;
        List result = List.createFrom(temp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of merger method, of class List.
     */
    @Test
    public void testMerger() {
        System.out.println("merger");
        List a = null;
        List b = null;
        List expResult = null;
        List result = List.merger(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class List.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        List.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
