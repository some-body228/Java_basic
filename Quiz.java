import java.util.Scanner;

public class Quiz {
    private Questions questions;
    private final Scanner sc = new Scanner(System.in);

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    public boolean checkQuiz(){
        if(questions == null) return false;
        return questions.getQuestions().length == questions.getRightQuestion().length &&
                questions.getQuestions().length == questions.getAnswerOptions().length;
    }
    public String executeQuiz(){
        String[] quiz = questions.getQuestions();
        String[][] answerOptions = questions.getAnswerOptions();
        int[] rightQuestion = questions.getRightQuestion();
        if (checkQuiz()){
            int result = 0;
            for(int i = 0; i < quiz.length; i++){
                System.out.println(i+1 + ". " + quiz[i]);
                for (int j = 0; j < answerOptions.length - 1; j++) {
                    System.out.println(j+1 + ". " + answerOptions[i][j]);
                }
                while (true){
                    System.out.println("Ваш ответ:");
                    int answer = 0;
                    while (sc.hasNext()){
                        if(sc.hasNextInt()){
                            answer = sc.nextInt();
                            break;
                        } else {
                            System.out.println("ответ не прошел валидацию");
                            sc.next();
                        }
                    }
                    if(answer > 0 && answer <= answerOptions[i].length){
                        if (rightQuestion[i] == answer - 1){
                            result++;
                        }
                        break;
                    } else System.out.println("ответ не прошел валидацию");
                }
            }
            System.out.println("резуьтат " + result + " из 5");
            return "опрос проведен";
        } else return "вопросы не корректны";
    }
}
