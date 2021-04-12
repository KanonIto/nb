
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

public class K112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数:");
        int num = stdIn.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]:");
            array[i] = stdIn.nextInt();
        }
        System.out.print("入れ替え対象インデックスi:");
        int i = stdIn.nextInt();
        System.out.print("入れ替え対象インデックスj:");
        int j = stdIn.nextInt();

        arraySwap(array, i, j);
        
        for(int k = 0; k<num; k++){
            System.out.println("y["+k+"]="+array[k]);
        }
    }

    static int[] arraySwap(int[] x, int i, int j) {
        int t = x[i];
        x[i] = x[j];
        x[j] = t;
        return x;

    }

}
