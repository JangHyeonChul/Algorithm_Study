package Programers.dataStructure.stack;



public class ArrayStack implements ArrayStackInterface {

    private int index;
    private int size;
    private char[] stack;


    ArrayStack(int size) {
        index = -1;
        this.size = size;
        stack = new char[size];
    }


    @Override
    public void push(char item) {
        stack[++index] = item;
    }

    @Override
    public char pop() {
        return stack[index--];
    }

    @Override
    public char peek() {
        return stack[index];
    }
}
