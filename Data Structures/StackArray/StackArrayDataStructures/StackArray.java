package StackArrayDataStructures;

public class StackArray {
	
	private Employee[] stack;
	private int top;
	
	public void capacity(int length) {
		stack=new Employee[length];
	}
	
	public void push(Employee employee) {
		if(top==stack.length) {
			Employee[] newarray=new Employee[2 * stack.length];
			System.arraycopy(stack, 0, newarray, 0, stack.length);
			stack=newarray;
		}
		
		stack[top++]=employee;
		
	}
	
	public Employee pop() {
		
		if(top==0 && stack.length==0) {
			return null;
		}
		
		Employee employee=stack[--top];
		stack[top]=null;
		return employee;
	}
	
	public Employee peek() {
		if(top==0 && stack.length==0) {
			return null;
		}
		
		return stack[top-1];
	}
	
	public int size() {
		return stack.length;
	}
	
	public void printstack() {
		for(int i=top-1;i>=0;i--) {
			System.out.println(stack[i]);
		}
		System.out.println();
	}
	
}
