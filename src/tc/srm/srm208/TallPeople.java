package tc.srm.srm208;

public class TallPeople {
	public static int[] getPeople(String[] people){
		// x = row size, y = column size
		int x = people.length, y = 1;
		// Use people0 to find the column size
		char [] people0 = people[0].toCharArray();
		for (int i = 0; i < people0.length; i++) {
			if (people0[i] == ' ') {
				y++;
			}
		}
		int [][] matrix = new int [x][y];
		// Fill the matrix with parsed int
		for (int i = 0; i < x; i++) {
			int current = 0;
			int nextSpace;
			for (int j = 0; j < y; j++) {
				nextSpace = people[i].indexOf(' ', current);
				if (nextSpace == -1) {
					nextSpace = people[i].length();
				}
				matrix[i][j] = Integer.parseInt(people[i].substring(current, nextSpace));
				current = nextSpace + 1;
			}
		}
		// Find tall in short
		int shortt, tallInShort = 0;
		for (int i = 0; i < x; i++) {
			shortt = 1001;
			for (int j = 0; j < y; j++) {
				if (matrix[i][j] < shortt) {
					shortt = matrix[i][j];
				}
			}
			if (shortt > tallInShort) {
				tallInShort = shortt;
			}
		}
		// Find short in short
		int tall, shortInTall = 1001;
		for (int j = 0; j < y; j++) {
			tall = 0;
			for (int i = 0; i < x; i++) {
				if (matrix[i][j] > tall) {
					tall = matrix[i][j];
				}
			}
			if (tall < shortInTall) {
				shortInTall = tall;
			}
		}
		int [] rtn = {tallInShort, shortInTall};
		return rtn;
	}
	
	public static void main(String[] args) {
		String [] people;
		people = new String [] {"9 2 3", "4 8 7"};
		System.out.println(getPeople(people)[0] + "  " + getPeople(people)[1]);
		people = new String [] {"1 2", "4 5", "3 6"};
		System.out.println(getPeople(people)[0] + "  " + getPeople(people)[1]);
		people = new String [] {"1 1", "1 1"};
		System.out.println(getPeople(people)[0] + "  " + getPeople(people)[1]);
	}
}