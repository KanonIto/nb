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
public class K41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("値1:");
        int a = stdIn.nextInt();
        
        System.out.print("値2:");
        int b = stdIn.nextInt();
        
        System.out.print("値3:");
        int c = stdIn.nextInt();
        
        System.out.print("値4:");
        int d = stdIn.nextInt();
        
        System.out.print("値5:");
        int e = stdIn.nextInt();
        
        int min = a;
        
        if(b<min){
            min = b;
        }if(c<min){
            min = c;
        }if(d<min){
            min = d;
        }if(e<min){
            min = e;
        }
        
        System.out.print("最小値は"+min);
        
        
        
    }
    
}
