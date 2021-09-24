import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Console myConsole = System.console();
        boolean programmeRunning = true;
        while (programmeRunning) {
            System.out.println("Welcome to ping-pong application!");
            System.out.println("What would you like to do: proceed or exit");
            String choice = myConsole.readLine();
            if(choice.equals("proceed")) {
                System.out.println("Enter a number");
                try {
                    String stringUserNumber = bufferedReader.readLine();
                    int intUserNumber = Integer.parseInt(stringUserNumber);
                    PingPong pingPong = new PingPong();
                    ArrayList<Object> pingPongResult = pingPong.runPingPong(intUserNumber);
                    System.out.println(pingPongResult);
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
            else if (choice.equals("exit")) {
                programmeRunning = false;
            }

        }
    }
}
