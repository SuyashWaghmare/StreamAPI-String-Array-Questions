import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		generateSubsets(nums);
	}

	public static void generateSubsets(int[] nums) {
		List<List<Integer>> subsets = new ArrayList<>();
		backtrack(nums, 0, new ArrayList<>(), subsets);
		subsets.forEach(System.out::println);
	}

	private static void backtrack(int[] nums, int index, List<Integer> current, List<List<Integer>> subsets) {
		if (!current.isEmpty()) {
			subsets.add(new ArrayList<>(current));
		}

		for (int i = index; i < nums.length; i++) {
			current.add(nums[i]);
			backtrack(nums, i + 1, current, subsets);
			current.remove(current.size() - 1);
		}
	}
}
