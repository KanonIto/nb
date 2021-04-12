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
public class K54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("nの値:");
        int n = stdIn.nextInt();
        
        int sum = 1;
        int i = 1;
        while(i<n+1){
            sum = sum * i;
            i = i +1;
        }
        System.out.println("結果:" + sum);
        
    }
    
}
