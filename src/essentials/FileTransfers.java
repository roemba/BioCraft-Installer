/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package essentials;
import java.io.*;
import java.net.*;
import org.apache.commons.io.FileUtils;
/**
 *
 * @author roemerhendrikx
 */
public class FileTransfers{
    
    public FileTransfers (){}
    
    private File combinelocal(String apath)
{
    URL location = FileTransfers.class.getProtectionDomain().getCodeSource().getLocation();
        
        String locacom = location.getPath();
        locacom = locacom.replace("%20", " ");
        locacom = locacom.replace("/BioCraft_Installer.jar", "");
        String finaldes = locacom + apath; 
     
        File lol = new File(finaldes);
        System.out.println("Running directory combined with " + apath);
        return lol;
}
    
    private static String combinehome(String apath){
        String combined = System.getProperty("user.home")+ apath;
        System.out.println("Home directory combined with " + apath);
        return combined;
    }
    
    //Main method
    public void startTransfer(){
    
        InstallingInput handy = new InstallingInput();
       handy.setVisible(true);
       
       NotSupport scherm2 = null;
        
        File file1 = null;
        File file2 = null;
        File dest1 = null;
        File dest2 = null;
        File dest3 = null;
               
              //String dest = combinelocal("");
                
                
                
              
                        
   
        if ("Mac OS X".equals(System.getProperty("os.name")))
       {
            String destbase = combinehome("/Library/Application Support/techniclauncher/");
        
            dest1 = new File(destbase + "tekkit/resources/streaming/");
            dest2 = new File (destbase + "tekkit/");
            dest3 = new File (destbase + "tekkit/texturepacks/");
            
            file1 = combinelocal("/files/test.m");
            file2 = combinelocal("/files/screenshot.jpg");
        }
        else if ("Windows 7".equals(System.getProperty("os.name"))) {
            String destbase = combinehome("\\Local Settings\\Application Data\\techniclauncher\\");
            
            dest1 = new File(destbase + "tekkit\\resources\\streaming\\");
            dest2 = new File (destbase + "tekkit\\");
            dest3 = new File (destbase + "tekkit\\texturepacks\\");
            
            file1 = combinelocal("\\files\\test.lua\\");
            file2 = combinelocal("\\files\\screenshot.jpg\\");
            
        }
        else {
            System.out.println("Failed");
            handy.dispose();
            scherm2 = new NotSupport();
            scherm2.setVisible(true);
            System.out.println("filetransfers finished running");
            return;
        }
         
        System.out.println("Operating system is " + System.getProperty("os.name"));
        
        System.out.println("Can reach dest1 = " + dest1.exists());
        System.out.println("Can reach file1 = " + file1.exists());
        System.out.println("Can reach file2 = " + file2.exists());
        System.out.println(file1);
        System.out.println(file2);
        System.out.println(file1.setReadable(true));
        
        /*try{
        FileUtils.copyFileToDirectory(file1, dest1);
        }
        catch (IOException f) {
            System.err.println(f.getMessage());
            handy.dispose();
            Error erro = new Error();
            erro.setVisible(true);
                    return;
        }
        catch (IllegalArgumentException fos) {
            System.err.println(fos.getMessage());
            handy.dispose();
            Error erro = new Error();
            erro.setVisible(true);
                    return;
        }*/
        System.out.println("Gelukt");
        handy.dispose();
        Gelukt finfa = new Gelukt();
        finfa.setVisible(true);
       System.out.println("filetransfers finished running");
        
    }
}