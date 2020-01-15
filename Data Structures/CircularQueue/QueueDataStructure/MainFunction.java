package QueueDataStructure;



public class MainFunction {
	public static void main(String args[]) {
		
		Employee E1=new Employee("Venkatesh",9487220819L,20);
		Employee E2=new Employee("venki",9487220819L,20);
		Employee E3=new Employee("Yadhu",9487220819L,20);
		Employee E4=new Employee("Yaedhu",9487220819L,20);
		Employee E5=new Employee("Yadehu",9487220819L,20);
		Employee E6=new Employee("Yadheeu",9487220819L,20);
		
		ArrayQueue q=new ArrayQueue();
		
		q.capacity(5);
		q.offerElement(E1);
		q.offerElement(E2);
		q.offerElement(E3);
		q.offerElement(E4);
		q.offerElement(E5);
		q.offerElement(E6);
		q.removeElement();
		q.removeElement();
		q.offerElement(E1);
		q.offerElement(E2);
		System.out.print("peek : "+q.peek()+"\n");
		q.print();
	}
}
