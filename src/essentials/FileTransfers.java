/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package essentials;
import java.lang.*;
import java.net.*;
import java.io.*;
/**
 *
 * @author roemerhendrikx
 */
public class FileTransfers {
    
    public FileTransfers (){}
    
    private static File combine(String apath)
{
    URL location = FileTransfers.class.getProtectionDomain().getCodeSource().getLocation();
        
        String locacom = location.getPath();
        String finaldes = locacom + apath;
        
        File combined = new File(finaldes); 
        System.out.println("Combined");
        return combined;
}
    
    public static void startTransfer(){
    
        File file1 = combine("files/test.lua/");
        System.out.println(file1);
        
        File file2 = combine("files/screenshot.jpg/");
        System.out.println(file1);
        
        
        /*InputStream inStream = null;
	OutputStream outStream = null;
    	try{
 
    	    File afile =new File("Afile.txt");
    	    File bfile =new File("Bfile.txt");
 
    	    inStream = new FileInputStream(afile);
    	    outStream = new FileOutputStream(bfile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    //copy the file content in bytes 
    	    while ((length = inStream.read(buffer)) > 0){
 
    	    	outStream.write(buffer, 0, length);
 
    	    }
 
    	    inStream.close();
    	    outStream.close();
 
    	    System.out.println("File is copied successful!");
 
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    
    */
    
    }
}
