package commands;

import objects.Camera;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * 
 * Created by Daniel Bui 
 * 
 **/

public class PanRight extends AbstractAction {
    private static PanRight ourInstance = new PanRight();
    private Camera c;

    private PanRight() {
        super("Pan Right");
    }

    public static PanRight getInstance() {
        return ourInstance;
    }

    public void setCamera(Camera c) {
        this.c = c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        c.pan(.25);
    }
}
