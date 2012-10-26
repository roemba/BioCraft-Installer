/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package essentials;
/**
 *
 * @author roemerhendrikx
 */
import java.io.*;
public class GetUserInput {
    
    private String oinput;
    
    public GetUserInput(){};
    
    public String getinput() {
        
        BufferedReader reader;
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your number? ");
        
        try{

            //read the data entered by the user using 
            //the readLine() method of the BufferedReader class
            //and store the value in the name variable
            oinput = reader.readLine();
            return oinput;
        }
        catch(IOException fout2){
            System.out.println("An unexpected error occured.");
            return null;
        }
    }
}
