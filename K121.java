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

public class K121 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("要素数：");
        int num = stdIn.nextInt();
        
        double[] b = inputArray(num);
        double a = sumArray(b);
        
        System.out.print("全要素の合計は" + a + "です。");
        System.out.print("全要素の平均は" + a / num + "です。");
        
    }
    
    static double[] inputArray(int n) {
        Scanner stdIn = new Scanner(System.in);
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]:");
            
            double b = stdIn.nextDouble();
            a[i] = b;
            
        }
        return a;
        
    }
    
    static double sumArray(double[] b) {
        double sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum = b[i] + sum;
            
        }
        return sum;
    }
}
