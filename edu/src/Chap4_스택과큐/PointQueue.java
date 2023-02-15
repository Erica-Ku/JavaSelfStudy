package Chap4_스택과큐;

public class PointQueue {
	private Point[] data;
	private int capacity;         
    private int front;            
    private int rear;
    private int num;
    
    //실행 시 예외: 큐가 비어 있음
    public class EmptyPointQueueException extends RuntimeException {
    	public EmptyPointQueueException() {}
    }
    
    //실행 시 예외: 큐가 가득 참
    public class OverflowPointQueueException extends RuntimeException {
    	public OverflowPointQueueException() {}
    }
    
    //생성자
    public PointQueue(int capacity) {
    	num = front = rear = 0;
    	this.capacity = capacity;
    	try {
    		data = new Point[capacity];
    	} catch (OutOfMemoryError e) {
    		capacity = 0;
    	}
    }
    
    //큐에 데이터를 push
    public Point push(Point x) throws OverflowPointQueueException {
    	if (num>=capacity) throw new OverflowPointQueueException();
    	data[rear++] = x;
    	num++;
    	if (rear==capacity) rear = 0;
    	return x;
    }
    
    //큐에 데이터를 pop
    public Point pop() throws EmptyPointQueueException {
    	if (num<=0) throw new EmptyPointQueueException();
    	Point x = data[front++];
    	num--;
    	if (front == capacity) front = 0;
    	return x;
    }
    
    //큐에서 데이터를 피크(프런트 데이터를 들여다봄)
    public Point peek() throws EmptyPointQueueException {
    	if (num<=0) throw new EmptyPointQueueException();
    	return data[front];
    }
    
    //큐를 비움
    public void clear() {
    	num = front = rear = 0;
    }
    
    //큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
    public int indexOf(Point x) {
    	for (int i = 0; i < num; i++) {
    		int idx = (i + front) % capacity;
    		if (data[idx]==x) return idx;
    	}
    	return -1;
    }
    
    //큐의 용량을 반환
    public int getCapacity() {
    	return capacity;
    }
    
    //큐에 쌓여 있는 데이터 개수를 반환
    public int size() {
    	return num;
    }
    
    //큐가 비어 있나요?
    public boolean isEmpty() {
    	return num <= 0;
    }
    
    //큐가 가득 찼나요?
    public boolean isFull() {
    	return num >= capacity;
    }
    
    //큐 안의 모든 데이터를 프런트 -> 리어 순서로 출력
    public void dump() {
    	if (num<=0) System.out.println("큐가 비어 있습니다.");
    	else {
    		for (int i = 0; i < num; i++) System.out.print(data[(i+front)%capacity]+" ");
    		System.out.println();
    	}
    }
}
