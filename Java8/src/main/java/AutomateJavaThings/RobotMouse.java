package AutomateJavaThings;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RobotMouse {

  public static void main(String[] args) throws AWTException, IOException {
    Robot robot = new Robot();

    Runtime.getRuntime().exec("cmd /c start control");

    robot.delay(2000);
    robot.keyPress(KeyEvent.VK_ALT);
    robot.keyPress(KeyEvent.VK_SPACE);
    robot.keyRelease(KeyEvent.VK_ALT);
    robot.keyRelease(KeyEvent.VK_SPACE);
    robot.keyPress(KeyEvent.VK_X);
    robot.keyRelease(KeyEvent.VK_X);

    robot.delay(2000);
    robot.mouseMove(2000, 0);

    robot.delay(3000);
    robot.mousePress(InputEvent.BUTTON1_MASK);
    robot.delay(3000);

    robot.mouseRelease(InputEvent.BUTTON1_MASK);
    Runtime.getRuntime().exec("cmd /c start explorer");
    robot.delay(2000);
    Runtime.getRuntime().exec("cmd /c start chrome.exe");
    robot.delay(1000);
    robot.mouseMove(620,450);
    robot.delay(1000);
    robot.mousePress(InputEvent.BUTTON1_MASK);
    robot.delay(2000);
    robot.mouseRelease(InputEvent.BUTTON1_MASK);
    robot.delay(3000);
    robot.keyPress(KeyEvent.VK_G);
    robot.keyRelease(KeyEvent.VK_G);
    robot.keyPress(KeyEvent.VK_O);
    robot.keyRelease(KeyEvent.VK_O);
    robot.keyPress(KeyEvent.VK_O);
    robot.keyRelease(KeyEvent.VK_O);
    robot.keyPress(KeyEvent.VK_G);
    robot.keyRelease(KeyEvent.VK_G);
    robot.keyPress(KeyEvent.VK_L);
    robot.keyRelease(KeyEvent.VK_L);
    robot.keyPress(KeyEvent.VK_E);
    robot.keyRelease(KeyEvent.VK_E);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);

    //run the jar file
    //@echo off
    //java -jar Name of file(RobotMouse.jar)
  }


}
