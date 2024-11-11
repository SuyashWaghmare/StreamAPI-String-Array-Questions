package Streams;

import java.util.*;

class Result4 {

	public static int minimizeCost(List<Integer> arr) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(arr);
		int totalCost = 0;

		while (pq.size() > 1) {
			int sum = pq.poll() + pq.poll();
			totalCost += sum;
			pq.offer(sum);
		}

		return totalCost;
	}

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>(Arrays.asList(30, 10, 20));
		System.out.println(minimizeCost(arr)); // Output: 90
	}
}
