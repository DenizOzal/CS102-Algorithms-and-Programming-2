/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs102.ds;

/**
 *
 * @author Deniz Semih Özal
 * @version 13/05/2020
 */
public class List{
    //properties
    private Node head;
    
    //contructors
    public List(){
        head = null;
}
    /*
     * addToHead method adds item to the head
     * @param String item
    */
    public void addToHead( String item){
      
       if ( head == null)
           head = new Node(item, null);
       else{
           Node temp = head;
           head = new Node(item, null);
           head.next = temp;
            
       }
    }
    /*
     * addToTail method adds item to the tail
     * @param String item
    */
    public void addToTail( String item){
        if ( head == null){
            Node temp = new Node(item, null);
            head = temp;
        }
        else{
            Node temp = head;
            while( temp.next != null){
                temp = temp.next;
            }
            Node tail = new Node(item, null);
            temp.next = tail;
        }
    }
    /*
     * removeFromHead method removes item from head
    */
    public String removeFromHead(){
        Node temp = head;
        if ( temp == null)
            return null;
        else{
            head = head.next;
            return temp.data;
        }
    }
    /*
     * isEmpty method checks whether list is empty or not
    */
    public boolean isEmpty(){
        if ( head == null)
            return true;
        else
            return false;
    }
    /*
     * getData method gives the desired data according to its index
     * @param int index
    */
    public String getData(int index){
        Node currentNode = head;
        int count = 0;
        while( currentNode != null){
            if( count == index)
                return currentNode.data;
            else{
                currentNode = currentNode.next;
                count++;
            }     
        }
        return null;
    }
    /*
     * print method prints the list in order
    */
    public void print(){
        Node temp = head;
        while( temp != null){
            System.out.print( temp.data + " ");
            temp = temp.next;
        }
    }
    /*
     * printReverse method prints the list reverse order
    */
    public void printReverse(){
        Node temp = head;
        List list = this;
        if ( temp != null){
            list.removeFromHead();
            printReverse();
            System.out.print(temp.data + " ");
        }
    }
   
    /*
     * contains method checks whether the desired string is in the list or not
     * @param String target
     * @return flag boolean
    */
    public boolean contains( String target){
        Node temp = head;
        boolean flag = false;
        while( temp != null && !flag){
            if ( temp.data.equals(target)){
                flag = true;
            }
            temp = temp.next;
        }
        return flag;
    }
     /*
      * isOrdered method checks whether the list is in order or not
      * @return flag boolean
     */
    public boolean isOrdered(){
        Node temp = head;
        boolean flag = false;
        while ( head != null &&  head.next != null && flag != false){
            if ( temp.next.data.compareTo(temp.data) > 0)
                flag = true;
            temp = temp.next;
        }
        return flag;
    }
     /*
      * toString method that returns a String representation of the list
      * @return str String
     */
    public String toString(){
        Node temp = head;
        String str = "";
        while( temp != null){
            str = str + temp.data + ",";
            temp = temp.next;
        }
        return "[" + str + "]";
    }
    
    // Inner Class Node
    private Node next(Node n){
        if ( n.next != null){
            return n.next;
        }
        else{
            return null;
        }
    }
    
     /*
      * previous that returns a reference to n's successor or null if it doesn't have one.
      * @param Node n
      * @return temp Node
     */
    private Node previous(Node n){
        Node temp = head;
        if ( isEmpty())
            return null;
        while( temp.next != null){
            if ( temp.next.data.equals( n.data)){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    
    public static List createFrom( String[] temp){
        List list = new List();
        for( int i = 0; i < temp.length; i++){
            list.addToTail( temp[i]);
        }
        return list;
    }
    
    public static List createFrom( String temp){
        List list = new List();
        for ( int i = 0; i < temp.length(); i++){
            list.addToTail( temp.substring( i, i + 1));
        }
        return list;
    }
    
    public static List merger( List a, List b){
        List list = new List();
        for ( int i = 0; a.getData(i) != null; i++){
            if ( !b.contains( a.getData(i)))
                list.addToTail(a.getData(i));
        }
        for ( int i = 0; b.getData(i) != null; i++){
            if ( !a.contains( b.getData(i)))
                list.addToTail( b.getData(i));
        }
        return list;
    }
    
   

    private Node tail(){
        Node temp = head;
        while( temp.next != null){
            temp = temp.next;
        }
        return temp;
    }
    
    
    
    // Inner Class Node
    class Node {
    String data;
    Node next;
    public Node( String data, Node next) {
       this.data = data;
       this.next = next;
    }
  }
    public static void main(String[] args) {
    List list = new List();
    // AddingToHead
    System.out.println("***************************");
    list.addToHead("A");
    list.addToHead("B");
    list.addToHead("C");
    list.addToHead("D");
    list.addToHead("F");
    list.addToHead("G");
    System.out.println("AddingToHead: "+ list);
    System.out.println("***************************");
    
    list.addToTail("K");
    System.out.println("AddingToTail: " + list);
    System.out.println("***************************");
    
    System.out.println("Removing from head: " + list.removeFromHead());
    System.out.println("Currentlist: " + list);
    System.out.println("***************************");
    
    int index; 
    index = 3;
    System.out.println("GetData: " + list.getData(index));
    System.out.println("***************************");
    
    System.out.println("print: ");
    list.print();
    
    System.out.println();
    System.out.println("***************************");
    System.out.println("printReverse: ");
    list.printReverse();
    System.out.println();
    System.out.println("***************************");
    
    String str;
    str = "A";
    System.out.println("Contains:");
    if ( list.contains(str))
        System.out.println( "It contains " + str);
    else
        System.out.println( "It does not contain " + str);
    System.out.println("***************************");
    
    if(list.isOrdered()){
        System.out.println("List is ordered");
    }
    else{
        System.out.println("List is not ordered");
    }
    System.out.println("***************************");
    
    String tempString[] = { "Bilkent", "University"};
    System.out.println("CreateFrom(Array): " + createFrom(tempString));
    System.out.println("***************************");
    
    String tempString1 = "Bilkent";
    System.out.println("CreateFrom(String): " + createFrom(tempString1));
    System.out.println("***************************");
    
    List a = new List();
    a.addToTail("A");
    a.addToTail("D");
    a.addToTail("C");
    
    List b = new List();
    b.addToTail("K");
    b.addToTail("B");
    b.addToTail("A");
    b.addToTail("C");
    b.addToTail("R");
    
    System.out.println( "List A: " + a);
    System.out.println( "List B: " + b);
    System.out.println( "Merge: " + merger(a, b));
    
    
    
    
    
    
    
    
    
  
    }
} // end class Node
