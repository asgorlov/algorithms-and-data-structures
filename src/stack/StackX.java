package stack;

/**
 * @author ango1019
 * Date: 25.03.2020
 * Time: 13:31
 */
public class StackX {

    private int size;
    private char[] data;
    private int top;

    public StackX(int size) {
        this.size = size;
        data = new char[size];
        top = -1;
    }

    public void push(char character) {
        data[++top] = character;
    }

    public char pop() {
        return data[top--];
    }

    public char peek() {
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
}