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
}
