/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import lab1.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author chris
 */
public class LabThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File data = new File(File.separatorChar + "advanced_java" + File.separatorChar + "lab1.txt");
           int numberOfLineRead = 1; 
           boolean append = true;
           
           
           
           
           PrintWriter out = null;
        try{
         out = new PrintWriter(
						new BufferedWriter(
						new FileWriter(data, append)));
         
         out.print("\nJohn|");
         out.print("Deere|");
         out.print("1234 Milwaukee St.|");
         out.print("Theresa|");
         out.print("WI|");
         out.print("53091|");
         out.print("john@aol.com|");
         out.println("920-251-0987|");
           
        }catch(IOException ioe){
            System.out.println("Error: " + ioe);
        }finally{
            out.close();
        }
        
        
        
        
        
        
        
        
        
        
        
             BufferedReader in = null;
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
	   while(line != null){
               
               
                   System.out.println(numberOfLineRead);
                   if(numberOfLineRead == 2){
                       String[] word = line.split("\\|");
		  System.out.println("\nCity: " + word[3]);
                   }
                  numberOfLineRead += 1;
		  line = in.readLine();  
	   }
	 
        } catch(IOException ioe) {
            System.out.println("There Was A Problem");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
        
        
        
        
    }
}
