/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginapp;



public class Login {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    
    public boolean checkUserName(String username){
        return username.contains("_") && username.length() <=5;
        }
    public boolean checkPasswordComplexity(String password){
        boolean hasUpper = false;
         boolean hasNumber = false;
          boolean hasSpecial = false;
          
          if (password.length() >=8) {
              for (int i = 0; i < password.length(); i++){
              }
          }
          
    for (char c : password.toCharArray()){
    if (Character.isUpperCase (c))
                  hasUpper = true;
    
    if (Character.isDigit (c))
        hasNumber = true;
              
    if (!Character.isLetterOrDigit (c))
         hasSpecial = true;
    }
              return password.length() >= 8 && hasUpper && hasNumber && hasSpecial;
    }
    public boolean checkCellPhoneNumber(String number){
        return number.matches("^\\+27\\d{9}$");
    }
    public String registerUser(String username, String password ,String cellPhone,String firstName, String lastName){
       if (!checkUserName(username)){
            return "Username is not correctly formatted.";
        }
        if (! checkPasswordComplexity(password)){
            return"Password is not correctly formatted.";
        }
        if (! checkCellPhoneNumber(cellPhone)){
            return"Cell number is incorrectly formatted or does not contain international code ; please correct the number and try again";
        }
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        
        return "User registered successfully.";
    }
    
    public boolean loginUser(String username, String password){
        return this.username.equals(username)&& 
               this.password.equals(password);
    }
    public String returnLoginStatus(boolean loginSuccess){
        if (loginSuccess){
            return "Welcome"+ firstName + "," + lastName + " it is great to see you.";
            
        }else{
            return "Username or password incorrect, please try again.";
            }
        }
     }
    
    
        
              
          
    
    
    


