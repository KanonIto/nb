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

public class K105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        System.out.print("記号：");
        String s = stdIn.next();
        System.out.print("回数：");
        int num = stdIn.nextInt();
        printChar(s, num);

    }

    static void printChar(String s, int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(s);
        }
    }

}
