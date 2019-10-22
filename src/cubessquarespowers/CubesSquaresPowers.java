/*
 * Erin McBrien
 * 09/10/2019
 * CubesSquaresPowers
 */

package cubessquarespowers;
import  java.util.Scanner;
/**
 *
 * @author ErMcB6406
 */
public class CubesSquaresPowers {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyedInput = new Scanner(System.in);
       //user menu
        System.out.println("1… Find the value of a number squared (NOTE: 22 = 2 x 2)\n"
                + "2… Find the value of a number cubed (NOTE: 23 = 2 x 2 x 2)\n"
                + "3… Find the value of a number, to any power\n"
                + "4… Exit");
        System.out.println("Please enter your choice:");
        //user input choice
        int choice;
        choice = keyedInput.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Please enter your number:");
                int num = 0;
                num = keyedInput.nextInt();
                for (int i=1; i<=2; i++) {
                    num = num * num;
                    System.out.println(num);
                }
                    System.out.println("1… Find the value of a number squared (NOTE: 22 = 2 x 2)\n"
                    + "2… Find the value of a number cubed (NOTE: 23 = 2 x 2 x 2)\n"
                    + "3… Find the value of a number, to any power\n"
                    + "4… Exit");
                    System.out.println("Please enter your choice:");
                    choice = keyedInput.nextInt(); 
                
                break;
            case 2:
                System.out.println("Please enter your number:");
                num = keyedInput.nextInt();
                for (int i=1; i<=3; i++) {
                    num = num * num * num;
                    System.out.println(num);
                }
                    System.out.println("1… Find the value of a number squared (NOTE: 22 = 2 x 2)\n"
                    + "2… Find the value of a number cubed (NOTE: 23 = 2 x 2 x 2)\n"
                    + "3… Find the value of a number, to any power\n"
                    + "4… Exit");
                    System.out.println("Please enter your choice:");
                    choice = keyedInput.nextInt(); 
                
                break;
            case 3:
                System.out.println("Please enter your number:");
                num = keyedInput.nextInt();
                System.out.println("Please enter a power you would like to use.");
                int power;
                power = keyedInput.nextInt();
                
                for (int i=0; i<(power-1); i++){
                   num = num * num; //num* = num
                   System.out.println(num);
                }
                   System.out.println("1… Find the value of a number squared (NOTE: 22 = 2 x 2)\n"
                    + "2… Find the value of a number cubed (NOTE: 23 = 2 x 2 x 2)\n"
                    + "3… Find the value of a number, to any power\n"
                    + "4… Exit");
                    System.out.println("Please enter your choice:");
                    choice = keyedInput.nextInt();
                break;
                
            case 4:
                System.out.println("Farewell!");
                break;
                
        
        }
            
                
        
        
    }
    
    }
