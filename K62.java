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
public class K62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("桁数を出力します。\nnの値：");

        int n = stdIn.nextInt();
        int syo =0;
       int i =0;
           do{
               i++;
               syo = (int) (n/Math.pow(10, i));
               
           }while(syo>0);
      
        
        
        System.out.println("結果："+i+"桁です");
    }
    
}
