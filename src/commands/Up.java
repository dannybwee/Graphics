package commands;

import objects.Camera;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Daniel Bui
 */
public class Up extends AbstractAction {
    private static Up ourInstance = new Up();
    private Camera c;

    private Up() {
        super("Move up");
    }

    public static Up getInstance() {
        return ourInstance;
    }

    public void setCamera(Camera c) {
        this.c = c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        c.movey(.25);
    }
}
