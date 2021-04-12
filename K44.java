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
public class K44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn =new Scanner(System.in);
        System.out.print("季節を求めます。\n何月ですか：");
        int month =stdIn.nextInt();
        
        switch(month){
            case 3:
                System.out.println("それは春です。");
                break;
                 case 4:
                System.out.println("それは春です。");
                break;
                 case 5:
                System.out.println("それは春です。");
                break;
                 case 6:
                System.out.println("それは夏です。");
                break;
                 case 7:
                System.out.println("それは夏です。");
                break; 
                 case 8:
                System.out.println("それは夏です。");
                break; 
                 case 9:
                System.out.println("それは秋です。");
                break; 
                 case 10:
                System.out.println("それは秋です。");
                break;
                 case 11:
                System.out.println("それは秋です。");
                break;
                 case 12:
                System.out.println("それは冬です。");
                break;
                 case 1:
                System.out.println("それは冬です。");
                break;
                 case 2:
                System.out.println("それは冬です。");
                break;
                        }
        
    }
    
}
