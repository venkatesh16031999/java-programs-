package DLDataStructure;

public class DoublyLinkedList {

	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;
	
	public void addToFront(Employee employee) {
		EmployeeNode node=new EmployeeNode(employee);
		
		if(head==null){
			tail=node;
		}else {
			node.setNext(head);
			head.setPrevious(node);
		}
		
		head=node;
		size++;
	}
	
	public void addToEnd(Employee employee) {
		EmployeeNode node=new EmployeeNode(employee);
		
		if(tail==null){
			head=node;
		}else {
			node.setPrevious(tail);
			tail.setNext(node);
		}
		
		tail=node;
		size++;
	}
	
	public EmployeeNode removeFromFront() {
		if(head==null) {
			return null;
		}else {
			
			EmployeeNode removeNode=head;
			
			if(head.getNext()==null) {
				tail=null;
			}else {
				head.getNext().setPrevious(null);
			}
			
			head=head.getNext();
			removeNode.setNext(null);
			size--;
			return removeNode;
			
		}
	}
	
	public EmployeeNode removeFromEnd() {
		if(tail==null) {
			return null;
		}
		
		EmployeeNode removeNode=tail;
		
		if(tail.getPrevious()==null) {
			head=null;
		}else {
			tail.getPrevious().setNext(null);
		}
		
		
		tail=tail.getPrevious();
		removeNode.setPrevious(null);;
		size--;
		return removeNode;
		
	}
	
	public void printlist() {
		EmployeeNode current=head;
		while(current!=null) {
			System.out.print(current+" <=> ");
			current=current.getNext();
		}
		System.out.println("null");
	}
	
	public int size() {
		return size;
	}
	
	public boolean addBefore(Employee newemployee,Employee existingemployee) {
		if(head==null && tail==null) {
			return false;
		}
		
		EmployeeNode current = head;
		while(current!=null && !current.getEmployee().equals(existingemployee)) {
			current=current.getNext();
		}
		
		EmployeeNode newnode=new EmployeeNode(newemployee);
		
		if(current==null) {
			return false;
		}
		
		newnode.setNext(current);
		newnode.setPrevious(current.getPrevious());
		current.setPrevious(newnode);
		
		if(head==current) {
			head=newnode;
		}
		else {
			newnode.getPrevious().setNext(newnode);
		}
		
		size++;
		return true;
	}
	
	
	
}
