package com.github.rshtishi.junit5.basic;

public class CanSumTabulationImpl extends CanSum {

    public CanSumTabulationImpl() {
    }

    @Override
    public boolean compute(int targetSum, int[] numbers) {
        boolean[] array = new boolean[targetSum + 1];
        array[0] = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == true) {
                for (int value : numbers) {
                    int index = i + value;
                    if (index < array.length) {
                        array[index] = true;
                    }
                }
            }
        }
        return array[targetSum];
    }
}
