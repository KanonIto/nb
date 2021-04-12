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
public class K51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        
        
        int que;
        
        do {
            System.out.print("整数値:");
            int n = stdIn.nextInt();
       
        if (n>0)
            System.out.println("その値は正です。");
        else if (n<0)
            System.out.println("その値は負です。");
        else
            System.out.println("その値は0です。");
        
        System.out.print("もう一度繰り返しますか\n1…はい/0…いいえ:");
        que = stdIn.nextInt();
        
         }while (que == 1) ;       
        
    }
    
}
