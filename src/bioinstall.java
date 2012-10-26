/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roemerhendrikx
 */
import java.lang.*;
public class bioinstall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GetUserInput cookieobject = new GetUserInput();
      String cookiestring = cookieobject.getinput();
        
        
       try {
        int cookie = Integer.parseInt(cookiestring);
           
        if (cookie == 5) {
        System.out.println("Good, very good!");
        }
        else if (cookie == 6) {
            System.out.println("One number too much!");
        }
        else if (cookie ==4) {
            System.out.println("One number too less!");
        }
        else {
            System.out.println("Nowhere near!");
        }
    }
    catch (NumberFormatException fout){

            //statement to execute if an input/output exception occurs
            System.out.println("An unexpected error occured.");
            return;
        }
    
      System.out.println("The thing passed"); 
       
      
    }       
}