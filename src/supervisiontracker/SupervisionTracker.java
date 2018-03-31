
package supervisiontracker;

import GUI.SupervisionTrackerGUI;

/**
 *
 * @author Sergiu Borlovan <sergiuborlovan.co.uk>
 */
public class SupervisionTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SupervisionTrackerGUI gui = new SupervisionTrackerGUI();
        gui.pack();
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
    }
    
}
