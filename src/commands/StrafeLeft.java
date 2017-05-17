package commands;

import objects.Camera;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Daniel Bui
 */
public class StrafeLeft extends AbstractAction {
    private static StrafeLeft ourInstance = new StrafeLeft();
    private Camera c;

    private StrafeLeft() {
        super("Strafe Left");
    }

    public static StrafeLeft getInstance() {
        return ourInstance;
    }

    public void setCamera(Camera c) {
        this.c = c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        c.movex(-.25);
    }
}
