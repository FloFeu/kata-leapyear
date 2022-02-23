package fr.arolla;

public class NewYear {
    private final int year;

    public NewYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        if (isDivisibleBy100() && isNotDivisibleBy400()) {
            return false;
        }

        return isDivisibleBy4();
    }

    private boolean isDivisibleBy4() {
        return year % 4 == 0;
    }

    private boolean isDivisibleBy100() {
        return year % 100 == 0;
    }

    private boolean isNotDivisibleBy400() {
        return year % 400 != 0;
    }
}
