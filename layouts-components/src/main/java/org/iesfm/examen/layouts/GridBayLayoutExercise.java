package org.iesfm.examen.layouts;

import javax.swing.*;

public class GridBayLayoutExercise extends JPanel {


    public GridBayLayoutExercise() {
        // COMPLETA AQUÍ EL EJERCICIO AÑADIENDO A this
        // Recuerda que debes configurar el layout this.setLayout

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new GridBayLayoutExercise());
        frame.pack();
        frame.setVisible(true);
        frame.repaint();
        frame.revalidate();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
