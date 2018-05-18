import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zcdirk on 5/17/18.
 */
public class HexTest {
    @Test
    public void test0() {
        String[] desiredAnswer = new String[]{
                " _",
                "/h\\_",
                "\\_/ \\_",
                "/v\\_/ \\_",
                "\\_/ \\_/ \\",
                "/v\\_/h\\_/",
                "\\_/ \\_/ \\",
                "/v\\_/ \\_/",
                "\\_/ \\_/ \\",
                "  \\_/ \\_/",
                "    \\_/ \\",
                "      \\_/" };
        assertArrayEquals(desiredAnswer,
                new Hex().picture(4, new String[]{"00h","21h","01v","03v","02v"}));
    }
    @Test
    public void test1() {
        String[] desiredAnswer = new String[]{
                " _",
                "/v\\_",
                "\\_/ \\_",
                "/v\\_/ \\",
                "\\_/h\\_/",
                "/v\\_/h\\",
                "\\_/ \\_/",
                "  \\_/ \\",
                "    \\_/" };
        assertArrayEquals(desiredAnswer,
                new Hex().picture(3, new String[]{"00v","01v","02v","11h","21h"}));
    }
}