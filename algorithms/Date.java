package algorithms;

/**
 * Created by Liam on 06/04/2017.
 */
public class Date implements Comparable<Date> {
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
        if(!isValid(year, month, day)) throw new IllegalArgumentException("Invalid date");
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
        if(temp.length != 3) throw new IllegalArgumentException("Invalid date");
        this.month = Integer.parseInt(temp[0]);
        this.day   = Integer.parseInt(temp[1]);
        this.year  = Integer.parseInt(temp[2]);
        if(!isValid(year, month, day)) throw new IllegalArgumentException("Invalid date");
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
        if(day < 1 || day > DAYS[month]) return false;
        if(month == 2 && day == 29 && !isLeapYear(year)) return false;
        return true;
    }

    // is it a leap year?
    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 100 != 0 && year % 4 == 0;
    }

    /**
     *  Returns the next date in the calendar.
     *  @return a date that represents the next day after this day.
     */
    public Date next() {
        if(isValid(year, month, day + 1)) return new Date(year, month ,day + 1);
        else if(isValid(year, month + 1, 1)) return new Date(year, month + 1, 1);
        else return new Date(year + 1, 1, 1);
    }

    /**
     *  Compares two dates chronologically.
     *  @param other the other date.
     *  @return true if other precedes this day, false otherwise.
     */
    public boolean isBefore(Date other) {
        return compareTo(other) < 0;
    }

    /**
     *  Compares two dates chrnologically.
     *  @param other the other date.
     *  @return true if other date is later than this date.
     */
    public boolean isAfter(Date other) {
        return compareTo(other) > 0;
    }

    /**
     *  Compares two dates chronologically.
     *  @return the value 0 if the argument is equals to this date.
     *          a negative integer if the argument is after this date.
     *          a positive integer if the argument is before this date.
     */
    @Override
    public int compareTo(Date other) {
      if(this.year > other.getYear()) return 1;
      if(this.year < other.getYear()) return -1;
      if(this.month > other.getMonth()) return 1;
      if(this.month < other.getMonth()) return -1;
      if(this.day > other.getDay()) return 1;
      if(this.day < other.getDay()) return -1;
      return 0;
    }

    /**
     *  Return the string format of this date.
     *  @return a string representing this date.
     */
    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }

    /**
     *  Returns an Integer hash code for this date.
     *  @return an integer hash code for this date.
     */
    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + month;
        hash = 31 * hash + day;
        hash = 31 * hash + year;
        return hash;
    }

    /**
     *  Unit tests for the Date data type.
     *  @param args the command-line arguments
     */
    public static void main(String[] args) {
        Date today = new Date(2017, 2, 28);
        System.out.println(today);

        for(int i = 0; i < 10; i++) {
            today = today.next();
            System.out.println(today);
        }
        System.out.println(today.isAfter(today.next()));
        System.out.println(today.isBefore(today));
        System.out.println(today.next().isAfter(today));
    }
}