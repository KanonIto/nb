import java.util.Scanner;
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
public class F03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        int count = 0;
        
        System.out.print("要素数:");
        int num  = stdIn.nextInt();
        
        System.out.println("1つ目の配列を生成します");
        int[] arrayA = randomArray(num);
        System.out.println("2つ目の配列を生成します");
        int[] arrayB = randomArray(num);
        
        System.out.println("各要素を比較します");
        for(int i = 0; i<num; i++){
            System.out.println(i+"番目の要素:"+ arrayA[i]+" " + arrayB[i]+" ");
            if(arrayA[i]>arrayB[i]){
                count = count +1;
            }
        }
        System.out.print("1つ目の配列の方が大きいのは"+count+"個でした");
        
        
    }
    
    static int[] randomArray(int n){
        Random rand = new Random();
        
        int[] array = new int[n];
        
        for(int i = 0; i<array.length;i++){
            int x = rand.nextInt(20)+10;
            array[i]= x;
        }
        return array;
        
    }
    
}
