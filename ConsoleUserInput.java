import java.util.Scanner;

public class ConsoleUserInput implements UserInput{

    private final Scanner sc = new Scanner(System.in);

    private final UserOutput userOutput = new ConsoleUserOutput();
    @Override
    public Integer read(int minValue, int maxValue) {
        int answer = -1;
        while (sc.hasNext()){
            if(sc.hasNextInt()){
                answer = sc.nextInt();
                if(answer > minValue && answer <= maxValue){
                    return answer;
                } else userOutput.print("ответ не прошел валидацию");
            } else {
                userOutput.print("ответ не прошел валидацию");
                sc.next();
            }
        }
        return answer;
    }
}
