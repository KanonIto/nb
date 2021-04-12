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
public class K55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("nの値:");
        int n = stdIn.nextInt();
        
        int sum = 0;
        int i = 1;
        while(i<n+1) {
            if(i % 2 == 0){
               sum = sum + i;
            i = i +1;  
            }else{
                sum = sum;
                i = i + 1;        
            }               
         }
      
         while(i>n-1) {
            if(i % 2 == 0){
               sum = sum + i;
            i = i -1;  
            }else{
                sum = sum;
                i = i - 1;        
            }
        }       
           
        
        System.out.println("1から"+n+"までの偶数値の和は" + sum);
        
    }
    
}
