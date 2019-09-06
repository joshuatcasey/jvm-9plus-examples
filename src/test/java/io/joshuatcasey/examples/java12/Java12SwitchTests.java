package io.joshuatcasey.examples.java12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class Java12SwitchTests {

    private Java12Switch java12Switch;

    private static class SwitchTestArgs implements ArgumentsProvider {

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(-1, "dunno"),
                    Arguments.of(0, "zero"),
                    Arguments.of(1, "one"),
                    Arguments.of(2, "two"),
                    Arguments.of(42, "dunno")
            );
        }
    }

    @BeforeEach
    void setUp() {
        java12Switch = new Java12Switch();
    }

    @ParameterizedTest
    @ArgumentsSource(SwitchTestArgs.class)
    void vintageSwitch(int input, String expected) {
        assertThat(java12Switch.vintageSwitch(input), is(expected));
    }

    @ParameterizedTest
    @ArgumentsSource(SwitchTestArgs.class)
    void enhancedSwitch(int input, String expected) {
        assertThat(java12Switch.enhancedSwitch(input), is(expected));
    }

}
