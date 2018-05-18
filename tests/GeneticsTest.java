import org.junit.Test;

import static org.junit.Assert.*;

public class GeneticsTest {
    @Test
    public void test0() {
        assertEquals("AAAa",
                new Genetics().getOffspring("AAAA", "AAaa", "DRDR"));
    }
    @Test
    public void test1() {
        assertEquals("ABcdeFg",
                new Genetics().getOffspring("ABCDEFG", "abcdefg", "DDRRRDR"));
    }
    @Test
    public void test2() {
        assertEquals("Z",
                new Genetics().getOffspring("Z", "z", "D"));
    }
    @Test
    public void test3() {
        assertEquals("MGSKGzTFQoclnDJZU",
                new Genetics().getOffspring("MGskgzTFQoclnDjZu",
                        "mgSKGzTFQoClnDJzU",
                        "DDDDDRDDDDRDDDDDD"));
    }
}