package queue;

/**
 * @author ango1019
 * Date: 25.03.2020
 * Time: 15:08
 */
public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j) {
        if(rear == maxSize-1) {
            rear = -1;
        }
        queArray[++rear] = j;
        nItems++;
    }

    public long remove() {
        long temp = queArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;

        return temp;
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems==0);
    }

    public boolean isFull() {
        return (nItems==maxSize);
    }

    public int size() {
        return nItems;
    }
}

class QueueApp {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.insert(10);
        queue.insert(30);
        queue.insert(14);
        queue.insert(1);

        queue.remove();
        queue.remove();
        queue.remove();

        queue.insert(50);
        queue.insert(60);
        queue.insert(74);
        queue.insert(100);

        while (!queue.isEmpty()) {
            long n = queue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
