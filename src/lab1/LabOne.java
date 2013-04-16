/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

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
public class LabOne {

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
         out.print("920-251-0987|");
           
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
               String[] word = line.split("\\|");
               
                   
                   if(numberOfLineRead == 4){
		  System.out.println("First Name: " + word[0] + "\nLast Name: " +
                          word[1] + "\nAddress: " + word[2] + "\nCity: " + word[3] +
                          "\nState: " + word[4] + "\nZip: " + word[5] + "\nEmail: " +
                          word[6] + "\nPhone: " + word[7]);
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
