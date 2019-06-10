import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class BowlingGameShould {


    @Test
    public void create_game() {

        Game game = new Game();
        assertNotNull(game);
    }
}
