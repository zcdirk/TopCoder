import org.junit.Test;

import static org.junit.Assert.*;

public class ANDEquationTest {
    @Test
    public void test0() {
        assertEquals(1, new ANDEquation().restoreY(new int[]{1,3,5}));
    }
    @Test
    public void test1() {
        assertEquals(7, new ANDEquation().restoreY(new int[]{31, 7, 7}));
    }
    @Test
    public void test2() {
        assertEquals(0, new ANDEquation().restoreY(new int[]{1,0,0,1,0,1,0,1,0,0,0,0,0,0,0,1,0,0, 0,0,0,0,0,0,1,0,1,0,1,1,0,0,0,1}));
    }
    @Test
    public void test3() {
        assertEquals(1, new ANDEquation().restoreY(new int[]{1,3,5}));
    }
    @Test
    public void test4() {
        assertEquals(1, new ANDEquation().restoreY(new int[]{1,3,5}));
    }
    @Test
    public void test5() {
        assertEquals(1, new ANDEquation().restoreY(new int[]{1,3,5}));
    }
    @Test
    public void test6() {
        assertEquals(1, new ANDEquation().restoreY(new int[]{1,3,5}));
    }
}