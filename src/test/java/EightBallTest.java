import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EightBallTest {

    EightBall eightBall;

    @Before

    public void before(){
        eightBall = new EightBall();
    }

    @Test
    public void canAddAnswer(){
        eightBall.addAnswer("Run for the hills.");
        assertEquals(1, eightBall.getAnswerCount());
    }

    @Test
    public void getAnyAnswer(){
        eightBall.addAnswer("Run for the hills.");
        eightBall.addAnswer("Say 'yes'.");
        eightBall.addAnswer("Say 'no'.");
        eightBall.addAnswer("Get in.");
        assertNotNull(eightBall.getRandomAnswer());
    }
}
