/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigcse004;

/**
 *
 * @author hci
 */
public class DictionaryNode {
    protected String word;
    private int level;
    private DictionaryNode Next; 

    public DictionaryNode(String word, int level){
        this.word=word;
        this.level=level;
    }
    /**
     * @return the words
     */
    public String getWords() {
        return word;
    }

    
    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

       /**
     * @return the DictionayWords
     */
    public DictionaryNode setNext(DictionaryNode node) {
        return this.Next=node;
    }

    /**
     * @param DictionayWords the DictionayWords to set
     */
     
    public String toString(){
        return this.word+" - "+ this.level;
    }
    public String nodedata(){
        return this.word;
    }

    /**
     * @return the Next
     */
    public DictionaryNode getNext() {
        return Next;
    }
    
}
