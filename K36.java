/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a8118013
 */
import java.util.Random;
import java.util.Scanner;
public class K36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();
        int x = rand.nextInt(10);
        
        System.out.println("数あてゲーム");
        System.out.print("0以上10未満の数字を入力:");
        int a = stdIn.nextInt();
        
        if(a==x){
            System.out.println("正解！");
        }else{
            System.out.println("はずれ！正解は"+x+"です");
        }
    }
    
}
