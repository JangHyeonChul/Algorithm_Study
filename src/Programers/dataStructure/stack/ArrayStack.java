package Programers.dataStructure.stack;



public class ArrayStack implements ArrayStackInterface {

    private int index;
    private int size;
    private int[] stack;


    ArrayStack(int size) {
        index = -1;
        this.size = size;
        stack = new int[size];
    }


    @Override
    public void push(int item) {
        stack[++index] = item;
    }

    @Override
    public int pop() {
        return stack[index--];
    }

    @Override
    public int peek() {
        return stack[index];
    }
}
