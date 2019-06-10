import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BowlingGameShould {


    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void create_game() {
        assertNotNull(game);
    }

    @Test
    public void return_score_zero_for_a_gutter_game() {
        int rolls = 20;
        int pins = 0;
        rollMany(rolls, pins);
        assertEquals(0, game.score());
    }


    @Test
    public void return_score_20_for_all_ones() {
        rollMany(20, 1);
        assertEquals(20, game.score());
    }

    @Test
    public void return_score_16_for_a_spare() {
        game.roll(5);
        game.roll(5); // spare
        game.roll(3);

        rollMany(17, 0);
        assertEquals(16, game.score());
    }

    private void rollMany(int rolls, int pins) {
        for (int i = 0; i < rolls; i++) {
            game.roll(pins);

        }
    }
}
