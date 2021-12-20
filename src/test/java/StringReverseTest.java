import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseTest {

    StringReverse reverse;

    @BeforeEach
    void init() {
        reverse = new StringReverse();
    }

    @ParameterizedTest
    @CsvSource({"'',''", "a,a", "ba,ab", "drow,word", "serugiF123,Figures123"})
    @DisplayName("testMethodReversesWordWithDifferentParameters")
    void testWithWordParameter(String expected, String actual) {
        assertEquals(expected, reverse.reversesWord(actual));
    }

    @Test
    @DisplayName("testMethodReversesWordThrowExceptionOnNull")
    void testMethodReversesWordShouldThrowExceptionOnNull() {
        assertThrows(IllegalArgumentException.class,
                () -> reverse.reversesWord(null));
    }

    @ParameterizedTest
    @CsvSource({"a,a", "cba fed,abc def", "'',''", "ba dc fe,ab cd ef",
            "!,!", "![],![]", "aa,aa", "gDfA,AfDg", "rdnaskela,aleksandr",
            "kuhcnimzuk rdnaskela,kuzminchuk aleksandr",
            "kuhcnimzuK rdnaskelA 14.04.1988,Kuzminchuk Aleksandr 14.04.1988"})
    @DisplayName("testMethodReverseAlphabeticCharsOnlyWithDifferentParameters")
    void testWithExplicitArgumentConversion(String expected, String actual) {
        assertEquals(expected, reverse.reverseAlphabeticCharsOnly(actual));

    }

    @Test
    @DisplayName("testMethodReverseAlphabeticCharsOnlyThrowExceptionOnNull")
    void testMethodReverseAlphabeticCharsOnlyShouldThrowExceptionOnNull() {
        assertThrows(IllegalArgumentException.class,
                () -> reverse.reverseAlphabeticCharsOnly(null)
        );
    }


}