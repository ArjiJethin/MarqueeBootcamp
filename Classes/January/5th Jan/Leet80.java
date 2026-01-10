public class Leet80 {
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int removeDuplicates(int[] nums) {
        int edgeptr = nums.length - 1;
        @SuppressWarnings("unused")
        int n = nums.length;

        int index = 1;
        int curr = nums[0];
        int ctr = 1;
        while (index <= edgeptr) { // FIX 1: Changed < n to <= edgeptr
            if (curr != nums[index]) {
                ctr = 1;
                curr = nums[index];
                index += 1;
            } else if (curr == nums[index] && ctr < 2) { // FIX 2: Changed <= to < and added else if
                ctr += 1;
                index += 1;
            } else if (ctr >= 2) { // FIX 3: Changed if to else if, and > to >=
                // FIX 4: Fixed the swap logic
                for (int i = index; i < edgeptr; i++) {
                    swap(nums, i, i + 1);
                }
                edgeptr -= 1;
                n -= 1; // FIX 5: Decrement n to track actual size
                // Don't increment index here, recheck current position
            }
        }

        return (edgeptr + 1);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int newLength = removeDuplicates(nums);
        System.out.println(newLength);
    }
}
