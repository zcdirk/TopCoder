/**
 * Many languages, including English, French, Spanish, and
 * German use Latin characters (a-z). Hawaiian, as well,
 * uses these characters. However, only a small subset of
 * these characters are used in the Hawaiian alphabet -
 * the five vowels: 'a', 'e', 'i', 'o', 'u', and seven
 * consonants: 'h', 'k', 'l', 'm', 'n', 'p', 'w'.
 * Given a sentence of words, you are to determine
 * which could possibly be Hawaiian words.
 * Anything which contains a letter not in the Hawaiian
 * alphabet cannot be Hawaiian; every other word can be.
 *
 * A word is defined as a contiguous sequence of letters.
 * You will be given a sentence of words. You must tokenize
 * them using a space (' ') as a delimiter, remove the words
 * which cannot be Hawaiian, and return the rest in a ,
 * in the order in which they occur in the sentence,
 * in the same case in which they appear in the sentence.
 */
import java.util.*;

public class Hawaiian {
    public String[] getWords(String sentence) {
        // initialize char set
        char[] table = new char[]{'a', 'e', 'i', 'o', 'u', 'h', 'k', 'l', 'm', 'n', 'p', 'w'};
        Set<Character> set = new HashSet<>();
        for (char c: table) set.add(c);
        String[] strs = sentence.split(" ");
        List<String> list = new ArrayList<>();

        for (String s: strs) {
            if (s.equals("")) continue;
            boolean isHawaiian = true;
            for (char c: s.toLowerCase().toCharArray()) {
                if (!set.contains(c)) {
                    isHawaiian = false;
                    break;
                }
            }
            if (isHawaiian)
                list.add(s);
        }

        // convert to array
        String[] res = new String[list.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = list.get(i);
        return res;
    }
}
