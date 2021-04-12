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
public class K32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner stdIn = new Scanner(System.in);
         System.out.print("演算（0：足し算,1:引き算）:");
          int a = stdIn.nextInt();
          
          if(a==0){
              System.out.print("値1:");
              int numx = stdIn.nextInt();
               System.out.print("値2:");
              int numy = stdIn.nextInt();
               int ans = numx + numy;
             System.out.println(numx + "+" + numy + "=" + ans );
          }else{
               System.out.print("値1:");
              int numx = stdIn.nextInt();
               System.out.print("値2:");
              int numy = stdIn.nextInt();
               int ans = numx - numy;
             System.out.println(numx + "-" + numy + "=" + ans );
          }
         
         
    }
    
}
