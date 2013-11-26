package tc.srm.srm595;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LittleElephantAndIntervalsDiv1 {

	public static long getNumber(int M, int[] L, int[] R) {
		boolean [] slots = new boolean[2*M-1];
		Arrays.fill(slots, false);
		for (int i = 0; i < L.length; i++) {
			int left = 2*L[i] - 1;
			int right = 2*R[i] - 1;
			for (int j = 2*L[i] - 2; j <= 2*R[i] - 2; j++) {
				slots[j] = !slots[j];
			}
			for (boolean b : slots) {
				System.out.print(b != false ? 1:0);
			}
			System.out.println();
		}
		long count = 0;
		boolean temp = slots[0];
		for (int i = 1; i < slots.length; i++) {
			if (temp != slots[i]) {
				count++;
				temp = slots[i];
			}
		}
		for (boolean b : slots) {
			System.out.print(b != false ? 1:0);
		}
		System.out.println();
		return count;
	}
	
	public static void analyse(int M, int[] L, int[] R) {
		for (int i = 0; i < M - 1; i++) {
			for (int j = 0; j < L[i] - 1; j++) {
				System.out.print("-");
			}
			for (int j = L[i] - 1; j < R[i]; j++) {
				System.out.print("*");
			}
			for (int j = R[i] ; j < M; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] L, R;
		L = new int[] { 1, 2, 3 };
		R = new int[] { 1, 2, 3 };
		System.out.println("Returns: " + getNumber(4, L, R));
		//analyse(4, L, R);
		L = new int[] { 1, 1, 2 };
		R = new int[] { 3, 1, 3 };
		//analyse(3, L, R);
		System.out.println("Returns: " + getNumber(3, L, R));
		L = new int[] { 47 };
		R = new int[] { 747 };
		System.out.println("Returns: " + getNumber(1000, L, R));

		L = new int[] { 5, 23, 4, 1, 15, 2, 22, 26, 13, 16, 28, 13, 27, 9, 18,
				4, 10, 3, 4, 4, 3, 4, 1, 18, 18, 2, 38, 4, 10, 12, 3, 30, 11,
				38, 2, 13, 1, 13, 18, 16, 13, 2, 14, 27, 13, 3, 26, 19, 5, 10 };
		R = new int[] { 30, 41, 17, 1, 21, 6, 28, 30, 15, 19, 31, 28, 35, 27,
				30, 13, 31, 5, 8, 25, 40, 10, 3, 26, 23, 9, 40, 8, 40, 23, 12,
				37, 35, 39, 11, 34, 10, 21, 22, 21, 24, 5, 39, 27, 17, 16, 26,
				35, 25, 36 };
		//analyse(42, L, R);
		System.out.println("Returns: " + getNumber(42, L, R));
	}

}
