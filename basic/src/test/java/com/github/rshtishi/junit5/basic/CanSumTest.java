package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

interface CanSumTest {

    static final int[] numbers = {4, 3, 2, 5};
    static final int targetSum = 7;

    CanSum getCanSum();

    @BeforeEach
    default void setup(TestInfo info) {
        System.out.println("Started: " + info.getDisplayName());
    }

    @DisplayName("When target sum is possible then can sum return true")
    @Test
    default void whenTargetSumIsPossibleThenCanSumReturnTrue(){
        //setup
        CanSum canSum = getCanSum();
        //execute
        boolean result = canSum.compute(targetSum,numbers);
        //verify
        assertEquals(true,result);
    }


    @AfterEach
    default void tearDown(TestInfo info) {
        System.out.println("Finished: " + info.getDisplayName());
    }

}