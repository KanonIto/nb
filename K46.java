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
public class K46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn =new Scanner(System.in);
        
        System.out.print("青学ランドにようこそ！\n大学:");
        String uni = stdIn.nextLine();
        System.out.print("年齢:");
        int age = stdIn.nextInt();
        
        if(uni.equals("aoyama")){
            if(age<20){
                System.out.print("入場料は1,000円");
            }else if(age>60){
                System.out.print("入場料は500円");
            }else{
                System.out.print("入場料は1,000円");
            }
        }else{
            if(age<20){
                System.out.print("入場料は1,000円");
            }else if(age>60){
                System.out.print("入場料は1,500円");
            }else{
                System.out.print("入場料は1,500円");
            }
        
        
    
}
}
}
