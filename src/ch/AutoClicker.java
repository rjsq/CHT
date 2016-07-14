/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

/**
 *
 * @author Yin Liu
 */
public class AutoClicker {

    public static int rate = 0;
  

    public static void Click(int input) {
        rate = input;
        try {

            Robot robot = new Robot();
            while (true) {
                try {
                    Thread.sleep(rate);
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);

                } catch (InterruptedException ex) {
                }
            }
        } catch (AWTException e) {
        }
    }

}
