package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Resultt {
	/**
	 * The function calculates the minimum cost of reducing the array to a single
	 * element.
	 * 
	 * @param arr An array of integers.
	 * @return The minimum cost of reducing the array.
	 */
	public static int minimizeCost(List<Integer> arr) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(arr);
		int totalCost = 0;

		while (pq.size() > 1) {
			int sum = pq.poll() + pq.poll(); // Pick two minimum elements
			totalCost += sum; // Add the cost of the operation
			pq.offer(sum); // Append the sum to the array
		}

		return totalCost;
	}

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>(Arrays.asList(30, 10, 20));
		System.out.println(minimizeCost(arr)); // Output: 90
	}
}
