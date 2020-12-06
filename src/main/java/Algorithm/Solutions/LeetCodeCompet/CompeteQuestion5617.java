package Algorithm.Solutions.LeetCodeCompet;

public class CompeteQuestion5617 {

    public String interpret(String command) {
        command = command.replaceAll("\\(\\)", "o");
        command = command.replaceAll("\\(al\\)", "al");
        return command;
    }

}
