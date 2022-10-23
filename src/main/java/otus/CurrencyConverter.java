package otus;

import otus.currency.Rubls;
import otus.impl.Converter;

public class CurrencyConverter {

    public static void main(String[] args) {
        Converter converter = new Converter(new Rubls());
        converter.convert();
    }

}
