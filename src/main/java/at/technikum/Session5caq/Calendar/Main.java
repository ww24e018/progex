package at.technikum.Session5caq.Calendar;

import java.util.Date;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    /**** D O N T T O U C H T H I S ***/

    private static Scanner sc = new Scanner(System.in);
    private static final int SET_DATE = 0;
    private static final int IS_LEAP = 1;
    private static final int DAYS_IN_MONTH = 2;
    private static final int CHECK_DATE = 3;

    private static final int YMD_2_W = 7;
    private static final int DAY_NUMBER = 8;
    private static final int WEEK_NUMBER = 9;
//private static final int COMPARE = 10;

    //private static final int DAY_NAME = 13;
//private static final int PRINT_DAY = 14;
//private static final int DAY_SHORT_NAME = 15;
//private static final int PRINT_DAY_SHORT = 16;
//private static final int PRINT_MONTH = 17;
//private static final int PRINT_MONTH_SHORT = 18;
//private static final int PRINT_DATE = 19;
    private static final int PRINT_STATISTICS = 20;

    private static final int PRINT_CALENDAR_HIGHLIGHT = 21;
    private static final int PRINT_CALENDAR = 22;

    private static final int EXIT = 666;

    public static void main(String[] args) {

        // do testcases
        testcases();

        sc = new Scanner(System.in);
        int day = 1, month = 1, year = 1970;
        while (true) {

            int op;
            System.out.printf("current date: %02d.%02d.%04d\n", day, month, year);

            System.out.printf("enter option: ");

            op = sc.nextInt();

            switch (op) {
                case SET_DATE:
                    System.out.printf("day: ");

                    day = sc.nextInt();
                    System.out.printf("month: ");

                    month = sc.nextInt();
                    System.out.printf("year: ");

                    year = sc.nextInt();
                    break;
                /*------------------------- BASICS ----------------------*/
                case IS_LEAP:
                    System.out.printf("\nisLeap(year): %b\n", isLeap(year));
                    break;

                case DAYS_IN_MONTH:
                    System.out.printf("\ndaysInMonth(year, month): %d\n", daysInMonth(year, month));
                    break;

                case CHECK_DATE:
                    System.out.printf("\ncheckDate1(year): %b\n", checkDate(year));
                    System.out.printf("checkDate2(year, month): %b\n", checkDate(year, month));
                    System.out.printf("checkDate3(year, month, day): %b\n", checkDate(year, month, day));
                    break;

                /*------------------------- CALCULATIONS ----------------------*/
                case YMD_2_W: {
                    System.out.printf("\nymd2w(year, month, day): %d\n", ymd2w(year, month, day));
                    break;
                }
                case DAY_NUMBER:
                    System.out.printf("\ndayNumber(year, month, day): %d\n", dayNumber(year, month, day));
                    break;

                case WEEK_NUMBER:
                    System.out.printf("\nweekNumber(year, month, day): %d\n", weekNumber(year, month, day));
                    break;

                /*------------------------- OUTPUT ----------------------*/

                case PRINT_STATISTICS:
                    System.out.printf("\nprintStatistics: ");
                    printStatistics(year, month, day);

                    break;

                /*------------------------- APPLICATIONS ----------------------*/
                case PRINT_CALENDAR_HIGHLIGHT:
                    System.out.printf("\nprintCalendar(year, month, day, 1): \n");
                    printCalendar(year, month, day, true);

                    break;
                case PRINT_CALENDAR:
                    System.out.printf("\nprintCalendar(year, month, day, 0): \n");
                    printCalendar(year, month, day, false);

                    break;
                case EXIT:
                    System.out.printf("closing.\n");
                    sc.close();

                    return;

                default:
                    ;
            }
            System.out.printf("\n");
        }

    }

    // assume gregorian, assume WP is correct
    public static boolean isLeap(int year) {
        if (year%400 == 0) return true;
        if (year%100 == 0) return false;
        return year % 4 == 0;
    }
    // obsoleted later? or not
    public static boolean meIsGregorianPotentially(int y, int m, int d) {
        // if(y < 1582 || y > 2199) return false;
        long date_as_long_thingy = y* 10000L +m* 100L +d;
        if(date_as_long_thingy < 15821016 || date_as_long_thingy > 21991231) return false;
        return true;
    }
    // https://en.wikipedia.org/wiki/Gregorian_calendar
    public static final int[] daysInMonthHelperArray = {
        31,28,31, 30,31,30, 31,31,30, 31,30,31
    };
    public static int daysInMonth(int year, int month) {
        if (meIsGregorianPotentially(year,month,1) && checkDate(year,month)) {
            return (isLeap(year)&&month==2)
                    ?daysInMonthHelperArray[month-1]+1
                    :daysInMonthHelperArray[month-1]
                    ;
        } else {
            return -1;
        }
    }
    public static boolean checkDate(int year) {
        return year >= 1582 && year <= 2199;
    }
    public static boolean checkDate(int year, int month) {
        return checkDate(year) && month >=1 && month <= 12;
    }
    public static boolean checkDate(int year, int month, int day) {
        return checkDate(year, month)
                && day >= 1 && day <= daysInMonth(year,month)
                && meIsGregorianPotentially(year,month,day);
    }

    static final String[] weekdayIntToStringHelperArray = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    static final String[] weekdayIntToStringHelperArrayLong = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thurday", "Friday", "Saturday"};
    public static int ymd2w(int year, int month, int day) {
        // might do the "nested exercise" thing later. for now:
        java.util.Date d = new java.util.Date(year,month,day);
        //return weekdayIntToStringHelperArray[d.getDay()];
        return d.getDay();
        //return 0;
    }
    public static int dayNumber(int year, int month, int day) {
        int dayno = 0;
        for (int i = 1; i < month; i++) { // never done if month = 1, anm
            dayno += daysInMonth(year,i);
        }
        dayno += day;
        return dayno;
    }
    static int weekNumber(int year, int month, int day) {
        // angabe hier unterspezifiziert. was ist "woche" - so-bis-sa? mo-bis-so?
        /*int result = dayNumber(year,month,day);
        result = (
                    (dayNumber(year,month,day)+7-ymd2w(year,1,1))
                            /7);
        if (result == 53) result = 1;*/
        LocalDate mylocaldate = new LocalDate.of(year,month,day);

        //return result;
        return (int) (Math.random()*51);
    }
    public static void printDayName(int day) {
        if (day >= 0 && day <= 6) System.out.format(weekdayIntToStringHelperArray[day]);
    }
    public static void printDayNameLong(int day) {
        if (day >= 0 && day <= 6) System.out.format(weekdayIntToStringHelperArrayLong[day]);
    }
    static final String[] monthNameFromInt = {
            "January", "February", "March", "April", "May", "Juni",
            "July", "August", "September","October", "November", "December"
    };
    public static void printMonthName(int month) {
        System.out.format(monthNameFromInt[month-1]);
    }
    public static void printNmberEnding(int n) {
        if (n%10 == 1 && n != 11) {
            System.out.format("st"); return;
        }
        if (n%10 == 2 && n != 12) {
            System.out.format("nd"); return;
        }
        if (n%10 == 3 && n != 13) {
            System.out.format("rd"); return;
        }
        System.out.format("th");
    }
    public static void printDate(int year, int month, int day) {
        if (checkDate(year,month,day)) {
            System.out.format("invalid date (%d%d.%d", day,month,year);
        } else {
            /*System.out.format("%s, ", printDayNameLong(dayNumber(year,month,day));
            printMonthName(month);
            System.out.format(", %d%s", day, printNmberEnding(day))*/

        }
        return;
    }
    public static void printStatistics(int year, int month, int day) {
        return;
    }
    //public static void printCalendar(int year, int month, int day, int highlight) { // sig lt. angabe
    public static void printCalendar(int year, int month, int day, boolean highlight) {
        return;
    }

    public static void testcases() {
        if (dayNumber(2000,3,12) == 72) System.out.format("Test #1 passed\n");
        if (dayNumber(1583,1,1) == 1) System.out.format("Test #2 passed\n");
        if (weekNumber(2025,1,1) == 1) System.out.format("Test #3 passed\n");
        if (weekNumber(2025,1,6) == 2) System.out.format("Test #4 passed\n");
        if (weekNumber(2024,12,31) == 1) System.out.format("Test #5 passed\n");
        if (weekNumber(2024,12,29) == 52) System.out.format("Test #6 passed\n");
    }


}
