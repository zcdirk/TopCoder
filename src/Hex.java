/**
 *   _
 *  /h\_
 *  \_/ \_
 *  /v\_/ \_
 *  \_/ \_/ \
 *  /v\_/h\_/
 *  \_/ \_/ \
 *  /v\_/ \_/
 *  \_/ \_/ \
 *    \_/ \_/
 *      \_/ \
 *        \_/
 *
 *  Above is a picture of a 4 x 4 Hex game in progress.
 *  The board is a 4 x 4 collection of hexagons packed together,
 *  with 4 hexagons in each vertical column, and 4 hexagons in each
 *  diagonal from upper left to lower right.
 *  Two players play against each other.
 *  One of the players ('h') tries to make a horizontal
 *  chain of adjacent hexagons stretching between the left and right of the board.
 *  The other player ('v') tries to make a vertical chain of adjacent hexagons
 *  stretching from the bottom to the top of the board.
 *
 *  We can refer to any position on the board by a pair of coordinates
 *  giving the diagonal distance and vertical distance from the upper left hexagon.
 *  Using these coordinates, the two hexagons marked 'h' are located at (0,0) and at (2,1).
 *
 *  Given the size of the board and a list of all the marked hexagons,
 *  we want software that can draw the board using characters as shown above.
 *  Create a class Hex that contains a method picture that is given
 *  n  (the vertical and diagonal size of the board) and
 *  marks (a list of all the marked hexagons) and that returns a
 *  picture of the board in the format shown above.
 *  The return will be a that if printed one per line in order would
 *  produce the picture. Each element of the return should have no
 *  trailing spaces, and at least one of the elements should have no leading spaces.
 *
 *  marks will be a in which each element will consist of exactly 3 characters:
 *  two digits giving the diagonal and then the vertical coordinate of a hexagon,
 *  followed by either 'v' or 'h', the marking of that hexagon.
 */
public class Hex {
    public String[] picture(int n, String[] marks) {
        StringBuilder[] res = new StringBuilder[3 * n];
        char[][] table = new char[n][n];
        for (String m: marks)
            table[m.charAt(0) - '0'][m.charAt(1) - '0'] = m.charAt(2);

        // initialization
        res[0] = new StringBuilder(" ");
        for (int i = 0; i < n; i++) {
            res[2 * i + 1] = new StringBuilder("/");
            res[2 * i + 2] = new StringBuilder("\\");
        }
        StringBuilder sb = new StringBuilder("  ");
        for (int i = 1; i < n; i++) {
            res[2 * n + i] = new StringBuilder(sb).append("\\");
            sb.append("  ");
        }

        // add all chars
        for (int i = 0; i < n; i++) {
            res[i].append('_');
            for (int j = 0; j < n; j++) {
                if (table[i][j] == 'h') {
                    res[i + 2 * j + 1].append("h\\");
                } else if (table[i][j] == 'v') {
                    res[i + 2 * j + 1].append("v\\");
                } else {
                    res[i + 2 * j + 1].append(" \\");
                }
                res[i + 2 * j + 2].append("_/");
            }
        }

        // change to String
        String[] sa = new String[3 * n];
        for (int i = 0; i < 3 * n; i++)
            sa[i] = res[i].toString();
        return sa;
    }
}
