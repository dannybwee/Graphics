package commands;

import a4.Code;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Daniel Bui
 */
public class WorldAxes extends AbstractAction {
    private static WorldAxes ourInstance = new WorldAxes();
    private Code target;

    private WorldAxes() {
        super("Toggle World Axes");
    }

    public static WorldAxes getInstance() {
        return ourInstance;
    }

    public void setTarget(Code target) {
        this.target = target;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        target.toggleLines();
    }
}
