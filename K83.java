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

public class K83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("要素数：");
        int n = stdIn.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10) + 1;
            System.out.println("a[" + i + "]:" + a[i]);
        }

    }

}
