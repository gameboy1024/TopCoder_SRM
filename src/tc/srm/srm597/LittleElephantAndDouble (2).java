package tc.srm.srm597;

public class LittleElephantAndDouble {

	public static String getAnswer(int[] A) {
		int len = A.length;
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < len; i++) {
			if (A[i] <= min && A[i] != 1) {
				min = A[i];
			}
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] % min != 0 && A[i] != 1) {
				return "NO";
			}
			if (A[i] != 1) {
				A[i] /= min;
			}
		}

		boolean changed;
		do {
			changed = false;
			for (int i = 0; i < len; i++) {
				if (A[i] % 2 != 0 && A[i] != 1) {
					return "NO";
				}
				if (A[i] != 1) {
					A[i] /= 2;
					changed = true;
				}
			}
		} while (changed == true);
		return "YES";
	}

	public static void main(String[] args) {
		int[] input;
		input = new int[] { 1, 2 };
		System.out.println(getAnswer(input));
		input = new int[] { 1, 2, 3 };
		System.out.println(getAnswer(input));
		input = new int[] { 4, 8, 2, 1, 16 };
		System.out.println(getAnswer(input));
		input = new int[] { 94, 752, 94, 376, 1504 };
		System.out.println(getAnswer(input));
		input = new int[] { 148, 298, 1184 };
		System.out.println(getAnswer(input));
		input = new int[] { 7, 7, 7, 7 };
		System.out.println(getAnswer(input));
	}

}
