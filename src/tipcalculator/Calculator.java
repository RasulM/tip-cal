/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipcalculator;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 *
 * @author Raz
 */
public class Calculator {
    private final BigDecimal stndtips15= new BigDecimal(".15");
    private final BigDecimal stndtips20 = new BigDecimal(".20");
    private final BigDecimal stndtips25 = new BigDecimal(".25");       
    private final BigDecimal [] stndtips = { stndtips15, stndtips20, stndtips25};
    private final BigDecimal tip15;
    private final BigDecimal tip20;
    private final BigDecimal tip25;
    private final BigDecimal mealCost;
    private BigDecimal userTiprate;
    private String tipStnd;
    private String tipUser;
    NumberFormat cur = NumberFormat.getCurrencyInstance();
    NumberFormat perc = NumberFormat.getPercentInstance();
    
    
    
    public Calculator(String mealCo){
       mealCost = new BigDecimal(mealCo);
        tip15 =new BigDecimal(mealCost.multiply(stndtips[0]).toString());
        tip20 = new BigDecimal(mealCost.multiply(stndtips[1]).toString());
        tip25 = new BigDecimal(mealCost.multiply(stndtips[2]).toString());
    }

    public void setUserTiprate(String userTip) {
        userTiprate = new BigDecimal(userTip).movePointLeft(2);
    }

    public BigDecimal getTip15() {
       
        return tip15;
    }

    public BigDecimal getTip20() {
        
        return tip20;
    }

    public BigDecimal getTip25() {
        
        return tip25;
    }

    public BigDecimal getUserTiprate() {
        return userTiprate;
    }

   

    public String getTipStnd() {
        return tipStnd;
    }

    public void setTipStnd(String tipStnd) {
        this.tipStnd = tipStnd;
    }

    public String getTipUser() {
        return tipUser;
    }

    public void setTipUser(String tipUser) {
        this.tipUser = tipUser;
    }

    public String showTipUser() {
        BigDecimal t = userTiprate.multiply(mealCost);
        tipUser =  perc.format(userTiprate)+"\n"+cur.format(t)+"\n"+cur.format(t.add(mealCost));
        
        return tipUser;
    }

    public String showstndtips() {
        tipStnd =perc.format(stndtips[0])+"\t"+ perc.format(stndtips[1])+"\t"+perc.format(stndtips[2])+"\n"+
                cur.format(tip15)+"\t"+cur.format(tip20)+"\t"+cur.format(tip25)+"\n"+
                cur.format(tip15.add(mealCost))+"\t"+cur.format(tip20.add(mealCost))+"\t"+cur.format(tip25.add(mealCost));
        return tipStnd;
    }
    
    
}
