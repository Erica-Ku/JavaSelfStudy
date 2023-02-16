package Chap4_스택과큐;

public class 원형큐1 {
	private Point[] data;
	private int capacity;         
    private int front;            
    private int rear;
    private int num;
    
    //실행 시 예외: 큐가 비어 있음
    public class Empty원형큐1Exception extends RuntimeException {
    	private static final long serialVersionUID = 1L;
    	public Empty원형큐1Exception() {}
    }
    
    //실행 시 예외: 큐가 가득 참
    public class Overflow원형큐1Exception extends RuntimeException {
    	private static final long serialVersionUID = 1L;
    	public Overflow원형큐1Exception() {}
    }
    
    //생성자
    public 원형큐1(int capacity) {
    	front = rear = -1;
    	num = 0;
    	this.capacity = capacity;
    	try {
    		data = new Point[capacity];
    	} catch (OutOfMemoryError e) {
    		capacity = 0;
    	}
    }
    
    //큐에 데이터를 push
    public Point push(Point x) throws Overflow원형큐1Exception {
    	if (isFull()) throw new Overflow원형큐1Exception();
    	else {
    		num++;
    		if(front==-1) {
    			front = 0;
				rear = (rear + 1) % capacity;
				data[rear] = x; 
    		}
    		else {
				rear = (rear + 1) % capacity;
				data[rear] = x;
			}
			return x;
    	}
    }
    
    //큐에 데이터를 pop
    public Point pop() throws Empty원형큐1Exception {
    	if (isEmpty()) throw new Empty원형큐1Exception();
    	else {
			Point x = data[front];
			num--;
			if (front == rear)
				front = rear = -1;
			else
				front = (front + 1) % capacity;
			return x;
		}
    }
    
    //큐가 비어 있나요?
    public boolean isEmpty() {
    			if (front == -1)
    				return true;
    			else
    				return false;
    }
    
    //큐가 가득 찼나요?
    public boolean isFull() {
    			if (front == 0 && rear == capacity - 1)
    				return true;
    			else if (front == rear + 1)
    				return true;
    			else
    				return false;
    }
    
    //큐 안의 모든 데이터를 프런트 -> 리어 순서로 출력
    public void dump() {
    	if (isEmpty())
			System.out.println("큐가 비어있습니다.");

		else if (front <= rear) {
			System.out.printf("*** :: 현재 저장된 데이터 :: %2d개\n", num);
			for (int i = front; i <= rear; i++) {
				System.out.print(data[i] + " ");
			}

			System.out.println();
		}

		else {
			System.out.printf("현재 저장된 데이터 : %2d개\n", num);

			for (int i = front; i < capacity; i++) {
				System.out.print(data[i] + " ");
			}

			for (int i = 0; i <= rear; i++) {
				System.out.print(data[i] + " ");
			}

			System.out.println();

		}
    }
}