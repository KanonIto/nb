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

public class K93 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);

        System.out.print("何人ですか:");
        final int ninzu = stdIn.nextInt();
        int[] tensu = new int[ninzu];
        int sum = 0;

        System.out.println(ninzu + "人の点数を入力せよ。");
        for (int i = 0; i < ninzu; i++) {
            System.out.print((i + 1) + "番の点数：");
            tensu[i] = stdIn.nextInt();
            sum += tensu[i];
        }

        int max = tensu[0];
        int min = tensu[0];
        for (int i = 1; i < tensu.length; i++) {
            if (tensu[i] > max) {
                max = tensu[i];
            }
            if (tensu[i] < min) {
                min = tensu[i];
            }

        }
        System.out.println("合計は"+sum+"点です。");
         System.out.println("平均は"+(double)sum/ninzu+"点です。");
          System.out.println("最高点は"+max+"点です。");
           System.out.println("最低点は"+min+"点です。");

    }

}
