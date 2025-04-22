/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package registrationprog;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nathan
 */
public class LoginTest {
    
    
    public LoginTest() {
    }

    @Test
    public void testCheckCellNumberFormat() {
        Login login = new Login(); 
    boolean result = login.CheckCellNumberFormat("+2783896897"); // Pass username as parameter
    assertEquals(true, result, "The cellphone is correctly formatted");
        
    }

    @Test
    public void testCheckUserName() {
    

    Login login = new Login(); 
    boolean result = login.CheckUserName("kyl_1"); // Pass username as parameter
    assertEquals(true, result, "Username correctly formatted");
}
       
    
                
    }

    @Test
    public void testCheckPasswordComplexity() {


   Login login = new Login(); 
    boolean result = login.CheckPasswordComplexity("Ch&&sec@ke99!");
    assertEquals(true, result, "Password correctly formatted");

    }

    @Test
    public void testRegisterUser() {
Login login = new Login(); 
    boolean result = login.CheckPasswordComplexity("Ch&&sec@ke99!");
    assertEquals(true, result, "Password correctly formatted");

    }

    @Test
    public void testLoginUser() {
Login login = new Login(); 
    boolean result = login.CheckPasswordComplexity("Ch&&sec@ke99!");
    assertEquals(true, result, "Password correctly formatted");

    }

    @Test
    public void testReturnLogin() {
Login login = new Login(); 
    boolean result = login.CheckPasswordComplexity("Ch&&sec@ke99!");
    assertEquals(true, result, "Password correctly formatted");
    }

    
    @Test
    public void testSetUserName() {
Login login = new Login(); 
    boolean result = login.CheckPasswordComplexity("Ch&&sec@ke99!");
    assertEquals(true, result, "Password correctly formatted");
    }


    @Test
    public void testSetPassword() {
Login login = new Login(); 
    boolean result = login.CheckPasswordComplexity("Ch&&sec@ke99!");
    assertEquals(true, result, "Password correctly formatted");
    }

    @Test
    public void testGetName() {
Login login = new Login(); 
    boolean result = login.CheckPasswordComplexity("Ch&&sec@ke99!");
    assertEquals(true, result, "Password correctly formatted");
    }

    @Test
    public void testGetSurname() {
Login login = new Login(); 
    boolean result = login.CheckPasswordComplexity("Ch&&sec@ke99!");
    assertEquals(true, result, "Password correctly formatted");
    }

    @Test
    
