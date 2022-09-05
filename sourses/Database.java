package sourses;

import java.util.Random;

public class Database implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("DB closed");
    }
    public String getUserName(){
        Random random = new Random();
        if(random.nextInt(2) + 1 == 1){
            throw new RuntimeException();
        }
        return "вася";
    }

    public Integer getAge(){
        Random random = new Random();
        if(random.nextInt(2) + 1 == 1){
            throw new RuntimeException();
        }
        return 20;
    }
}
