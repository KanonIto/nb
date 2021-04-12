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
public class K65 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner stdIn = new Scanner(System.in);
          System.out.print("nの値：");
          int n = stdIn.nextInt();
        int i=0;
        int j=0;
        int h=0;
        int k =0;
        int m =0;
        
        
        for(i=1;i<=n;i++){
            j=n-i;
            for(h=1;h<=j;h++){
                System.out.print(' ');
            }
            k=(i-1)*2+1;
            for(m=1;m<=k;m++){
                System.out.print('+');
            }
           System.out.println(" ");           
        }
      
    }
    
}
