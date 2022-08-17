import java.util.Base64;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Questions questions = new Questions();
        questions.setQuestions(new String[]{"Правильный ответ 2",
                "Правильный ответ 3",
                "Правильный ответ 3",
                "Правильный ответ 1",
                "Правильный ответ 4"});

        questions.setAnswerOptions(new String[][]{{"Не правильный ответ","Правильный ответ","Не правильный ответ","Не правильный ответ"},
                {"Не правильный ответ","Не правильный ответ","Правильный ответ","Не правильный ответ"},
                {"Не правильный ответ","Не правильный ответ","Правильный ответ","Не правильный ответ"},
                {"Правильный ответ","Не правильный ответ","Не правильный ответ","Не правильный ответ"},
                {"Не правильный ответ","Не правильный ответ","Правильный ответ","Не правильный ответ"}});

        questions.setRightQuestion(new int[]{1, 2, 2, 0, 3});
        Quiz quiz = new Quiz();
        quiz.setQuestions(questions);
        System.out.println(quiz.executeQuiz());
    }
}