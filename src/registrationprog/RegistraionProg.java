/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RegistrationProg;

/**
 *
 * @author Nathan
 */
import javax.swing.JOptionPane;

public class RegistraionProg {
    

    /**
     * @param args the command line arguments
     */
  
        public static void main(String[] args) {
        
        
       String cellphoneNumber = JOptionPane.showInputDialog("Please enter your Cellphone Number");
        
        String userName = JOptionPane.showInputDialog("Please enter your UserName");
        
        String passWord = JOptionPane.showInputDialog("Please enter your PassWord");
        
        // Create instance of the Login class
        Login newLogin = new Login(userName, passWord, cellphoneNumber);

        // Display registration message
        JOptionPane.showMessageDialog(null, newLogin.registerUser());

        boolean ConditionUsername = newLogin.CheckUserName();
        boolean ConditionPassword = newLogin.checkPasswordComplexity();
        boolean ConditionCellphone = newLogin.checkCellNumberFormat();

        // If conditions are not met or not(While loop)
        while (!ConditionUsername || !ConditionPassword || !ConditionCellphone) {
            JOptionPane.showMessageDialog(null, "Try Again");
            userName = JOptionPane.showInputDialog("Please enter your UserName");
            passWord = JOptionPane.showInputDialog("Please enter your PassWord");
            cellphoneNumber = JOptionPane.showInputDialog("Please enter your Cellphone Number");
            newLogin = new Login(userName, passWord, cellphoneNumber);
            JOptionPane.showMessageDialog(null, newLogin.registerUser());
            ConditionUsername = newLogin.CheckUserName();
            ConditionPassword = newLogin.checkPasswordComplexity();
            ConditionCellphone = newLogin.checkCellNumberFormat();
        }

        // Ask the user if they want to log in or exit
        String[] options = {"Login", "Exit"};
        int Option = JOptionPane.showOptionDialog(null, "What would you like to do?", "Select an Option", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (Option) {
                case 0:
                    JOptionPane.showMessageDialog(null, newLogin.returnLogin());
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Goodbye!");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "No Option was Chosen", "Error", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
            }
    }
}