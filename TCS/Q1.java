
import java.util.*;

public class Q1 {

    static void applyGravity(char[][] box) {

        int rows = box.length;
        int cols = box[0].length;

        for (int col = 0; col < cols; col++) {

            int write = rows - 1;

            for (int row = rows - 1; row >= 0; row--) {

                if (box[row][col] == '*') {

                    box[write][col] = '*';
                    write--;
                }
            }

            while (write >= 0) {
                box[write][col] = '.';
                write--;
            }
        }
    }

    static char[][] rotateRight(char[][] box) {

        int rows = box.length;
        int cols = box[0].length;

        char[][] rotated = new char[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                rotated[j][rows - 1 - i] = box[i][j];
            }
        }

        return rotated;
    }

    static char[][] rotateLeft(char[][] box) {

        int rows = box.length;
        int cols = box[0].length;

        char[][] rotated = new char[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                rotated[cols - 1 - j][i] = box[i][j];
            }
        }

        return rotated;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        char[][] box = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                box[i][j] = sc.next().charAt(0);
            }
        }

        int k = sc.nextInt();

        applyGravity(box);

        for (int i = 0; i < k; i++) {

            String direction = sc.next();

            if (direction.equalsIgnoreCase("right")) {

                box = rotateRight(box);

            } else if (direction.equalsIgnoreCase("left")) {

                box = rotateLeft(box);
            }

            applyGravity(box);
        }

        for (int i = 0; i < box.length; i++) {

            for (int j = 0; j < box[0].length; j++) {

                System.out.print(box[i][j] + " ");
            }

            System.out.println();
        }


    }
}
