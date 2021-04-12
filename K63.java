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
public class K63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        
        System.out.println("整数を加算します。");
        System.out.print("何個加算しますか：");
        int n = stdIn.nextInt();
        
        int sum = 0;
        int ave = 0;
        int count =0;
        for (int i = 0; i<n; i++){
            System.out.print("整数：");
            int t = stdIn.nextInt();
            if(t<0){
            System.out.println("負の数は加算しません");
            continue;
            }else{
                count++;
            }
                
            sum += t;
            ave=sum/count;
        }
            System.out.println("合計は"+sum+"です。");
             System.out.println("平均は"+ave+"です。");
            
    }
    
}
