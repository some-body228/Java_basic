package otus.currency;

public class Rubls implements Currency{

    private final String FIRST_TYPE = "рубль";
    private final String SECOND_TYPE = "рубля";
    private final String THIRD_TYPE = "рублей";

    @Override
    public String getFirstType() {
        return FIRST_TYPE;
    }

    @Override
    public String getSecondType() {
        return SECOND_TYPE;
    }

    @Override
    public String getThirdType() {
        return THIRD_TYPE;
    }
}
