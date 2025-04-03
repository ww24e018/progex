package at.technikum.Session5caq.Calendar;

1 import java.util.Scanner;
2
3 public class Main {
4
5
6 /**** D O N T T O U C H T H I S ***/
7
8 private static Scanner sc = new Scanner(System.in);
9 private static final int SET_DATE = 0;
10 private static final int IS_LEAP = 1;
11 private static final int DAYS_IN_MONTH = 2;
12 private static final int CHECK_DATE = 3;
13
14 private static final int YMD_2_W = 7;
15 private static final int DAY_NUMBER = 8;
16 private static final int WEEK_NUMBER = 9;
17 //private static final int COMPARE = 10;
18
19 //private static final int DAY_NAME = 13;
20 //private static final int PRINT_DAY = 14;
21 //private static final int DAY_SHORT_NAME = 15;
22 //private static final int PRINT_DAY_SHORT = 16;
23 //private static final int PRINT_MONTH = 17;
24 //private static final int PRINT_MONTH_SHORT = 18;
25 //private static final int PRINT_DATE = 19;
26 private static final int PRINT_STATISTICS = 20;
27
28 private static final int PRINT_CALENDAR_HIGHLIGHT = 21;
29 private static final int PRINT_CALENDAR = 22;
30
31 private static final int EXIT = 666;
32
33 public static void main(String[] args) {
34
35 sc = new Scanner(System.in);
36 int day = 1, month = 1, year = 1970;
37 while (true) {
38
39 int op;
40 System.out.printf("current date: %02d.%02d.%04d\n", day, month, year);
41
42 System.out.printf("enter option: ");
43
44 op = sc.nextInt();
45
46 switch (op) {
47 case SET_DATE:
48 System.out.printf("day: ");
49
50 day = sc.nextInt();
51 System.out.printf("month: ");
52
53 month = sc.nextInt();
54 System.out.printf("year: ");
55
56 year = sc.nextInt();
57 break;
58 /*------------------------- BASICS ----------------------*/
59 case IS_LEAP:
60 System.out.printf("\nisLeap(year): %b\n", isLeap(year));
61 break;
62
63 case DAYS_IN_MONTH:
64 System.out.printf("\ndaysInMonth(year, month): %d\n", daysInMonth(year, month));
65 break;
66
67 case CHECK_DATE:
68 System.out.printf("\ncheckDate1(year): %b\n", checkDate(year));
69 System.out.printf("checkDate2(year, month): %b\n", checkDate(year, month));
70 System.out.printf("checkDate3(year, month, day): %b\n", checkDate(year, month, day));
71 break;
72
73 /*------------------------- CALCULATIONS ----------------------*/
74 case YMD_2_W: {
75 System.out.printf("\nymd2w(year, month, day): %d\n", ymd2w(year, month, day));
76 break;
77 }
78 case DAY_NUMBER:
79 System.out.printf("\ndayNumber(year, month, day): %d\n", dayNumber(year, month, day));
80 break;
81
82 case WEEK_NUMBER:
83 System.out.printf("\nweekNumber(year, month, day): %d\n", weekNumber(year, month, day));
84 break;
85
86 /*------------------------- OUTPUT ----------------------*/
87
88 case PRINT_STATISTICS:
89 System.out.printf("\nprintStatistics: ");
90 printStatistics(year, month, day);
91
92 break;
93
94 /*------------------------- APPLICATIONS ----------------------*/
95 case PRINT_CALENDAR_HIGHLIGHT:
96 System.out.printf("\nprintCalendar(year, month, day, 1): \n");
97 printCalendar(year, month, day, true);
98
99 break;
100 case PRINT_CALENDAR:
101 System.out.printf("\nprintCalendar(year, month, day, 0): \n");
102 printCalendar(year, month, day, false);
103
104 break;
105 case EXIT:
106 System.out.printf("closing.\n");
107 sc.close();
108
109 return;
110
111 default:
112 ;
113 }
114 System.out.printf("\n");
115 }
116
117
118 }
119 }