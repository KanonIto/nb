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
public class K31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner stdIn = new Scanner(System.in);
         System.out.println("2つの正の整数値の差を求めます");
         System.out.print("値1:");
         int numx = stdIn.nextInt();
         System.out.print("値2:");
         int numy = stdIn.nextInt();
         
         if(numx>numy){
             int ans = numx - numy;
             System.out.println(numx + "と" + numy + "の差は" + ans + "です");
         }else{
             int ans =  numy - numx ;
             System.out.println(numx + "と" + numy + "の差は" + ans + "です");
         }
             
         
         
    }
    
}
