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

public class K84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数：");
        int n = stdIn.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = n - i;
            System.out.println("a[" + i + "]=" + a[i]);
        }

        System.out.print("整数値：");
        int y = stdIn.nextInt();

        if (n >= y) {
            System.out.println(y + "番目の要素：" + a[y]);
        } else {
            System.out.println("その番号の要素はありません");
        }

    }

}
