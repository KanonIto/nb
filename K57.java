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
public class K57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        int num = 0;
        do {
            System.out.print("3桁の正の整数値:");
            num =stdIn.nextInt();
        }while(100>num ||  num >999);
        System.out.println(num+"が入力されました");
        
    }
    
}
