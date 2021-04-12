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

public class K123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);

        System.out.print("文字列:");
        String a = stdIn.next();
        System.out.print("逆さから読むと");
        int len = a.length();

        for (int i = len-1; i >= 0; i--) {
            System.out.print(a.charAt(i));

        }

    }

}
