public class Game {
    private int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {

        this.rolls[currentRoll++] = pins;
    }

    public int score() {
        int roll = 0;
        int score =0;
        for (int frame = 0; frame < 10; frame++) {
            if (rolls[roll] + rolls[roll + 1] == 10) {

                score += 10 + rolls[roll + 2];
            }else {

                score += rolls[roll] + rolls[roll + 1];
            }
            roll += 2;
        }
        return score;
    }
}
