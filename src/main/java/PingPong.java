import java.util.ArrayList;

public class PingPong {

    public ArrayList<Object> runPingPong(int countUpTo){
        ArrayList<Object> result = new ArrayList<Object>();
        for (int i = 1; i <= countUpTo; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                result.add("PingPong");
            }
            else if(i % 5 == 0) {
                result.add("Pong");
            }
            else if(i % 3 == 0) {
                result.add("Ping");
            }
            else {
                result.add(i);
            }
        }
        return result;
    }
}