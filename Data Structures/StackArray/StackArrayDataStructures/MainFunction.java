package StackArrayDataStructures;


public class MainFunction {
	public static void main(String args[]) {
		
		Employee E1=new Employee("Venkatesh",9487220819L,20);
		Employee E2=new Employee("venki",9487220819L,20);
		Employee E3=new Employee("Yadhu",9487220819L,20);
		
		StackArray st=new StackArray();
		st.capacity(5);
		st.push(E1);
		st.push(E2);
		st.printstack();
		st.push(E3);
		System.out.println("Peek :"+st.peek());
		System.out.println();
		st.printstack();
		st.printstack();
		System.out.println("Pop :"+st.pop());
		
		System.out.println("Size :"+st.size());
		
		
		
	}
}
