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

public class K86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        String[] month = new String[13];
        month[1] = "January";
        month[2] = "February";
        month[3] = "March";
        month[4] = "April";
        month[5] = "May";
        month[6] = "June";
        month[7] = "July";
        month[8] = "August";
        month[9] = "September";
        month[10] = "October";
        month[11] = "November";
        month[12] = "December";
        int que = rand.nextInt(12) + 1;

        System.out.println("英語の月名を入力\n先頭は大文字で、2文字目以降は小文字とします");

        for (int i = 0; i >= 0; i++) {
            System.out.print(que + "月：");
            String ans = stdIn.next();

            if (month[que].equals(ans)) {
                System.out.println("正解です");
                break;
            } else {
                System.out.println("違います");
            }
        }
    }

}
