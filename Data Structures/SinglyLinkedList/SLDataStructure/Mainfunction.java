package SLDataStructure;

public class Mainfunction {
	public static void main(String args[]) {
		
		Employee E1=new Employee("Venkatesh",9487220819L,20);
		Employee E2=new Employee("venki",9487220819L,20);
		Employee E3=new Employee("Yadhu",9487220819L,20);
		
		SinglyLinkedList list=new SinglyLinkedList();
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.getSize());
		list.addToFront(E1);
		list.addToFront(E2);
		list.addToFront(E3);
		list.removeFromFront();
		list.printlist();
		System.out.println(list.getSize());
		System.out.println(list.isEmpty());	
	}
}
