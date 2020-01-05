package DLDataStructure;


public class MainFunction {
	public static void main(String args[]) {
		
		Employee E1=new Employee("Venkatesh",9487220819L,20);
		Employee E2=new Employee("venki",9487220819L,20);
		Employee E3=new Employee("Yadhu",9487220819L,20);
		
	DoublyLinkedList list=new DoublyLinkedList();
	
	list.addToFront(E1);
	list.addToFront(E2);
	list.addToFront(E3);
	list.printlist();
	System.out.println(list.size());
	Employee E4=new Employee("Yadhu krishnan",9487220819L,20);
	list.addToEnd(E4);
	list.printlist();
	Employee E5=new Employee("Amma",9487220819L,20);
	list.addBefore(E5,E4);
	list.printlist();
	System.out.println(list.size());
	list.removeFromFront();
	list.printlist();
	System.out.println(list.size());
	list.removeFromEnd();
	list.printlist();
	System.out.println(list.size());
	
	}
}
