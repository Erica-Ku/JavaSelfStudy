package Chap4_스택과큐;

public class 원형큐 {
	private Point[] data;
	//private int capacity;         
    private int front;            
    private int rear;
    //private int num;
    boolean isEmpty;
    int queue_size = 4;
    
    //실행 시 예외: 큐가 비어 있음
    public class Empty원형큐Exception extends RuntimeException {
    	private static final long serialVersionUID = 1L;
    	public Empty원형큐Exception() {}
    }
    
    //실행 시 예외: 큐가 가득 참
    public class Overflow원형큐Exception extends RuntimeException {
    	private static final long serialVersionUID = 1L;
    	public Overflow원형큐Exception() {}
    }
    
    //생성자
    public 원형큐(int capacity) {
    	front = rear = 0;
    	//num = 0;
    	//this.capacity = capacity;
    	isEmpty = true;
    	try {
    		data = new Point[capacity];
    	} catch (OutOfMemoryError e) {
    		capacity = 0;
    	}
    }
    
    //큐에 데이터를 push
    public void push(Point x) throws Overflow원형큐Exception {
//    	if (isFull()) throw new Overflow원형큐Exception();
//    	else {
//    		num++;
//    		if(front==-1) {
//    			front = 0;
//				rear = (rear + 1) % capacity;
//				data[rear] = x; 
//    		}
//    		else {
//				rear = (rear + 1) % capacity;
//				data[rear] = x;
//			}
//			return x;
//    	}
    	if(rear==front && !isEmpty) throw new Overflow원형큐Exception();
    	else {
    		isEmpty=false;
    		data[rear] = x;
    		rear++;
    		rear%=queue_size;
    	}
    }
    
    //큐에 데이터를 pop
    public Point pop() throws Empty원형큐Exception {
    	if (rear==front && isEmpty) throw new Empty원형큐Exception();
//    	else {
//			Point x = data[front];
//			num--;
//			if (front == rear)
//				front = rear = -1;
//			else
//				front = (front + 1) % capacity;
//			return x;
//		}
    	else {
    		Point x = data[front];
    		front++;
    		front%=queue_size;
    		if(front==rear) isEmpty=true;
    		return x;
    	}
    }
    
    public void clear() {
    	for(int i =0; i<data.length;i++) {
    		data[i]=null;
    		front=rear=0;
    	}
    	isEmpty=true;
    	System.out.println("원형큐를 비웠습니다.");
    }
    
    public void print() {
    	int cursor = front;
    	if(isEmpty) {
    		System.out.println("원형큐가 비어있습니다.");
    		return;
    	}
    	do {
    		System.out.print(data[cursor]+"");
    		cursor++; cursor%=queue_size;
    	} while(cursor!=rear);
    	System.out.println();
    }
}