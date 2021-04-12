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

public class K103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1からnまでの和を求めます");
        System.out.print("nの値：");
        int num = stdIn.nextInt();
        int result = sumup(num);
        System.out.println("1から" + num + "までの和は" + result + "です");

    }

    static int sumup(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }

}
