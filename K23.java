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
public class K23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
      Scanner stdIn = new Scanner(System.in);
          
     
                     
        System.out.println("台形の面積を求めます");
        System.out.print("上底は？");
         double x=stdIn.nextDouble();
         System.out.print("下底は？");
            double y=stdIn.nextDouble();
          System.out.print("高さは？");
          double z=stdIn.nextDouble();
          
          double area = (x+y)*z/2;
          System.out.println(area);
       
        
                
                
    }
    
}
