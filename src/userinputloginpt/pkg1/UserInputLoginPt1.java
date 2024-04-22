/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userinputloginpt.pkg1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class UserInputLoginPt1 {
     
       static Regisration objRegisration = new Regisration();
    
    public static void main(String[] args) {
        
        askUserForInput();
       
       
    }
    
    public static void askUserForInput(){
        objRegisration.setFirstName(JOptionPane.showInputDialog(null,"Please enter your name"));
        objRegisration.setLastName(JOptionPane.showInputDialog(null,"Please enter your last name"));
        objRegisration.setUserName(JOptionPane.showInputDialog(null,"Please enter your username"));
        objRegisration.setPassword(JOptionPane.showInputDialog(null,"Please enter your password"));
        
        while(!isReal(objRegisration.userName)){
            JOptionPane.showMessageDialog(null, "sorry");
            objRegisration.userName = JOptionPane.showInputDialog(null, "enter username");
            
        }
        
        JOptionPane.showMessageDialog(null, "welcome");
        
         while(!isRight(objRegisration.password)){
            JOptionPane.showMessageDialog(null, "sorry");
            objRegisration.password = JOptionPane.showInputDialog(null, "enter password");
        
    }
          JOptionPane.showMessageDialog(null, "welcome");
         
         
    }
    
    public static boolean isReal(String userName){
        Pattern t = Pattern.compile("_");
        Matcher s = t.matcher(userName);
        
        return s.find();
    }
    
     public static boolean isRight(String password){
        Pattern r = Pattern.compile("([A-Z][1-9][*%^&$#@!|])");
        Matcher u = r.matcher(password);
        
        return u.find();
    }
    
    
    
}
