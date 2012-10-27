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
    
    private static File combinelocal(String apath)
{
    URL location = FileTransfers.class.getProtectionDomain().getCodeSource().getLocation();
        
        String locacom = location.getPath();
        locacom = locacom.replace("%20", " ");
        String finaldes = locacom + apath;
        
        File combined = new File(finaldes); 
        System.out.println("Combined");
        return combined;
}
    
    private static String combinehome(String apath){
        String combined = System.getProperty("user.home")+ apath;
        System.out.println("Combined");
        return combined;
    }
    
    //Main method
    public static void startTransfer(){
    
        InstallingInput handy = new InstallingInput();
       handy.setVisible(true);
       
       NotSupport scherm2 = null;
        
        File file1 = combinelocal("files/test.lua/");
        System.out.println(file1.exists());
        
        File file2 = combinelocal("files/screenshot.jpg/");
        System.out.println(file2.exists());
        
        File dest1 = null;
        File dest2 = null;
        File dest3 = null;
        
        if ("Mac OS X".equals(System.getProperty("os.name")))
       {
            String destbase = combinehome("/Library/Application Support/techniclauncher/");
        System.out.println(destbase);
        
        dest1 = new File(destbase + "tekkit/resources/streaming/");
            dest2 = new File (destbase + "tekkit/");
            dest3 = new File (destbase + "tekkit/texturepacks/");
        }
        else if ("Windows 7".equals(System.getProperty("os.name"))) {
            String destbase = combinehome("\\Local Settings\\Application Data\\techniclauncher\\");
            System.out.println(destbase);
            
            dest1 = new File(destbase + "tekkit\\resources\\streaming\\");
            dest2 = new File (destbase + "tekkit\\");
            dest3 = new File (destbase + "tekkit\\texturepacks\\");
            
        }
        else {
            System.out.println("Failed");
            handy.dispose();
            scherm2 = new NotSupport();
            scherm2.setVisible(true);
            System.out.println("filetransfers finished running");
            return;
        }
            
        System.out.println(dest1.exists());
        System.out.println(dest1);
        System.out.println(file1.setReadable(true));
        
        System.out.println(System.getProperty("os.name"));
        
        try{
        FileUtils.copyFileToDirectory(file1, dest2);
        }
        catch (IOException f) {
            System.err.println(f.getMessage());
                    return;
        }
        System.out.println("Gelukt");
        
        
    }
        
    
    }
