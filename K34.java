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
public class K34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        System.out.println("施設の利用料金を求めます");
        System.out.print("利用人数:");
        int a = stdIn.nextInt();
        
        if(a<=10){
            System.out.println(a+"人の利用料金は24000円です");
//         }else if(11 <= a && a >= 19){
//             System.out.println(a);
//             int b = a - 10;
//             int sum = ( 2400 - 50*b )* a;
//             System.out.println(a+"人の利用料金は"+sum+"円です");
                    
         }else if(a>=20){
             int sum = 1900 * a;
             System.out.println(a+"人の利用料金は"+sum+"円です");
        
        
         }else{
             
             int b = a - 10;
             int sum = ( 2400 - 50*b )* a;
             System.out.println(a+"人の利用料金は"+sum+"円です");
        
    
}
}
}
