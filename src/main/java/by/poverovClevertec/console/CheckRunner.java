package by.poverovClevertec.console;

public class CheckRunner {

    public static void main(String[] args) {

        if (args[0].equals("--f")) {
            Check check = new Check(args[1]);
            check.printToFile(args[2]);
            System.out.println("File is written");
        } else {
            Check check = new Check(args);
            for (String s : check.printToStringList()) {
                System.out.println(s);
            }
        }
    }
}
