import org.junit.Test;

import static org.junit.Assert.*;

public class HawaiianTest {
    @Test
    public void test0() {
        assertArrayEquals(new String[]{"Hawaii", "an"},
                new Hawaiian().getWords("Hawaii is an island"));
    }
    @Test
    public void test1() {
        assertArrayEquals(new String[]{"Mauna", "Kea", "Mauna", "Koa"},
                new Hawaiian().getWords("Mauna Kea and Mauna Koa are two mountains"));
    }
    @Test
    public void test2() {
        assertArrayEquals(new String[]{"Pineapple", "in", "Hawaii"},
                new Hawaiian().getWords("Pineapple grows in Hawaii"));
    }
}