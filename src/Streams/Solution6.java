package Streams;

import java.io.*;
import java.util.*;

class Result7 {
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
}

public class Solution6 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < arrCount; i++) {
			int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
			arr.add(arrItem);
		}

		//int result = Result.minimizeCost(arr);

		//bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
