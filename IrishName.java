/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package irishname;



import java.util.Scanner;

/**
 *
 * @author aboru
 */
public class IrishName {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 10; i++){ // add cycle , avoid repeat start
        System.out.println("Please enter full name (First Name and Surname)");
        String fullName; 
        Scanner enterName = new Scanner(System.in); // use Scanner class for read from termital
        fullName = enterName.nextLine().trim();
   
    try {     //    use try to eliminate input errors and incorrect data
  
         if(fullName.matches("[A-Za-z ]+")) { //check letters and " "
                  
         int fulllength = fullName.length();// define length
         
         int gap = fullName.indexOf(" "); // defined name and count name letters 
         String firstName = fullName.substring(0, gap) ; // defined name
    
         String surName = fullName.substring( gap, fulllength).trim();  // defined surname 
         surName = surName.substring(0,1).toUpperCase() + surName.substring(1);  // transformed first letter surname
          
            
         firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);// transformed first letter firstname Upper
         if (gap!=8) {                           //if firstName not contain 8 letter add "og "
          firstName=firstName +"-og ";
            
         } else {  firstName = firstName + "-Mor"; //if firstName  contain 8 letters add "-Mor"
         }
                  
            String firstLetter = firstName.substring(0, 1);
            if (firstLetter.matches("F")){ //if firstletter  firstname contain "F" added  " Aine " in middle 
            firstName = firstName + " Aine "; }
           
            if (firstLetter.matches("[AEIOU]")){ //if firstletter firstname  contain  VOWEl "AEIOU" added  "Maire" in start name
            firstName = firstName.substring(1);
                firstName =  "Maire"+ firstName;       
            } 
            String  sunameLetter = surName.substring(0, 1); 
             //if firstletter surname  start  VOWE "AEIOU" added  "Mc" in start surname
            if (sunameLetter.matches("[AEIOU]")){
                surName = "Mc" + surName;
               //if firstletter surname  start  CONSONANT  added  "O'" in start surname
           }
             if (!sunameLetter.matches("[AEIOU]")){
                surName = "O'"+surName;
           }
  
            System.out.println (firstName +  " " + surName);} //  result
        
             else { System.out.println(" Please enter correct Name and Surname ! ");
                }
      }
       catch (Exception e){
            System.out.println(" Please enter correct Name and Surname , use letter ! ");
           }
     }
    }
   }
    
    