/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a8118013
 */
import java.util.Random;

public class K122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] b = randomArray(6);
        printArray(b);
        int max = maxOf(b);
        int y = search(b, max);

        System.out.println("全要素の最大値は" + max + "です。");
        System.out.println(max + "が含まれる要素番号は" + y + "です。");

    }

    static int[] randomArray(int n) {
        Random rand = new Random();
        int[] a = new int[6];
        for (int i = 0; i < a.length; i++) {
            int random = rand.nextInt(13) + 1;
            a[i] = random;
           
        }
        return a;
    }

    static void printArray(int[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + "番目の要素：" + b[i]);
        }

    }

    static int maxOf(int[] c) {

        int max = 0;
        for (int i = 0; i < c.length; i++) {
            if (max < c[i]) {
                max = c[i];

            }
        }
        return max;
    }

    static int search(int[] d, int key) {
        int i;
        for (i = 0; i < d.length; i++) {
            if (d[i] == key) {
                break;
            }
        }
        return i;
    }

}
