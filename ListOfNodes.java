/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigcse004;

/**
 *
 * @author hci
 * http://www.mycstutorials.com/articles/data_structures/linkedlists
 */
public class ListOfNodes {
    private char character;
    DictionaryNode head=null;
    private int counter;
    
    public ListOfNodes(){
        counter=0;
        System.out.println("<>");
    }
    
    public void insertNode(String word, int level){
        DictionaryNode dwnode=new DictionaryNode(word,level);
        DictionaryNode current=head;
        // move to end of the node which is current position
        while(current.getNext()!=null){
            current=current.getNext();
        }
        current.setNext(dwnode); // first node is been assinged to next node
        counter++;
    }
    
    public void insertNodeatIndex(String word, int level, int index){
            DictionaryNode dwnode=new DictionaryNode(word,level);
            DictionaryNode current=head;
            
            for(int i = 1; i < index && current.getNext() != null; i++)
		{
			current = current.getNext();
		}
		// set the new node's next-node reference to this node's next-node reference
		dwnode.setNext(current.getNext());
		// now set this node's next-node reference to the new node
		current.setNext(dwnode);
		counter++;
    }
    
    public void Display(){
        System.out.println("Printing...");
        DictionaryNode tempnode=head;
        
        while(head!=null){
          System.out.print(tempnode.toString()+"\t");
          head=tempnode.getNext();
        }
    }

    /**
     * @return the character
     */
    public char getCharacter() {
        return character;
    }

    /**
     * @param character the character to set
     */
    public void setCharacter(char character) {
        this.character = character;
    }
}
