package SLDataStructure;

public class SinglyLinkedList {

	private EmployeeNode head;
	private int size;
	
	public void addToFront(Employee employee) {
		EmployeeNode node=new EmployeeNode(employee);
		node.setNext(head);
		head=node;
		size++;
	}
	
	public void printlist(){
		EmployeeNode current = head;
		while(current!=null) {
			System.out.println(current);
			current=current.getNext();
		}
	}
	
	public int getSize() { return this.size; }
	
	public boolean isEmpty() { return (head==null)?true:false; }
	
	public void removeFromFront() {
		if(head!=null) {
			EmployeeNode temp=head.getNext();
			head=null;
			head=temp;
			size--;
		}
	}
	
}
