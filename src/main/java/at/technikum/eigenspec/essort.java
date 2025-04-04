package at.technikum.eigenspec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class essort {

    static String toolname = "essort"; // there is a way to read this methinks
    static String msg_help = "essort [options]\n"
            +"    essort (EigenSpec Sort) is a selfdefined (eigenspec) programming exercise for eww/2025 at technikum wien\n"
            +"\n"
            +"    Options: \n"
            +"        help               - prints a demotivational message\n"
            +"        --help             - prints this usage explainer\n"
            +"\n"
            +"    planned behaviour is: read lines from stdout; sort them (by various criteria); write them to stdout"
            ;

    public static void main(String[] args) {
        if (args.length != 0) {
            //System.out.format("%d\n", args.length);
            if (args[0].equals("help")) { printStdoutAndQuit("Help will not come. You are alone. All hope is lost. Also, try '--help'.");}
            else if (args[0].equals("--help")) printStdoutAndQuit(msg_help);
            else printStdoutAndQuit("???");
        } else {
            // parameterless behaviour
            List<String> myLines = readLines();
            writeLines(myLines);
        }
    }
    public static void printStdoutAndQuit(String msg) {
        System.out.println(msg);
    }

    public static List<String> readLines() {
        List<String> result = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            result.add(scanner.nextLine());
        }
        return result;
    }
    public static void writeLines(List<String> lines) {
        for(String line : lines) {
            System.out.println(line);
        }
    }

}
