package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GradeServiceTest {

    private GradeService gradeService;

    @BeforeAll
    void setup() {
        gradeService = new GradeService("src/test/resources/grade-service-test.txt");
    }

    @Test
    public void test_average() {
        //execute
        int average = gradeService.average();
        //verify
        assertEquals(6, average);
    }

    public void test_moda() {
        //execute
        int moda = gradeService.moda();
        //verify
        assertEquals(5, moda);
    }
}