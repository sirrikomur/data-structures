package linear.stack.witharray;

public class Stack {
    private final Object[] array;
    private final int capacity;
    private int top;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
        this.top = -1;
    }

    public void push(Object value) {
        if (isFull()) {
            System.out.println("Stack is full!");
            System.exit(1);
        }

        array[++top] = value;
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            System.exit(1);
        }

        return array[top--];
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public Object peek() {
        return array[top];
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

