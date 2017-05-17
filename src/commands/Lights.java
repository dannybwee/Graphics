package commands;

import javax.swing.*;

import a4.Code;

import java.awt.event.ActionEvent;

/**
 * Created by Daniel Bui
 */
public class Lights extends AbstractAction {
    private static Lights ourInstance = new Lights();
    private Code target;

    private Lights() {
        super("Toggle World Axes");
    }

    public static Lights getInstance() {
        return ourInstance;
    }

    public void setTarget(Code target) {
        this.target = target;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        target.toggleLights();
    }
}
