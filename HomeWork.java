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
        int[] rightQuesion = {1, 2, 2, 0, 3};

        int result = 0;
        for(int i = 0; i < quiz.length; i++){
            System.out.println(i+1 + ". " + quiz[i]);
            for (int j = 0; j < answerOptions.length - 1; j++) {
                System.out.println(j+1 + ". " + answerOptions[i][j]);
            }
//                for (String option: answerOptions[i]){
//                    System.out.println(i+1 + ". " + option);
//                }
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
                if(answer > 0 && answer <= rightQuesion.length + 1 ){
                    if (rightQuesion[i] == answer - 1){
                        result++;
                    }
                    break;
                } else System.out.println("ответ не прошел валидацию");
            }
        }
        System.out.println("резуьтат " + result + " из 5");
    }
}