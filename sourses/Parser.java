package sourses;

import java.util.Random;

public class Parser {
    // парсер из внешней библиотеки
    public String parse(String config){
        Random random = new Random();
        if(random.nextInt(2) + 1 == 1){
            throw new RuntimeException();
        }
        return config + "!";
    }
}
