import java.util.Scanner;

public class TestElement implements UserOutput,UserInput {
    private final Answer[] answers;
    private final Integer rightAnswerIndex;

    private final String question;

    private final Scanner sc = new Scanner(System.in);

    public TestElement(Answer[] answers, Integer rightAnswerIndex, String question) {
        this.answers = answers;
        this.rightAnswerIndex = rightAnswerIndex;
        this.question = question;
    }

    public boolean ask(){
        System.out.println(question);
        for (int j = 0; j < answers.length; j++) {
            System.out.println(j+1 + ". " + answers[j].showText());
        }
        int answer;
        boolean result = false;
        while (sc.hasNext()){
            if(sc.hasNextInt()){
                answer = read();
            } else {
                System.out.println("ответ не прошел валидацию");
                sc.next();
                continue;
            }
            if(answer > 0 && answer <= answers.length){
                result = rightAnswerIndex == answer - 1;
                break;
            } else System.out.println("ответ не прошел валидацию");
        }
        return result;
    }

    @Override
    public Integer read() {
        return sc.nextInt();
    }

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
