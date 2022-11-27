package linear.stack.withlist;

import java.util.ArrayList;
import java.util.List;

public class Stack<E> {
    private final List<E> list;
    private int top;

    public Stack() {
        this.list = new ArrayList<>();
        this.top = -1;
    }

    public void push(E value) {
        list.add(++top, value);
    }

    public E pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            System.exit(1);
        }
        return list.remove(top--);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public E peek() {
        return list.get(top);
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}

