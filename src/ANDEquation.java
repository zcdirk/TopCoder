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
