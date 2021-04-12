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
import java .util.Random;
public class K25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();

 Scanner stdIn = new Scanner(System.in);
 
        System.out.println("x,y,zの合計と平均を求めます");
        System.out.print("乱数の上限値:");
        int x=stdIn.nextInt();
        int numx =rand.nextInt(x+1);
        int numy =rand.nextInt(x+1);
        int numz =rand.nextInt(x+1);
        System.out.println("x:" +numx+ ",y:" + numy+ ",z:"+ numz);
        
        int sum =numx+numy+numz;
        int ave=sum/3;
        
        System.out.println("合計:"+sum);
        System.out.println("平均:"+ave);
                
                
                
    }
    
}
