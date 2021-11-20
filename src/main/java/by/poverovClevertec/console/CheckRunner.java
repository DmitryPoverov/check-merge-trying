package by.poverovClevertec.console;

public class CheckRunner {

    public static void main(String[] args) {

        if (args[0].equals("--f")) {
            Check check = new Check(args[1]);
            check.printToFile(args[2]);
        } else {
            Check check = new Check(args);
            check.printToConsole();
        }


    }
}
