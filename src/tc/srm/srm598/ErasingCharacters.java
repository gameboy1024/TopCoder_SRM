package tc.srm.srm598;

import java.util.Stack;

public class ErasingCharacters {
	
	public static String simulate(String s){
		Stack<Character> stack = new Stack<Character>();
		char [] sArray = s.toCharArray();
		for (int i = 0; i < sArray.length; i++){
			if(stack.isEmpty() || stack.peek() != sArray[i]){
				stack.push(sArray[i]);
			} else {
				stack.pop();
			}
		}
		Object [] result =  stack.toArray();
		StringBuffer buf = new StringBuffer();
		for(Object c : result){
			buf.append((Character) c);
		}
		return new String(buf);
	}

	public static void main(String[] args) {
		String input;
		input = "cieeilll";
		System.out.println(simulate(input));
		input = "topcoder";
		System.out.println(simulate(input));
		input = "abcdefghijklmnopqrstuvwxyyxwvutsrqponmlkjihgfedcba";
		System.out.println(simulate(input));
		input = "bacaabaccbaaccabbcabbacabcbba";
		System.out.println(simulate(input));
		input = "eel";
		System.out.println(simulate(input));

	}

}
