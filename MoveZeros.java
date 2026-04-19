class MoveZeros {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                for (int k = i; k < j; k++) {
                    int temp = nums[k];
                    nums[k] = nums[k + 1];
                    nums[k + 1] = temp;
                }

            }
        }
    }
}
