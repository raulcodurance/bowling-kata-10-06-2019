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

        for (int i = 0; i < 20; i++) {
            game.roll(0);

        }
        assertEquals(0, game.score());
    }

    @Test
    public void return_score_20_for_all_ones() {

        for (int i = 0; i < 20; i++) {
            game.roll(1);

        }
        assertEquals(20, game.score());
    }
}
