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
public class K72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner stdIn = new Scanner(System.in);
         
         System.out.print("金額:");
         int prise = stdIn.nextInt();
         
         System.out.print("消費税率:");
         double tax = stdIn.nextDouble();
         
         int yen = (int) (prise*(tax+1.00));
         
         System.out.print("消費税込金額は"+yen+"円");
         
    }
    
}
