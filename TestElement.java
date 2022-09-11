import java.util.Scanner;

public class TestElement {
    private final Answer[] answers;
    private final Integer rightAnswerIndex;

    private final String question;

    private final UserInput userInput = new ConsoleUserInput();

    private final UserOutput userOutput = new ConsoleUserOutput();



    public TestElement(Answer[] answers, Integer rightAnswerIndex, String question) {
        this.answers = answers;
        this.rightAnswerIndex = rightAnswerIndex;
        this.question = question;
    }

    public boolean ask(){
        userOutput.print(question);
        for (int j = 0; j < answers.length; j++) {
            userOutput.print(j+1 + ". " + answers[j].showText());
        }
        int answer = userInput.read(0, answers.length);
        return answer == rightAnswerIndex - 1;
    }
}
