
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a8118013
 */
public class F02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);

        System.out.print("硬貨でお支払いします\n支払う金額:");
        int money = stdIn.nextInt();
        int fi =0;
        System.out.print(money + "円は");

        if (money >= 50) {
            fi = money / 50;
            money = money % 50;
        }
        System.out.print("50円玉" + fi +"枚、");
        if (money >= 10) {
            fi = money / 10;
            money = money % 10;
        }
        System.out.print("10円玉" + fi +"枚、");
        if (money >= 5) {
            fi = money / 5;
            money = money % 5;
        }
        
       
        System.out.print("5円玉" + fi +"枚、");
        System.out.print("1円玉" + money +"枚です");
        
    }

}
