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

public class K133 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        System.out.print("ファイルをコピーします\nコピー元ファイル名：");
        String a = stdIn.next();
        System.out.print("コピー先ファイル名：");
        String b = stdIn.next();
        try {
            BufferedReader br = new BufferedReader(new FileReader(a)); 
            BufferedWriter bw = new BufferedWriter(new FileWriter(b));
            String moji;
            
            while((moji = br.readLine())!=null){
           
               

                bw.write(moji);
                bw.newLine();
                  
            
            }
          bw.close();
            br.close();
        } catch (IOException errmsg) {
            System.out.println(errmsg);
        }

    }

}
