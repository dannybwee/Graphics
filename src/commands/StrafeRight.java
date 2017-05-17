package commands;


import objects.Camera;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Daniel Bui
 */
public class StrafeRight extends AbstractAction {
    private static StrafeRight ourInstance = new StrafeRight();
    private Camera c;

    private StrafeRight() {
        super("Strafe Right");
    }

    public static StrafeRight getInstance() {
        return ourInstance;
    }

    public void setCamera(Camera c) {
        this.c = c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        c.movex(.25);
    }
}
