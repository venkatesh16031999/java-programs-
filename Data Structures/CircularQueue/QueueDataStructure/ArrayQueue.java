package QueueDataStructure;

public class ArrayQueue {

	private Employee[] queue;
	private int front;
	private int back;
	
	public void capacity(int num) {
		queue=new Employee[num];
	}
	
	public void offerElement(Employee employee) {
		if(size()==queue.length-1) {
			int len=size();
			Employee[] newarray=new Employee[2*queue.length];
			System.arraycopy(queue, front, newarray, 0, queue.length-front);
			System.arraycopy(queue, 0, newarray, queue.length-front, back);
			queue=newarray;
			front=0;
			back=len;
			
		}
		
		queue[back]=employee;
		if(back<queue.length-1) {
			back++;
		}else {
			back=0;
		}
	}
	
	public Employee removeElement() {
		
		if (size() == 0) {
            return null;
        }
		
		Employee employee=queue[front];
		queue[front]=null;
		front++;
		
		if(size()==0) {
			front=0;
			back=0;
		}else if(front==queue.length) {
			front=0;
		}
		
		return employee;
	}
	
	public Employee peek() {
		
		if (size() == 0) {
            return null;
        }
		
		return queue[front];
	}
	
	
	public int size() {
		if(front<=back) {
			return back-front;
		}else {
			return back-front+queue.length;
		}
	}
	
	public void print() {
		if(front<=back) {
			for(int i=front;i<back;i++) {
				System.out.println(queue[i]);
		}
		}else {
			for(int i=front;i<queue.length;i++) {
				System.out.println(queue[i]);
			}
			for(int i=0;i<back;i++) {
				System.out.println(queue[i]);
			}
		}
		
	}
	
	
	
}
