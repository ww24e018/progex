package at.technikum.Session2;

import java.util.Scanner;

public class DateFormatConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter date (yyyymmdd)");
        int ymd = sc.nextInt();
        if ((ymd < 15821016) || (ymd > 21001231)) {
            System.out.println("invalid date");
            return;
        }
        int year = ymd / 10000;
        int month = (ymd % 10000) / 100; // alt?: (ymd / 100) % 100 ? ; das wär: zuerst an die richtige stelle "rutschen", dann den vorderteil entfernen?
        int day = (ymd % 100) ;
        System.out.printf("%02d.%02d.%4d\n", day, month, year);
    }
}
