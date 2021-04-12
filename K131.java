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

public class K131 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("population.txt"));

            String moji;

            while ((moji = br.readLine()) != null) {
                String[] data = moji.split(",");
                int male = Integer.parseInt(data[1]);
                int female = Integer.parseInt(data[2]);
                int sum = male + female;
                if (sum >= 5000) {
                    System.out.println(data[0] + ":" + sum + "千人");
                    count1 = count1 + 1;
                } else if (sum >= 1000) {
                    count2 = count2 + 1;
                } else {
                    count3 = count3 + 1;
                }
            }
            br.close();
        } catch (IOException errmsg) {
            System.out.println(errmsg);
        }
        System.out.println(1000 + "千人未満：" + count3 + "件");
        System.out.println(1000 + "千人以上：" + 5000 + "千人未満：" + count2 + "件");
        System.out.println(5000 + "千人以上：" + count1 + "件");
    }

}
