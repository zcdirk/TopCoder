/**
 * A simple way to blur an image is to replace each pixel with the average
 * of it and its neighboring pixels. The value of each pixel in the blurred
 * image is computed by adding the values of the 3x3 region centered at the
 * corresponding pixel of the original image, and dividing by 9.
 *
 * When computing the value of pixels on the border, the 3x3 region
 * will fall partially outside of the original image. Assume that
 * pixels outside of the original image are black.
 *
 * Write a method that will, given a blurred image, return the original image.
 * The original image will contain only black and white pixels.
 * All pixels on the top and bottom rows and left and right columns of the original
 * image will be black. All values of the blurred image will therefore be:
 * 0 (black), 1/9, 2/9, 3/9, 4/9, 5/9, 6/9, 7/9, 8/9, or 9/9 (white).
 *
 * The blurred image will be given as a String[].
 * Each character in the blurred image will be a character between '0' and '9',
 * inclusive, giving the value of that pixel multiplied by nine.
 * For example, the blurred image above would be given as:
 * { "1233321000000000123332100000000000000000000",
 *   "1244422233222332334343323322232112332223321",
 *   "1255523344343443545343434434343233432334432",
 *   "0033303455465775633011445546454355753457753",
 *   "0033303333364543533011433336333364521346542",
 *   "0033303455464532445343545546454355753446542",
 *   "0022202344342200234343434434343233432323221",
 *   "0011101233221100123332223322232112332211111" }
 *
 *   Return the original image as a String[]. For each pixel in the original image,
 *   return a '.' if it is black and '#' if it is white.
 *   For example, the original image for the example above would be returned as:
 *   { "...........................................",
 *     ".#####...........#####.....................",
 *     "...#...####.####.#...#.####.###..####.####.",
 *     "...#...#..#.#..#.#.....#..#.#..#.#....#..#.",
 *     "...#...#..#.####.#.....#..#.#..#.###..####.",
 *     "...#...#..#.#....#...#.#..#.#..#.#....#.#..",
 *     "...#...####.#....#####.####.###..####.#..#.",
 *     "..........................................." }
 */
public class Unblur {
    public String[] original(String[] blurred) {
        int row = blurred.length, col = blurred[0].length();
        int[][] grid = new int[row][col];
        char[][] ub = new char[row][col];
        // change string to char
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                grid[i][j] = blurred[i].charAt(j) - '0';
        }

        // unblur
        for (int i = 1; i < row - 1; i++) {
            for (int j = 1; j < col - 1; j++) {
                if (grid[i - 1][j - 1] == 0) {
                    ub[i][j] = '.';
                } else {
                    ub[i][j] = '#';
                    for (int p = -1; p < 2; p++) {
                        for (int q = -1; q < 2; q++) {
                            grid[i + p][j + q]--;
                        }
                    }
                }
            }
        }

        // deal with edges
        for (int i = 0; i < col; i++) {
            ub[0][i] = '.';
            ub[row - 1][i] = '.';
        }
        for (int i = 0; i < row; i++) {
            ub[i][0] = '.';
            ub[i][col - 1] = '.';
        }

        //change char to string
        String[] res = new String[row];
        for (int i = 0; i < row; i++)
            res[i] = new String(ub[i]);
        return res;
    }
}

