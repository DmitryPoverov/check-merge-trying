package ru.clevertec.console;

import java.io.IOException;

public class CheckRunner {

    public static void main(String[] args) throws IOException {

        if (args[0].equals("--f")) {
            String path = args[1];
            Check check = new Check(path);
            check.getCheckService().printToFile(args[2], check);
            System.out.println("File is written");
        } else if (args[0].equals("--s")) {
            Check check = new Check();
            String path = args[1];
            String contentOfFile = check.getCheckService().convertPathStringToTextString(path, "\r\n");
            String[] inputStrings = check.getCheckService().convertStringToArray(contentOfFile, "\r\n");
            check.getCheckService().checkData(inputStrings, args[2], check);
            check.getCheckService().printToConsoleFromFile(check);
        } else {
            Check check = new Check(args);
            for (String s : check.getCheckService().printToStringList(check)) {
                System.out.println(s);
            }
        }
    }
}
