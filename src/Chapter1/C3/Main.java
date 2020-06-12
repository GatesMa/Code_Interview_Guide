package Chapter1.C3;

import java.util.Scanner;
import java.util.Stack;

/**
 * Copyright (C), 2020
 * FileName: Main
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/6/12 15:58
 * Description: 用递归实现栈的反转
 */
public class Main {

    private Stack<Integer> s;

    public static Scanner input = new Scanner(System.in);

    public Main() {
        s = new Stack<>();
    }

    public Stack<Integer> getS() {
        return s;
    }

    public void setS(Stack<Integer> s) {
        this.s = s;
    }

    public void reverse(int n) {
        if (n != 0) {
            int num = input.nextInt();
            reverse(n - 1);
            s.push(num);
        }
    }

    public static void main(String[] args) {

        int n = Integer.valueOf(input.nextLine());
        Main m = new Main();
        m.reverse(n);
        m.getS().forEach(i -> {
            System.out.print(i + " ");
        });
    }

}
