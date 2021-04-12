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
public class K22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
      Scanner stdIn = new Scanner(System.in);
          
     
                     
        System.out.println("x,y,zの合計と平均を求めます");
        System.out.print("x:");
         int x=stdIn.nextInt();
         System.out.print("y:");
            int y=stdIn.nextInt();
          System.out.print("z:");
          int z=stdIn.nextInt();
          System.out.println("x:" +x+ ",y:" + y+ ",z:"+ z);
        System.out.println("合計:"+(x+y+z));
        System.out.println("平均:"+(x+y+z)/3);
        
                
                
    }
    
}
