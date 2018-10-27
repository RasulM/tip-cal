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
public class helper {
    
    /**
     *
     */
    public helper(){
        
    }
    
    public static String choiceContinue(Scanner sc,String prompt,String s1,String s2){
        String s = "";
        while (true){
            System.out.println(prompt);
            s = sc.next();
        
            if(s.equalsIgnoreCase(s1) || s.equalsIgnoreCase(s2)){
                if(s.equalsIgnoreCase(s1)){
                    return s; 
                }
                else{
                    break;
                }
             
        }
            else {
                System.out.println("invaild enter");
    }
        } 
        return s;
    }   
    public static String validate(Scanner sc, String prompt) {
        Double d = 0.0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid number. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d.toString();
    }
}
