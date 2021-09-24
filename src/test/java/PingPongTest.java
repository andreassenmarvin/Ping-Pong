import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class PingPongTest {

    @Test
    public void runPingPong_countUpToOne_ArrayList() {
        PingPong testPingPong = new PingPong();
        ArrayList<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        assertEquals(expectedOutput, testPingPong.runPingPong(1));
    }

    @Test
    public void runPingPong_countUpToGivenNumber_ArrayList() throws Exception {
        PingPong testPingPong = new PingPong();
        ArrayList<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        expectedOutput.add(2);
        assertEquals(expectedOutput, testPingPong.runPingPong(2));
    }

    @Test
    public void runPingPong_replaceMultiplesOf3_ArrayList() {
        PingPong testPingPong = new PingPong();
        ArrayList<Object> expectedOutPut = new ArrayList<Object>();
        expectedOutPut.add(1);
        expectedOutPut.add(2);
        expectedOutPut.add("Ping");
        assertEquals(expectedOutPut ,testPingPong.runPingPong(3));
    }
}