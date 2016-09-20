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
public class ListOfNodes {
    DictionaryNode Firstnode=null;
    
    public ListOfNodes(){
        Firstnode=null;
    }
    
    public void insertFirstNode(String word, int level){
        DictionaryNode dwnode=new DictionaryNode(word,level);
        dwnode.setNext(Firstnode); // first node is been assinged to next node
        Firstnode=dwnode;
    }
    
    public void Display(){
        System.out.println("Printing...");
        DictionaryNode tempnode=Firstnode;
        
        while(Firstnode!=null){
          System.out.print(tempnode.toString()+"\t");
          Firstnode=tempnode.getNext();
        }
    }
}
