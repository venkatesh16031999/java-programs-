import java.util.*;

class Node{
    Node next;
    Node prev;
    String data;
    
    public Node(String name){
        this.data=name;
    }
    
}

class LL{
    
    Node head;
    Node tail;
    int size;
    
    public void add(String name){
        
        if(head == null){
            head = new Node(name);
            tail = head;
        }
        else{
            
            tail.next = new Node(name);
            tail = tail.next;
        }
        size++;
    }
    
    public void print(){
        
        Node cur = head;
        
        while(cur!=null){
            System.out.println(cur.data+" ");
            cur = cur.next;
        }
        
    }
    
    public void sort(){
        Node cur1 = head;
        
        while(cur1.next!=null){
            Node cur2 = cur1;
            
            while(cur2.next!=null){
                
                if(cur1.data.compareTo(cur2.next.data)==1){
                    String temp = cur1.data;
                    cur1.data = cur2.next.data;
                    cur2.next.data = temp;
                }
                
                cur2 = cur2.next;
            }
            
            cur1=cur1.next;
        }
        
        
    }
    
}


public class Main{
    
    public static void main(String args[]){
     
     Scanner scan=new Scanner(System.in);
     
     int n = scan.nextInt();
     scan.nextLine();
     
     LL list = new LL();
     
     for(int i=0;i<n;i++){
         String name = scan.nextLine();
         list.add(name);
         
     }
     
     list.sort();
     
     list.print();
        
    }
}
