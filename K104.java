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

public class K104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数：");
        int num = stdIn.nextInt();
        boolean b = isEven(num);
        System.out.println(num + "は偶数：" + b);

    }

    static boolean isEven(int num) {
//        if (num % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
        return num % 2 == 0;
    }

}
