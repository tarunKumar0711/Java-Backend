package com.Collections;
import java.util.*;
public class NewStack {

	public static void main(String args[]) {
		int n = 5;
		 
        List<Integer> s = new Stack<Integer>();
 
        for (int i = 1; i <= n; i++)
            s.add(i+345);//s.add((int)Math.random());
 
        System.out.println(s);
 
        s.remove(3);
 
        System.out.println(s);
 
        for (int i = 0; i < s.size(); i++)
            System.out.print(s.get(i) + " ");
	}
}
