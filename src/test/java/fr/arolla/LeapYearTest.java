package fr.arolla;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

    // A year is not a leap year if not divisible by 4
    // A year is a leap year if divisible by 4
    // A year is a leap year if divisible by 400 -> 400, 800, 1200, 1600, 2000
    // A year is not a leap year if divisible by 100 but not by 400 -> 1700, 1800, 1900


public class LeapYearTest {

    @ParameterizedTest
    @CsvSource({
            "1997, false",
            "1996, true",
            "2000, true",
            "400, true",
            "800, true",
            "1200, true",
            "1600, true",
            "1700, false",
            "1800, false",
            "1900, false",
    })
    void should_return_correct_check_for_given_year(int year, boolean output) {
        //Given
        NewYear newYear = new NewYear(year);

        //When
        boolean actual = newYear.isLeapYear();

        //Then
        Assertions.assertThat(actual).isEqualTo(output);
    }
}
