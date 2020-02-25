/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome2;
import javax.swing.*;
/**
 *
 * @author kabut2496
 */
public class Palindrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String gInput;
        String reverse = "";
        String forwards="";
        char space = ' ';
        char word1;
        
        gInput = JOptionPane.showInputDialog("please input a sentence that contains Palindromes");
       
        int x = gInput.length();
       
                for(int i = gInput.length() - 1; i >= 0; i--){
          
           reverse = reverse + gInput.charAt(i);
           
           word1 = gInput.charAt(i);
           
            System.out.println(word1);
            
            if(word1 == (' ')){
                
            for(int b = reverse.length() -1 ; b >= 0; b--){
                forwards = forwards + reverse.charAt(b);
            }
                
                reverse = space + reverse;
                
                System.out.println(forwards + "22");
                System.out.println(reverse + "23");
                
                if(forwards.equals(reverse)){
                    System.out.println(reverse + " is a palindrme");
                }
                
                reverse = "";
                
            }else{
                System.out.println("by");
            }
        }
       
        System.out.println(reverse);
        System.out.println(gInput);
      
    }
    
}