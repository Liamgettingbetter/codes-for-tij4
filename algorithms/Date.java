package algorithms;

/**
 * Created by Liam on 06/04/2017.
 */
public class Date {
    private static final int[] DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    private final int year;     // such as 2012
    private final int month;    // from 1 to 12
    private final int day;      // from 1 to 31(max), 29(min)

    /**
     *  Initializes a new date from the year, month, and day.
     *  @param year the year representing current year.
     *  @param month the month from 1 to 12.
     *  @param day the date from 1 to 30 or 31 or 29.
     *  @throws IllegalArgumentException if this date is invalid.
     */
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     *  Initializes a date from formatted string as MM/DD/YY.
     *  @param date the string format of date.
     *  @throws IllegalArgumentException if the date is invalid.
     */
    public Date(String date) {
        String[] temp = date.split("/");

        int month = Integer.parseInt(temp[0]);
        int day   = Integer.parseInt(temp[1]);
        int year  = Integer.parseInt(temp[2]);
    }

    /**
     *  Return the year.
     *  @return the year.
     */
    public int getYear() {
        return this.year;
    }

    /**
     *  Return the month.
     *  @return the month range from 1 to 12.
     */
    public int getMonth() {
        return this.month;
    }

    /**
     *  Return the day.
     *  @return the day.
     */
    public int getDay() {
        return this.day;
    }

    // is given date valid?
    private static boolean isValid(int year, int month, int day) {
        if(month < 1 || month > 12) return false;
        if(day < 1 || day != DAYS[month]) return false;
        if(month == 2 && day == 29 && !isLeapYear(year)) return false;
        return true;
    }

    // is it a leap year?
    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 100 != 0 && year % 4 == 0;
    }
}
