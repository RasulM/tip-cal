/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipcalculator;

import java.util.Scanner;


/**
 *
 * @author Raz
 */
public class Tipcalculator {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scan;
       Calculator cal;
        
        
        String choice = "y";
        
        
        while (choice.equalsIgnoreCase("y")){
            System.out.print("Tip calculator\n\n\t");
            scan = new Scanner(System.in);
            cal = new Calculator(helper.validate(scan, "Enter Cost of meal:"));
            System.out.println(cal.showstndtips());
            String choice2;
            choice2 = helper.choiceContinue(scan,"would you like enter a custom tip percent y/n","y","n");
            while (choice2.equalsIgnoreCase("y")){
                cal.setUserTiprate(helper.validate(scan, "Enter tip percent:\n"));
                System.out.println(cal.showTipUser());
              choice2 =helper.choiceContinue(scan,"would you like enter a custom tip percent y/n","y","n");  
            }
            choice = helper.choiceContinue(scan,"continue y/n","y","n");
        
    }
    
    }
    
}
