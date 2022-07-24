import java.util.Base64;
import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] quiz = {"Правильный ответ 2",
                "Правильный ответ 3",
                "Правильный ответ 3",
                "Правильный ответ 1",
                "Правильный ответ 4"};
        String[][] answerOptions = {{"Не правильный ответ","Правильный ответ","Не правильный ответ","Не правильный ответ"},
                {"Не правильный ответ","Не правильный ответ","Правильный ответ","Не правильный ответ"},
                {"Не правильный ответ","Не правильный ответ","Правильный ответ","Не правильный ответ"},
                {"Правильный ответ","Не правильный ответ","Не правильный ответ","Не правильный ответ"},
                {"Не правильный ответ","Не правильный ответ","Правильный ответ","Не правильный ответ"}};
        Integer[] rightQuesion = {1, 2, 2, 0, 3};

        Integer result = 0;
        for(int i = 0; i < quiz.length; i++){
            System.out.println(i+1 + ". " + quiz[i]);
                for (String option: answerOptions[i]){
                    System.out.println(i+1 + ". " + option);
                }
            while (true){
                System.out.println("Ваш ответ:");
                Integer answer = sc.nextInt();
                if(answer > 0 && answer <= 4 ){
                    if (rightQuesion[i].equals(answer - 1)){
                        result++;
                    }
                    break;
                } else System.out.println("ответ не прошел валидацию");
            }
        }
        System.out.println("резуьтат " + result + " из 5");
    }
}