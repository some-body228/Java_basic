package ru.otus;

import ru.otus.game.Dice;

public class DiceTestImpl implements Dice {

    int result;

    public DiceTestImpl(int result) {
        this.result = result;
    }

    @Override
    public int roll() {
        return result;
    }
}
