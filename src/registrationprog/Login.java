/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistrationProg;


/**
 *
 * @author Nathan
 */
import javax.swing.JOptionPane;

public class Login {
    // Variables
    private String userName;
    
     private String cellphoneNumber;
    
      private String passWord;
    
   
   

    public Login(String userName, String passWord, String Name, String Surname, String cellphoneNumber1) {
        this.userName = userName;      
        this.passWord = passWord;
        
    }

    Login(String userName, String passWord, String cellphoneNumber) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    // Check username format using boolean
    public boolean CheckUserName() {
        int count = 0;
        if (userName.length() <= 5) {
            for (int i = 0; i < userName.length(); i++) {
                if (userName.charAt(i) == '_') {
                    count++;
                }
            }
        }

        if (userName.length() > 5 || count == 0) {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Username successfully captured", "Success", JOptionPane.INFORMATION_MESSAGE);
        }

        return count == 1;
    }

    //Check cellphone format
    public boolean checkCellNumberFormat() {
    String regex = "^(?:\\+27|0)(6|7|8)[0-9]{8}$";
    if (!cellphoneNumber.replaceAll("\\s+", "").matches(regex)) {
        JOptionPane.showMessageDialog(null, "Cellphone number is not correctly formatted. It must start with 0 or +27 and be 10 digits long.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    } else {
        JOptionPane.showMessageDialog(null, "Cellphone number successfully captured", "Success", JOptionPane.INFORMATION_MESSAGE);
        return true;
    }
}
   

    // Registering users formatted correctly
    public String registerUser() {
        if (CheckUserName() && checkPasswordComplexity()) {
            return "Registered successfully.";
        } else if (CheckUserName() && !checkPasswordComplexity()) {
            return "The password does not meet the complexity.";
        } else if (!CheckUserName() && checkPasswordComplexity()) {
            return "The username is incorrectly formatted.";
        } else {
            return "The username is incorrectly formatted & The password does not meet the complexity.";
        }
    }
// Check password complexity using if statements
    public boolean checkPasswordComplexity() {
        int capitalCount = 0;
        int numberCount = 0;
        int specialCharacterCount = 0;
        String specialChars = "/*!@#$%^&*~-+=()\"{}_[]|\\:;'?/<>,.";

        if (passWord.length() >= 8) {
            for (int i = 0; i < passWord.length(); i++) {
                if (Character.isUpperCase(passWord.charAt(i))) {
                    capitalCount++;
                } else if (Character.isDigit(passWord.charAt(i))) {
                    numberCount++;
                } else {
                    for (int c = 0; c < specialChars.length(); c++) {
                        if (passWord.charAt(i) == specialChars.charAt(c)) {
                            specialCharacterCount++;
                        }
                    }
                }
            }
        }

        if (passWord.length() < 8 || capitalCount < 1 || specialCharacterCount < 1) {
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Password successfully captured", "Success", JOptionPane.INFORMATION_MESSAGE);
        }

        return capitalCount >= 1 && numberCount >= 1 && specialCharacterCount >= 1;
    }
    // Log in the user and return success status
    public boolean loginUser() {
        String inputUserName = JOptionPane.showInputDialog("Please enter your User Name");
        String inputPassWord = JOptionPane.showInputDialog("Please enter your PassWord");

        int CharCounter1 = 0;
        int CharCounter2 = 0;
        if (this.userName.length() == inputUserName.length() && this.passWord.length() == inputPassWord.length()) {

            for (int i = 0; i < this.userName.length(); i++) {
                if (this.userName.charAt(i) == inputUserName.charAt(i)) {
                    CharCounter1++;
                }
            }

            for (int i = 0; i < this.passWord.length(); i++) {
                if (this.passWord.charAt(i) == inputPassWord.charAt(i)) {
                    CharCounter2++;
                }
            }
        }
        return CharCounter1 == this.userName.length() && CharCounter2 == this.passWord.length();
    }

    // Return login status message
    public String returnLogin() {
        boolean Condition = loginUser();
        if (Condition) {
            return "\nWelcome " + userName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }

    // Getters and Setters
    public String getUserName() {
        return userName;
    }

    public void createUserName(String userName) {
        this.userName = userName;
    }

   

    public void createPassword(String passWord) {
        this.passWord = passWord;
    }
    
     public String getPassword() {
        return passWord;
    }
   

}