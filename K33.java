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
public class K33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner stdIn = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("９の倍数かどうかを調べます");
        System.out.print("値:");
        int a = stdIn.nextInt();
        
        if(a<=0){
            System.out.print("正ではない値が入力されました");
            
        }else{
            if(a%9==0){
                System.out.println("その値は9の倍数です");
            }else{
                System.out.println("その値は9の倍数ではありません");
            }
        }
        
    }
    
}
