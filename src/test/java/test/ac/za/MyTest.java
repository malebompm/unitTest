package test.ac.za;

import malebo.ac.za.*;
import org.junit.Test;
import static org.junit.Assert.*;
public class MyTest {

    Back me = new Back();
    boolean actaulVal= me.Check(3);
    boolean actaulVal2= me.Check(2);

    @Test
    public void TestBolean(){
        assertFalse(actaulVal);
        assertTrue(actaulVal2);
    }

    //assertEquals
    @Test
    public  void TestEqauls(){
        int expected = 28;
        int actual = me.GetAge(2020,1992);

        assertEquals(expected,actual);
    }

    //assertNull Checks that the object is null
    @Test
    public void TestNull (){
        //assertNull(me.Check(2));
        assertNotNull(me.Check(2));
    }

    @Test
    public  void CheckSame(){
        assertSame(me.GetAge(2020,1992),me.GetAge(2020,1992));
    }


}
