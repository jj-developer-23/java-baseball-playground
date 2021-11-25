package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {
    Balls com;

    @BeforeEach
    void setUp() {
        com = new Balls(Arrays.asList(1, 2, 3));
    }

    @Test
    void ball() {
        assertThat(com.compare(new Ball(1, 3))).isEqualTo(BallStatus.BALL);
    }

    @Test
    void strike() {
        assertThat(com.compare(new Ball(1, 1))).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void nothing() {
        assertThat(com.compare(new Ball(1, 8))).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void strike_3_ball_0() {
        PlayResult result = com.playGame(Arrays.asList(1, 2, 3));
        assertThat(result.getStrike()).isEqualTo(3);
        assertThat(result.getBall()).isEqualTo(0);
    }

    @Test
    void strike_1_ball_1() {
        PlayResult result = com.playGame(Arrays.asList(1, 3, 8));
        assertThat(result.getStrike()).isEqualTo(1);
        assertThat(result.getBall()).isEqualTo(1);
    }

    @Test
    void strike_0_ball_3() {
        PlayResult result = com.playGame(Arrays.asList(2, 3, 1));
        assertThat(result.getStrike()).isEqualTo(0);
        assertThat(result.getBall()).isEqualTo(3);
    }

    @Test
    void strike_0_ball_0() {
        PlayResult result = com.playGame(Arrays.asList(4, 5, 6));
        assertThat(result.getStrike()).isEqualTo(0);
        assertThat(result.getBall()).isEqualTo(0);
    }
}
