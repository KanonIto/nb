import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a8118013
 */
public class F01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int n = rand.nextInt(10)+1;
        
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i< a.length; i++){
            a[i] = rand.nextInt(10);
            b[i] = rand.nextInt(10);
        }
        
        System.out.print("a[]: ");
        print(a);
        System.out.print("b[]: ");
        print(b);
        
        int sumA = sum(a);
        int sumB = sum(b);
        
        int[] ab = subtract(a,b);
        int sumAB = sum(ab);
        
        System.out.print("ab[]: ");
        print(ab);
                
                
    }
    static void print(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    
    static int sum(int[] array){
        int sumArray = 0;
        for(int i = 0; i<array.length; i++){
            sumArray += array[i];
        }
        return sumArray;
    }
    static int[] subtract(int[] x, int[] y){
        int[] ab = new int[x.length];
        for(int i = 0; i<ab.length; i++){
            ab[i] = x[i] - y[i];
        }
        return ab;
    }
    
}
