package Chapter1.C4;

import java.util.Stack;
import java.util.Scanner;

/**
 * Copyright (C), 2020
 * FileName: Main
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/6/12 16:27
 * Description:
 */
public class Main {


    public static void sortStackByStack(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<>();
        while (!stack.empty()) {
            int cur = stack.pop();
            while(!help.empty() && help.peek() < cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.empty()) {
            stack.push(help.pop());
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        Main m = new Main();

        int[] arr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = input.nextInt();
        }
        Stack<Integer> s = new Stack();
        for (int item : arr) {
            s.push(item);
        }
        sortStackByStack(s);
        //s.sort(null);
        while (!s.empty()) {
            System.out.print(s.pop() + " ");
        }
    }



}
