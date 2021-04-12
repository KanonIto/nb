
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

public class K95 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);

        final int ninzu = 5;
        int[][] tensu = new int[ninzu][2];
        int sumJap = 0;
        int sumMath = 0;

        System.out.println("点数入力");
        for (int i = 0; i < ninzu; i++) {
            System.out.println((i + 1) + "人目");
            System.out.print("国語：");
            tensu[i][0] = stdIn.nextInt();
            System.out.print("数学：");
            tensu[i][1] = stdIn.nextInt();
            sumJap += tensu[i][0];
            sumMath += tensu[i][1];
        }

        System.out.println("国語平均　" + (double) sumJap / ninzu);
        System.out.println("数学平均  " + (double) sumMath / ninzu);

    }

}
