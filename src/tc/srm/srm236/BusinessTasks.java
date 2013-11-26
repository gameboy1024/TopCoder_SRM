package tc.srm.srm236;

import java.util.ArrayList;

public class BusinessTasks {
	
	public static String getTask(String[] list, int n){
		// Use the arraylist to quickly locate and delete n-th element
		ArrayList<Integer> listArray = new ArrayList<Integer>();
		// Fill it with int instead of original string to save space
		for (int i = 0; i < list.length; i++) {
			listArray.add(i);
		}
		int len = listArray.size();
		int current = 0;
		while (len != 1) {
			// Add n - 1 to the target place and modulo len to get the position
			current = (current + n - 1) % len;
			listArray.remove(current);
			len = listArray.size();
		}
		return list[listArray.get(0)];
	}

	public static void main(String[] args) {
		String [] list;
		list = new String [] {"a","b","c","d"};
		System.out.println(getTask(list, 2));
		list = new String []{"a","b","c","d","e"};
		System.out.println(getTask(list, 3));
		list = new String [] {"alpha","beta","gamma","delta","epsilon"};
		System.out.println(getTask(list, 1));
		list = new String [] {"a","b"};
		System.out.println(getTask(list, 1000));
		list = new String [] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t",
			"u","v","w","x","y","z"};
		System.out.println(getTask(list, 17));
		list = new String [] {"zlqamum","yjsrpybmq","tjllfea","fxjqzznvg","nvhekxr","am","skmazcey","piklp",
			"olcqvhg","dnpo","bhcfc","y","h","fj","bjeoaxglt","oafduixsz","kmtbaxu",
			"qgcxjbfx","my","mlhy","bt","bo","q"};
		System.out.println(getTask(list, 9000000));
	}

}
