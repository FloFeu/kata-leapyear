package fr.arolla;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

    // A year is not a leap year if not divisible by 4
    // A year is a leap year if divisible by 4
    // A year is a leap year if divisible by 400
    // A year is not a leap year if divisible by 100 but not by 400

public class LeapYearTest {

    @ParameterizedTest
    @CsvSource({
            "1997, false",
            "1996, true",
            "2000, true"
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
