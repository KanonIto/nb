/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a8118013
 */
import java.io.*;
import java.util.Scanner;
public class K132 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner stdIn = new Scanner(System.in);
        
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("K132F.txt"));
         int num=0;
            do{
                System.out.print("書き込む文字列:");
                String a = stdIn.next();
                bw.write(a);
                bw.newLine();
                System.out.print("まだ書き込みますか？\n1…はい/0…いいえ");
               num = stdIn.nextInt();
            }while(num == 1);
            bw.close();
        }catch(IOException errmsg){
            System.out.println(errmsg);
        }
    }
    
}
