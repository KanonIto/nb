/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a8118013
 */
public class K82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double[] x = {2.5, 3.2, 0.5, 22.3, 1.7};
        double sum = 0;

        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }
        System.out.println("合計値：" + sum);
    }

}
