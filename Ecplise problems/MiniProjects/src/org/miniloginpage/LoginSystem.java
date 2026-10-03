package org.miniloginpage;

import java.util.Scanner;

public class LoginSystem {
    
    String registeredEmail;
    int registeredPassword;
    
    Scanner sc = new Scanner(System.in);

    public void signUp() {
        System.out.println("=== SIGN UP ===");
        System.out.println("Set your Email:");
        registeredEmail = sc.next(); 
        
        System.out.println("Set your Password:");
        registeredPassword = sc.nextInt();
        
        System.out.println("Registration Successful! \n");
    }

    public void login() {
        System.out.println("=== LOGIN ===");
        System.out.println("Enter your Email:");
        String checkEmail = sc.next();
        
       
        if (checkEmail.equals(registeredEmail)) {
            
            System.out.println("Enter your Password:");
            int checkPassword = sc.nextInt();
            
            if (checkPassword == registeredPassword) {
                System.out.println("Super! Login Successful.");
            } else {
                System.out.println("Wrong Password! Try again.");
            }
            
        } else {
            System.out.println("Email not found! Wrong Email.");
        }
    }

   
    public static void main(String[] args) {
        LoginSystem app = new LoginSystem();
        
        
        app.signUp();
        
        app.login();
    }
}