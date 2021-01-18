package stack;

public class StackOperation {
	int arr[];
	int cap;
	int top;
	StackOperation(int c) {
		cap = c;
		top = -1;
		arr = new int[cap];
	}
	
	void push(int x) {
		if(top==cap-1) {
			System.out.println("stack is overflow");
		}
		else {
		top++;
		arr[top] = x;
		}
	}
	
	int pop() {
	        if(top==-1){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
	        int res=arr[top];
	        top--;
	        return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOperation s = new StackOperation(5);
		s.push(15);
		s.push(5);
		s.push(85);
		s.push(1);
		s.push(6);
		System.out.println(s.pop()); 
		
		
	}

}
