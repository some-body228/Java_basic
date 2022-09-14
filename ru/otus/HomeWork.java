package ru.otus;


import ru.otus.game.*;

public class HomeWork {

    /*
        Заготовка для ДЗ представляет собой игру в кости.
        При вызове game.playGame(), два игрока кидают кости.
        Выигрывает игрок, у кого результат (1-6) больше

        Написать тесты (минимум 4) на классы DiceImpl и Game.
        Тесты должны найти не менее двух ошибок.

        Информацию о пройденном тесте предлагается выводить в System.out, а об упавшем в System.err
     */
    public static void main(String[] args) {
        diceImplTest();
    }

    public static void diceImplTest() {
        DiceImpl diceImpl = new DiceImpl();
        int result = diceImpl.roll();
        System.out.println(result);
        System.out.println(result <= 6);
        assert result <= 6;
        assert result >= 1;

    }
    
}