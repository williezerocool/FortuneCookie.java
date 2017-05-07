/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortunecookie;
import java.util.Random;
/**
 *
 * @author kendrabooker
 */
public class FortuneCookie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        
        int fortune;
        fortune = 1 + r.nextInt(6);
        
        
        if(fortune == 1){
            System.out.println("Wealth is soon to find you.");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
        }else if(fortune == 2){
            System.out.println("Stay strong, everything will be fine.");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
        }else if(fortune == 3){
            System.out.println("You must learn java asap.");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
        }else if(fortune == 4){
            System.out.println("You will become a Full-Stack Developer.");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
        }else if(fortune == 5){
            System.out.println("Change is the firend of growth.");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
        }else if(fortune == 6){
            System.out.println("Be like water! Shapeless..");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
            System.out.print(1 + r.nextInt(54) + "\t");
        }
                
    }
    
}
