package algorythms_general_training.easy;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }
        }

        int insertIndex = 0;

        if (nums[0] != 0) {
            insertIndex++;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }

        if (zeroCount > 0) {
            for (int i = nums.length - 1; i > nums.length - zeroCount - 1; i--) {
                nums[i] = 0;
            }
        }
    }
}
