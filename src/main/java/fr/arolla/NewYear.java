package fr.arolla;

public class NewYear {
    private final int year;

    public NewYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        return isDivisibleBy4();
    }

    private boolean isDivisibleBy4() {
        return year % 4 == 0;
    }
}
