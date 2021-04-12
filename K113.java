/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a8118013
 */
import java.util.Scanner;

public class K113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        int[][] x = new int[2][2];
        int[][] y = new int[2][2];

        System.out.println("行列x");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("x[" + i + "][" + j + "]:");
                x[i][j] = stdIn.nextInt();
            }
        }
        System.out.println("行列y");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("y[" + i + "][" + j + "]:");
                y[i][j] = stdIn.nextInt();
            }
        }
        int[][] t = addMatrix(x, y);

        System.out.println("行列z");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("z[" + i + "][" + j + "]:" + t[i][j]);

            }
        }

    }

    static int[][] addMatrix(int[][] x, int[][] y) {
        int[][] z = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int sum = x[i][j] + y[i][j];
                z[i][j] = sum;
            }
        }
        return z;
    }

}
