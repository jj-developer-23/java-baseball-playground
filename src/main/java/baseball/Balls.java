package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private static final int MAX_BALL_NUM = 3;
    private List<Ball> baseBall;

    public Balls(List<Integer> balls) {
        baseBall = mapBalls(balls);
    }

    private List<Ball> mapBalls(List<Integer> balls) {
         List<Ball> baseBall = new ArrayList<>();

         for(int i = 0; i < MAX_BALL_NUM; i++) {
             baseBall.add(new Ball(i + 1, balls.get(i)));
         }
        return baseBall;
    }

    public BallStatus compare(Ball userBall) {
        return baseBall.stream()
                .map(ball -> ball.play(userBall))
                .filter(status -> status != BallStatus.NOTHING)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

    public PlayResult playGame(Balls userBall) {
        PlayResult result = new PlayResult();
        for(Ball ball : baseBall) {
            BallStatus status = userBall.compare(ball);
            result.report(status);
        }
        return result;
    }
}
