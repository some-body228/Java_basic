package ru.otus;

import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import ru.otus.game.*;
import org.junit.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TestGame {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Mock
    DiceImpl dice;

    @Mock
    GameWinnerConsolePrinter printer;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public  void playGameTest() {
        Mockito.when(dice.roll()).thenReturn(2).thenReturn(3);
        Player firstPlayer = new Player("first");
        Player secondPlayer = new Player("second");
        Game game = new Game(dice, printer);

        game.playGame(firstPlayer, secondPlayer);

        ArgumentCaptor<Player> argument = ArgumentCaptor.forClass(Player.class);
        Mockito.verify(printer).printWinner(argument.capture());
        assertEquals(secondPlayer, argument.getValue());
    }

    @Test
    public  void playGame2Test() {
        Mockito.when(dice.roll()).thenReturn(3).thenReturn(2);
        Player firstPlayer = new Player("first");
        Player secondPlayer = new Player("second");
        Game game = new Game(dice, printer);

        game.playGame(firstPlayer, secondPlayer);

        ArgumentCaptor<Player> argument = ArgumentCaptor.forClass(Player.class);
        Mockito.verify(printer).printWinner(argument.capture());
        assertEquals(firstPlayer, argument.getValue());
    }

    @Test
    public  void playGame3Test() {
        Mockito.when(dice.roll()).thenReturn(3).thenReturn(3);
        Player firstPlayer = new Player("first");
        Player secondPlayer = new Player("second");
        Game game = new Game(dice, printer);

        game.playGame(firstPlayer, secondPlayer);
        ArgumentCaptor<Player> argument = ArgumentCaptor.forClass(Player.class);
        Mockito.verify(printer).printWinner(argument.capture());
        assertNull(argument.getValue());
    }

    @Test
    public void diceImplTest() {
        DiceImpl diceImpl = new DiceImpl();
        int result = diceImpl.roll();
        assertTrue(result >= 1);
        assertTrue(result <= 6);
    }
}
