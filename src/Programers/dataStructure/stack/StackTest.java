package Programers.dataStructure.stack;

import java.util.Stack;

public class StackTest {

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();

        ArrayStack arrayStack = new ArrayStack(5);

        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);


    }
}
