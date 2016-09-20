/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigcse004;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hci
 */
public class WordLink {
    final String [] menuitems={"A set the difficulty level","B display the dictionary","C insert a word to the dictionary","D play the game","E exit"};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WordLink assg=new WordLink();
    }
    
    
    int DictionarywordsArraysize=100;
    String []Dictionarywordslevel1;
    String []Dictionarywordslevel2;
    
    public WordLink(){
      this.Dictionarywordslevel1=new String[DictionarywordsArraysize];
      this.Dictionarywordslevel2=new String [DictionarywordsArraysize];  
      
      
    
    }
    // Dynamically increasing the arraylenght 
    private String[] IncreasesizeofArrays(String array[]){
        String [] temp=new String[array.length+50];
        System.arraycopy(array,0,temp,0,array.length);
        array=temp;
        return array;
    }
    
    public void ReadfromFile(){
        File inputfile=new File("C:\\Users\\hci\\Desktop\\Assignment\\dictionary.txt");
        try{
                Scanner filescanner=new Scanner(inputfile);
                int level1counter=0;
                int level2counter=0;
                
                boolean level1flag=false,level2flag=false;
                
                while(filescanner.hasNextLine()){
                    String line = filescanner.nextLine();
                     
                    if(level1flag && !line.equalsIgnoreCase("1")){
                      String[]linearray1=line.split(" ");
                      
                      System.arraycopy(linearray1,0,this.Dictionarywordslevel1,level1counter,linearray1.length);
                      level1counter=level1counter+linearray1.length;
                    }else if(level2flag && !line.equalsIgnoreCase("2")){
                        String[]linearray2=line.split(" ");
                     
                      System.arraycopy(linearray2,0,this.Dictionarywordslevel1,level2counter,linearray2.length);
                       level2counter=level2counter+linearray2.length;
                    }
                    
                    
                    if(line.equalsIgnoreCase("1")){
                        level1flag=true; level2flag=false;
                    }else if(line.equalsIgnoreCase("2")){
                        level1flag=false; level2flag=true;
                    }
                    /**
                     Array size exceeds
                     */
                    if(level1counter ==this.Dictionarywordslevel1.length-2){
                        this.Dictionarywordslevel1= this.IncreasesizeofArrays(this.Dictionarywordslevel1);
                    }
                    if(level2counter ==this.Dictionarywordslevel2.length-2){
                        this.Dictionarywordslevel2= this.IncreasesizeofArrays(this.Dictionarywordslevel2);
                    }
                }// end while
                
                Arrays.sort(this.Dictionarywordslevel1);
                Arrays.sort(this.Dictionarywordslevel2);
                
        }catch(FileNotFoundException fne){
            System.out.println("Given file is not found please check the path and filename");
        }catch(IndexOutOfBoundsException iob){
            System.out.println("Index out of Bounce Exception");
        }
    
    }
    
 private void LoadArraysintoDictionary(){
     
 }
 
    public void Menu(){
        try{
        Scanner inputscanner=new Scanner(System.in);
           while(true){
            for(String menuitems: this.menuitems){
                System.out.println(menuitems);
            }
             String cmdlinerader=inputscanner.next();

             cmdlinerader=cmdlinerader.toUpperCase();
             char choice=cmdlinerader.charAt(0);

                switch(choice){

                    case 'A':
                         break;
                    case 'B':
                         break;     
                    case 'C':
                         break;
                    case 'D':
                         break;      
                    case 'E':
                           inputscanner.close();
                        System.exit(0);
                         break;
                    default:
                          System.out.println("Please Enter valid option");
                        break;  
                }
            }//end of while
        }catch(Exception e){
            System.out.println("unexpected exception closing down program..");
        }
        
    }
    
    
}
