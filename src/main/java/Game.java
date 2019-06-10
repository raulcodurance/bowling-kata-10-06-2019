public class Game {
    private int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {

        this.rolls[currentRoll++] = pins;
    }

    public int score() {
        int i = 0;
        int score =0;
        for (int frame = 0; frame < 10; frame++) {
            if (rolls[i] + rolls[i + 1] == 10) {

                score += 10 + rolls[i + 2];
            }else {

                score += rolls[i] + rolls[i + 1];
            }
            i += 2;
        }
        return score;
    }
}
