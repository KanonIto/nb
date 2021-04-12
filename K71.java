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
public class K71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        System.out.println("変数xはfloat型で、変数yはdouble型");
        System.out.print("x:");
        float x = stdIn.nextFloat();
       System.out.print("y:");
        Double y = stdIn.nextDouble();  
        
        System.out.println("x="+x);
         System.out.println("y="+y);
        
    }
    
}
