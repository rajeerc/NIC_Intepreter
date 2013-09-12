/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Rajith
 */
public class IntepreterNGTest {
    private Intepreter in;
    
    @BeforeClass
    public void setUpClass() throws Exception {
        in = new Intepreter("911732270V");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getValue method, of class Intepreter.
     */
    @Test
    public void testGetValue() {

        String expResult = "911732270V";
        String result = in.getValue();
        assertEquals(result, expResult);

    }
}
