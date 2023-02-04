package com.github.rshtishi.junit5.basic;

public class CanSumRecursiveImpl extends CanSum {

    public CanSumRecursiveImpl() {
    }

    @Override
    public boolean compute(int targetSum, int[] numbers) {
        if (targetSum == 0) {
            return true;
        }
        if (targetSum < 0) {
            return false;
        }
        for (int num : numbers) {
            int remainder = targetSum - num;
            if (compute(remainder, numbers) == true) {
                return true;
            }
        }
        return false;
    }
}
