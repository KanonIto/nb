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

public class K94 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("10個の整数値を入力します");

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "個目：");
            a[i] = stdIn.nextInt();
        }

        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("最小値：" + min);
         System.out.print("最小値の入力(番号)：");
        for(int i =0; i<a.length; i++){
            if(min==a[i]){
                System.out.print(i+1+" ");
            }
        }

    }
}
