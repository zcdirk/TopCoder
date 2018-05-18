import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zcdirk on 5/17/18.
 */
public class RangeEncodingTest {
    @Test
    public void test0() {
        assertEquals(1, new RangeEncoding().minRanges(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
    @Test
    public void test1() {
        assertEquals(6, new RangeEncoding().minRanges(new int[]{1,6,10,20,32,49}));
    }
    @Test
    public void test2() {
        assertEquals(4, new RangeEncoding().minRanges(new int[]{2,4,5,6,8,9,10,11,12,15}));
    }
    @Test
    public void test3() {
        assertEquals(14, new RangeEncoding().minRanges(new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47}));
    }
    @Test
    public void test4() {
        assertEquals(4, new RangeEncoding().minRanges(new int[]{10,11,12,13,14,15,20,21,22,23,25,27,28,29,30,31,32,33}));
    }
    @Test
    public void test5() {
        assertEquals(1, new RangeEncoding().minRanges(new int[]{33}));
    }
}