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
public class K43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int hand = rand.nextInt(3);
        System.out.println("乱数:"+ hand);
        
        switch(hand){
            case 0:
                System.out.println("グー");
                break;
            case 1:
                System.out.println("チョキ");
                break;
            case 2:
                System.out.println("パー");
                break;
                
        }
    }
    
}
