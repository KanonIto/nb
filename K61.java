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
public class K61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner stdIn = new Scanner(System.in);
         
         System.out.print("記号文字列を表示します。\n個数：");
         int n = stdIn.nextInt();
         int i =0;
         for( i =1; i<=n;i= i+1){
        if(i%2==1){
            System.out.print('+');
        }else{
            System.out.print('*');
        }
       
        
    }
         
         
    }
    
}
