package Chapter1.C1;

import java.util.Stack;
import java.util.Scanner;

/**
 * 设计一个有getMin功能的栈
 */
public class Main {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public Main() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int num) {
        if (minStack.size() == 0) {
            minStack.push(num);
        } else {
            if(minStack.peek() > num) {
                minStack.push(num);
            } else {
                minStack.push(minStack.peek());
            }
        }
        stack.push(num);
    }


    public int pop() {
        if (stack.size() == 0) {
            throw new RuntimeException("");
        } else {
            minStack.pop();
            return stack.pop();
        }
    }

    public int getMin() {
        if (stack.size() == 0) {
            throw new RuntimeException("");
        }
        return minStack.peek();
    }


    public static void main(String[] args) {
        Main s = new Main();
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        for (int i = 0;i < n;i++) {
            String[] str = input.nextLine().split(" ");
            if (str[0].equals("push")) {
                s.push(Integer.valueOf(str[1]));
            } else if (str[0].equals("pop")) {
                s.pop();
            } else if (str[0].equals("getMin")) {
                System.out.println(s.getMin());
            }
        }
    }


}