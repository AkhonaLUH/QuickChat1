/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginapp;
import java.util.Scanner;


public class LoginApp {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Login user = new Login ();
            
            System.out.print("Enter first name:");
            String firstName = input.nextLine();
            
            System.out.print("Enter last name:");
            String lastName = input.nextLine();
            
            System.out.print("Enter username:");
            String username = input.nextLine();
            
            System.out.print("Enter password:");
            String password = input.nextLine();
            
            System.out.print("Enter SA phone number (+27...):");
            String phone = input.nextLine();
            
            String result = user.registerUser(username, password, phone, firstName, lastName);
            System.out.println(result);
            
            System.out.print("Enter username to login:");
            String loginUser = input.nextLine();
            
            System.out.print("Enter password to login:");
            String loginPass = input.nextLine();
            
            boolean success = user.loginUser(loginUser, loginPass);
            String message = user.returnLoginStatus(success);
            
            System.out.println(message);
        }
  }
}
