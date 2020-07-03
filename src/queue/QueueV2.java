package queue;

/**
 * @author ango1019
 * Date: 30.04.2020
 * Time: 14:50
 */
public class QueueV2 {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;

    public QueueV2(int maxSize) {
        this.maxSize = maxSize + 1;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
    }

    public void insert(long j) {
        if(rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = j;
    }

    public long remove() {
        long temp = queArray[front++];
        if(front == maxSize) {
            front = 0;
        }
        return temp;
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (rear + 1 == front || (front + maxSize - 1 == rear));
    }

    public boolean isFull() {
        return (rear + 2 == front || (front + maxSize - 2 == rear));
    }

    public int size() {
        if(rear >= front) {
            return rear-front+1;
        }
        return (maxSize - front) + (rear + 1);
    }
}