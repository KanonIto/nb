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
public class K35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner stdIn = new Scanner(System.in);
        System.out.println("プードルの名称を調べます");
        System.out.print("体高(cm):");
        double a = stdIn.nextDouble();
        
        if(a<=0 || a>=60.0){
            System.out.println("不明");
                    
         }else if(a<28.0){
             
             System.out.println("トイプードル");
        
        
         }else if(a<35.0){
            
             System.out.println("ミニチュアプードル");
         }else if(a<45.0){
            
             System.out.println("ミニプードル");
         }else{
             System.out.println("スタンダードプードル");
         }
        
    
}
}


    
    
