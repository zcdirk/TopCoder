/**
 * In genetics, most large animals have two copies of every gene
 * - one from each parent. In the simplest genetic model,
 * each of the genes takes on one of two forms,
 * usually represented by an uppercase and lowercase letter
 * of the same value ('A' and 'a', for example).
 * The pair of genes typically contributes to the external
 * qualities of the animal in one of two ways. If both genes are uppercase,
 * they contribute in one way, while if both genes are lowercase,
 * they contribute in another way. If one gene is uppercase and the other
 * is lowercase, then the pair acts like either a pair of uppercase genes
 * or a pair of lowercase genes depending on whether the gene represented
 * by the uppercase letter is dominant or recessive, respectively.
 *
 * In this problem, you will be given two s, g1 and g2, each representing
 * the genes from one parent. Hence, two characters from g1 and g2 with
 * the same index make up a single gene. You will also be given a , dom,
 * telling you whether an uppercase gene is dominant or recessive,
 * represented by 'D' and 'R', respectively (characters of dom correspond
 * to characters of g1 and g2 with the same index). You are to return
 * a representing the external qualities of each pair of genes.
 * If a pair of genes has the quality of two uppercase letters,
 * the return should have an uppercase letter, and if not the return
 * should have a lowercase letter. In either case, each letter should
 * have the same value as the corresponding letters of g1 and g2.
 */
public class Genetics {
    public String getOffspring(String g1, String g2, String dom) {
        StringBuilder sb = new StringBuilder();
        int len = g1.length();
        for (int i = 0; i < len; i++) {
            char c1 = g1.charAt(i), c2 = g2.charAt(i), cd = dom.charAt(i);
            if (Character.isUpperCase(c1) ^ Character.isUpperCase(c2)) {
                if (Character.isUpperCase(c1)) {
                    sb.append(cd == 'D' ? c1 : c2);
                } else {
                    sb.append(cd == 'D' ? c2 : c1);
                }
            } else {
                sb.append(c1);
            }
        }
        return sb.toString();
    }
}
