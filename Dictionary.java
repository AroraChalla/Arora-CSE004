/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigcse004;

import java.util.Arrays;

/**
 *
 * @author hci
 */
public class Dictionary {
    // array index are programmed in such a way
   
    public ListOfNodes[] data;

    String wordstr="abcdefghijklmnopqrstuvwxyz";
    int lenofwords=0;
    
    
    public Dictionary() throws InterruptedException{
            System.out.println("b4r");
                 this.data= new ListOfNodes[26]; // initialising array of objects
                 
                 for(int i=0;i<26;i++){
                 this.data[i]=new ListOfNodes(); // creating objects into arrays
                 }
                 
            System.out.println("after");
        wordstr=wordstr.trim().toLowerCase();
        
         char []charray=wordstr.toCharArray();
                 
         this.lenofwords=charray.length;
         

        for(int i=0; i<lenofwords;i++){
             if(this.data[i]!=null)
                this.data[i].setCharacter(charray[i]);
                System.out.println(charray[i]);
                Thread.sleep(5);
        }
        
    }
    private boolean insertDictionaryNode(String word, int level){
            //      Insert the new node and assign the new node 
            //      next node of the Dictionary node is set to the new node
            int nodeindex=100;
            for(int index=0;index<lenofwords;index++){
                if(word.charAt(0)==this.wordstr.charAt(index)){
                    nodeindex=index;
                }
            }
            if(nodeindex>lenofwords){
                System.out.println("given string is not permitted in Dictionary");
                return false;
            }else{
            
                this.data[nodeindex].insertNode(word, level);
                
                return true;
                
            }
            
       
    }
    
    public void insertWord(String word, int level){
        this.insertDictionaryNode(word.toLowerCase(), level);
    }
    public void DisplayDictionary(){
        for(ListOfNodes node: this.data){
            node.Display();
        }
    }
    
   
    public void searchforLinkingWords(String word, int level){
    
    }

        
    
    
}
