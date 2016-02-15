/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKUP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Caio
 */
public class BackupController {
    private static String dbUserName = "root";
    private static String dbPassword = "1234";
    private static String dbName = "histogene";
    private static String folder = "/home/lionswrath/Documents/ISS/backup/";
    
    public boolean dumpSQL(String path) throws FileNotFoundException{
        String executeCmd = "mysqldump -h localhost -u " + dbUserName + " -p" + dbPassword + " " + dbName;
        System.out.println(executeCmd);
        Process runtimeProcess;
        
        try {
 
            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            OutputStream outputStream = runtimeProcess.getOutputStream();
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(runtimeProcess.getInputStream()));
            
            File yourFile = new File(path);
            if(!yourFile.exists()) {
                yourFile.createNewFile();
            }
            
            PrintWriter out = new PrintWriter(yourFile);

            String s = null;
            while ((s = stdInput.readLine()) != null) {
                out.println(s);
            }
            
            out.close();
            
            int processComplete = runtimeProcess.waitFor();
 
            if (processComplete == 0) {
                JOptionPane.showMessageDialog(null, "Exportação realizada com sucesso!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Exportação falhou!");    
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
 
        return false;
    }
    
    public boolean restoreSQL(String path){
        Process runtimeProcess;
        try {

            ProcessBuilder builder = new ProcessBuilder("mysql", "-u", "root", "-p1234", "histogene");
            builder.redirectInput(ProcessBuilder.Redirect.from(new File(path)));

            runtimeProcess = builder.start();
            
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(runtimeProcess.getInputStream()));
            
            String s = null;
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
            
            int processComplete = runtimeProcess.waitFor();
 
            if (processComplete == 0) {
                JOptionPane.showMessageDialog(null, "Importação realizada com sucesso!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Importação falhou!");
                System.out.println(processComplete);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
 
        return false;
    }
    
    
}
