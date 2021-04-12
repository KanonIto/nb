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

public class K85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner stdIn = new Scanner(System.in);
        int[] a = new int[10];
        int sum = 0;
        int i = 0;
        for (i = 0; i <= 9; i++) {
            System.out.print("整数値：");
            int x = stdIn.nextInt();
            a[i] = x;
            sum = sum + x;

            if (sum >= 100) {
                break;
            }

        }
        System.out.print("入力された数値：");
        if (i == 10) {
            for (int j = 0; i - 1 >= j; j++) {
                System.out.print(a[j] + " ");
            }
        } else {
            for (int j = 0; i >= j; j++) {
                System.out.print(a[j] + " ");
            }
        }
        }

    }
