package AutomateJavaThings;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;

public class RobotMouseMovementAwake {

  public static void main(String[] args) throws AWTException {
    Robot robot = new Robot();

    Random random = new Random();

    while (true){
      robot.delay(5000);
      int x = random.ints(0,1366).findFirst().getAsInt();
      int y = random.ints(0,700).findFirst().getAsInt();

      robot.mouseMove(x,y);
      System.out.println(x +"*"+ y);
    }
  }
}
