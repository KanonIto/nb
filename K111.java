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

public class K111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        final int ninzu = 5;
        int[] tensu = new int[ninzu];

        System.out.println(ninzu + "人の点数を入力せよ");
        for (int i = 0; i < ninzu; i++) {
            System.out.print((i + 1) + "番目の点数：");
            tensu[i] = stdIn.nextInt();
        }
        minOf(tensu);

    }

    static void minOf(int[] x) {
        int min = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }

        }
        System.out.print("最低点は" + min + "点です。");
    }

}
