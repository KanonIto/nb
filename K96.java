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

public class K96 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);

        int[][] a = new int[3][2];
        int[][] b = new int[2][3];
        int[][] c = new int[3][3];

        System.out.println("行列aの値");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("a[" + i + "][" + j + "]:");
                a[i][j] = stdIn.nextInt();
            }
        }
        System.out.println("行列bの値");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("b[" + i + "][" + j + "]:");
                b[i][j] = stdIn.nextInt();
            }
        }
        
        c[0][0]=a[0][0]*b[0][0]+a[0][1]*b[1][0];
        c[0][1]=a[0][0]*b[0][1]+a[0][1]*b[1][1];
        c[0][2]=a[0][0]*b[0][2]+a[0][1]*b[1][2];
        
        c[1][0]=a[1][0]*b[0][0]+a[1][1]*b[1][0];
        c[1][1]=a[1][0]*b[0][1]+a[1][1]*b[1][1];
        c[1][2]=a[1][0]*b[0][2]+a[1][1]*b[1][2];
        
        c[2][0]=a[2][0]*b[0][0]+a[2][1]*b[1][0];
        c[2][1]=a[2][0]*b[0][1]+a[2][1]*b[1][1];
        c[2][2]=a[2][0]*b[0][2]+a[2][1]*b[1][2];

        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }

}
