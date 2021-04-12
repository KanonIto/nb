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
public class K114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        
         System.out.print("要素数:");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }
        
        System.out.print("削除するインデックス番号：");
        int i = stdIn.nextInt();
        
        int t[]=arrayRemove(x,i);
        for (int j = 0; j <t.length-1; j++) {
            System.out.println("y[" + j + "]:"+t[j]);
            
        }
        
        
    }
    
    static int[] arrayRemove(int[] x,int i){
        int[] y=new int[x.length];
        for(int j =0; j<x.length;j++){
            if(j<i){
                y[j]=x[i];
            }else{
                y[j]=x[i+1];
            }           
        }
        return y;
    }
    
}
