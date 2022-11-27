package AutomateJavaThings;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RobotKeyboard {

  public static void main(String[] args) throws IOException, AWTException {

    int keyInput[] = {
        KeyEvent.VK_W,
        KeyEvent.VK_E,
        KeyEvent.VK_L,
        KeyEvent.VK_C,
        KeyEvent.VK_O,
        KeyEvent.VK_M,
        KeyEvent.VK_E
    };
    Runtime.getRuntime().exec("notepad");

    Robot robot = new Robot();
//    robot.keyPress(KeyEvent.VK_SHIFT);
      for(int i = 0 ; i <keyInput.length ; i++){
        robot.keyPress(keyInput[i]);
        robot.keyRelease(keyInput[i]);
      }

      robot.keyPress(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_S);
    robot.keyRelease(KeyEvent.VK_S);
    robot.keyRelease(KeyEvent.VK_CONTROL);

    robot.keyPress(KeyEvent.VK_L);
    robot.keyRelease(KeyEvent.VK_L);

    robot.keyPress(10);
  }
}
