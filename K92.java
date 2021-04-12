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
import java.util.Random;

public class K92 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("行：");
        int h = stdIn.nextInt();

        System.out.print("列：");
        int v = stdIn.nextInt();

        int[][] x = new int[h][v];
        
        System.out.println("2次元配列を生成し、乱数で埋めます");

//        for (int i = 0; i < h; i++) {
//            for (int j = 0; j < v; j++) {
//                x[i][j] = rand.nextInt(10);
//                System.out.println("x[" + i + "][" + j + "]=" + x[i][j]);
//            }
//        }
        
        System.out.print("行：");
        int l = stdIn.nextInt();

        System.out.print("列：");
        int m = stdIn.nextInt();
        System.out.println( x[l][m]);
        

    }

}
