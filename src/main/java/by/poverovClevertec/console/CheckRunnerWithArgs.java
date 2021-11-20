package by.poverovClevertec.console;

public class CheckRunnerWithArgs {

    public static void main(String[] args) {

        Check check = new Check(args);
        check.printToFile();
    }
}
