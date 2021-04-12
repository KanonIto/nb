/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a8118013
 */
import java .util.Random;
public class K24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int num =rand.nextInt(5)+100;
        System.out.println("100以上105未満の乱数を生成します");
        System.out.println("生成した乱数:"+num);
                
    }
    
}
