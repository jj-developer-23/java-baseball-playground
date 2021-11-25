package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private static final int MAX_BALL_NO = 3;
    private final List<Ball> com;

    public Balls(List<Integer> answer) {
        com = new ArrayList<>();
        for(int i = 0; i < MAX_BALL_NO; i++) {
            com.add(new Ball(i + 1, answer.get(i)));
        }
    }

    public BallStatus compare(Ball playerBall) {
        return com.stream()
                .map(ball -> ball.compare(playerBall))
                .filter(status -> BallStatus.NOTHING != status)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }
}
