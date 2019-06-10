import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BowlingGameShould {


    @Test
    public void create_game() {

        Game game = new Game();
        assertNotNull(game);
    }

    @Test
    public void return_score_zero_for_a_gutter_game() {

        Game game = new Game();
        for(int i = 0; i<21; i++){
        game.roll(0);

        }
        assertEquals(0, game.score());
    }
}
