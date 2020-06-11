package Chapter1.C2;

import java.util.Scanner;
import java.util.Stack;

/**
 * Copyright (C), 2020
 * FileName: Main
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/6/8 09:37
 * Description:
 */
public class Main {

    Stack<Integer> s1;
    Stack<Integer> s2;

    public Main() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void add(Integer num) {
        s1.push(num);
    }

    public Integer peek() {
        if(s2.size() != 0) {
            return s2.peek();
        } else {
            while(s1.size() != 0) {
                Integer pop = s1.pop();
                s2.push(pop);
            }
            return s2.peek();
        }
    }

    public Integer poll() {
        if(!s2.isEmpty()) {
            return s2.pop();
        } else {
            while(s1.size() != 0) {
                Integer pop = s1.pop();
                s2.push(pop);
            }
            return s2.pop();
        }
    }

    public static void main(String[] args) {
        Main s = new Main();
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        for (int i = 0;i < n;i++) {
            String[] str = input.nextLine().split(" ");
            if (str[0].equals("add")) {
                s.add(Integer.valueOf(str[1]));
            } else if (str[0].equals("poll")) {
                s.poll();
            } else if (str[0].equals("peek")) {
                System.out.println(s.peek());
            }
        }
    }

}
