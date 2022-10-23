package otus.impl;
import otus.currency.Currency;

import java.util.Scanner;

public class Converter {
    private final Scanner sc = new Scanner(System.in);

    private final Currency currency;

    public Converter(Currency currency) {
        this.currency = currency;
    }

    public void convert() {

        while (true){
            System.out.println("число:");
            while(sc.hasNextInt()){
                if(sc.hasNextInt()){
                    Integer amount = sc.nextInt();
                    System.out.println(amount + " " + numberMapper(amount));
                    break;
                } else {
                    System.out.println("ответ не прошел валидацию");
                    sc.next();
                }
            }
        }
    }

    public String numberMapper(Integer number) {
        if(number >= 100) {
            return numberMapper(number % 100);
        }

        if(number == 0){
            return currency.getThirdType();
        }

        if(number == 1){
            return currency.getFirstType();
        }

        if(number < 5 ){
            return currency.getSecondType();
        }

        if(number <= 20){
            return currency.getThirdType();
        } else {
             return numberMapper(number % 10);
        }



    }
}
