package commands;

import objects.Camera;
import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * 
 * Created by Daniel Bui - CSC 155
 * 
 **/


public class PanLeft extends AbstractAction {
    private static PanLeft ourInstance = new PanLeft();
    private Camera c;

    private PanLeft() {
        super("Pan Left");
    }

    public static PanLeft getInstance() {
        return ourInstance;
    }

    public void setCamera(Camera c) {
        this.c = c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        c.pan(-.25);
    }
}

