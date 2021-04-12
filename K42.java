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
public class K42 {

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
        
        int min = a;
        if(b<min){
            min = b;
        }if(c<min){
            min = c;
        }
//        System.out.println(min);
        
        int max = a;
        if(b > max){
            max = b;
        }if(c>max){
            max = c;
        }
//        System.out.println(max);
//        
        int mid = 0;
        if(a==max){
            if(b>c){
                mid = b; 
            }else{
                mid = c;
              } 
        }if(b==max){
            if(a>c){
                mid = a; 
            }else{
                mid = c;
           } 
        }if(c==max){
            if(b>a){
                mid = b; 
            }else{
                mid = a;
            } 
            }
            
     
//         System.out.println(mid);
                  
            
        System.out.print("降順" +" "+ max +" "+ mid +" "+ min);
        
    
        
    }
}
