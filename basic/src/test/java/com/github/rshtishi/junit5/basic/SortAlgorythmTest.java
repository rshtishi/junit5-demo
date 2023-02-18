package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.*;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SortAlgorythmTest {

    @TestTemplate
    @ExtendWith(AlgorythmParameterResolver.class)
    void testSortAlgorythm(SortAlgorythm algorythm) {
        // setup
        int[] arr = {3, 1, 4, 2, 5};

        // execute
        int[] sortedArr = algorythm.sort(arr);

        // verify
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArr);
    }

    static private class AlgorythmParameterResolver implements TestTemplateInvocationContextProvider {


        @Override
        public boolean supportsTestTemplate(ExtensionContext extensionContext) {
            return extensionContext.getTestMethod().isPresent() &&
                    extensionContext.getTestMethod().get().isAnnotationPresent(TestTemplate.class);
        }

        @Override
        public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(ExtensionContext extensionContext) {
            SortAlgorythm[] algorythms = {new BubbleSortAlgorythm(), new SelectionSortAlgorythm()};
            return Stream.of(algorythms)
                    .map(algorythm -> new TestTemplateInvocationContext() {
                        @Override
                        public String getDisplayName(int invocationIndex) {
                            return algorythm.getClass().getSimpleName();
                        }

                        @Override
                        public List<Extension> getAdditionalExtensions() {
                            return Collections.singletonList(new ParameterResolver() {
                                @Override
                                public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
                                    return parameterContext.getParameter().getType().equals(SortAlgorythm.class);
                                }

                                @Override
                                public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
                                    return algorythm;
                                }
                            });
                        }
                    });
        }
    }
}