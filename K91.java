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

public class K91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("要素数：");
        int num = stdIn.nextInt();

        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            int ran = rand.nextInt(10);
            a[i] = ran;

        }

        for (int i = 0; i < num; i++) {
            if (i % 2 == 1) {
                System.out.println("a[" + i + "]=" + a[i]);
            }
        }
    }

}
