package sourses;

import java.util.Random;

public class Configuration {

    public String readFile(){
        Random random = new Random();
        if(random.nextInt(2) + 1 == 1){
            throw new RuntimeException();
        }
        return "конфигурация из файла";
    }
}
