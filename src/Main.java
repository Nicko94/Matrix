import javax.swing.*;

import Algebra.Point;
import Algebra.Vector;
import GUI.GUI;

public class Main {
    public static void main(String[] args) {
        //Point punto1 = new Point(2, 3, 4);
        //Algebra.Point punto2 = new Algebra.Point(3, 5, 7);
        //float distancia1 = Algebra.Distance.calculateDistance(punto1, punto2);
        //System.out.println("Distancia entre el punto A y el punto B: " + distancia1);
        //Vector v = new Vector(punto1);
        javax.swing.SwingUtilities.invokeLater(() -> {
           GUI gui = new GUI();
           gui.createAndShowGUI();
        });
    }
}