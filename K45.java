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
public class K45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        System.out.println("0:グー,1:チョキ,2:パー");
        System.out.print("手を選択:");
        int num = stdIn.nextInt();
                   
        
        Random rand = new Random();
        int hand = rand.nextInt(3);
 
        
        switch(hand){
            case 0:
                System.out.println("コンピュータ:グー");
        switch (num) {
            case 0:
                System.out.println("あいこです");
                break;
            case 1:
                System.out.println("あなたの負けです");
                break;
            case 2:
                System.out.println("あなたの勝ちです");
                break;
         }
        
                break;
            case 1:
                System.out.println("コンピュータ:チョキ");
        switch (num) {
            case 1:
                System.out.println("あいこです");
                break;
            case 2:
                System.out.println("あなたの負けです");
                break;
            case 0:
                System.out.println("あなたの勝ちです");
                break;
           
        }
                break;
            case 2:
                System.out.println("コンピュータ:パー");
        switch (num) {
            case 3:
                System.out.println("あいこです");
                break;
            case 0:
                System.out.println("あなたの負けです");
                break;
            case 1:
                System.out.println("あなたの勝ちです");
                break;
           
        }
                break;
                
        }
  
    }
    
}
