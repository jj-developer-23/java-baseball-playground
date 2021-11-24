package baseball;

public class PlayResult {
    private  int STRIKE_COUNT = 0;
    private  int BALL_COUNT = 0;

    public int getStrike() {
        return STRIKE_COUNT;
    }

    public int getBall() {
        return BALL_COUNT;
    }

    public void report(BallStatus status) {
        if(status == BallStatus.STRIKE) {
            STRIKE_COUNT++;
        }

        if(status == BallStatus.BALL) {
            BALL_COUNT++;
        }
    }
}
