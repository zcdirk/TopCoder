/**
 * An AND-equation is an equation that looks like this:
 * X[0] AND X[1] AND ... AND X[N-1] = Y
 * Here X[i] and Y are non-negative integers and the bitwise
 * AND operation is defined in the Notes.
 *
 * In C++, C#, and Java the operator AND is denoted "&".
 * So for example (P & Q & R) is the bitwise AND of numbers P, Q, and R.
 * In VB the same operator is denoted "And".
 *
 * You are given a int[] A that contains exactly N+1 elements.
 * Your task is to construct an AND-equation using each element of
 * A exactly once. (That is, N of them will be on the left hand side of the AND-equation
 * and the remaining one will be on the right hand side.)
 * If this is possible, return the value of Y in this AND-equation.
 * If no AND-equation can be constructed, return -1.
 * (It can be shown that for each A there is at most one
 * possible value Y, so the return value is always defined correctly.)
 */
public class ANDEquation {
    public int restoreY(int[] A) {
        int len = A.length;
        for (int i = 0; i < len; i++) {
            int t = -1;
            for (int j = 0; j < len; j++) {
                if (i == j) continue;
                t = t == -1 ? A[j] : t & A[j];
            }
            if (t == A[i]) return t;
        }
        return -1;
    }
}
