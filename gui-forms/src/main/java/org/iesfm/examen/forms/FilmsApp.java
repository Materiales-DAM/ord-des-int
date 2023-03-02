package org.iesfm.examen.forms;

import javax.swing.*;
import java.util.List;

public class FilmsApp {
    public JPanel mainPanel;
    private JTable filmsTable;
    private JButton addButton;
    private JButton deleteButton;

    public FilmsApp() {

        List<Film> films = List.of(
                new Film("As Bestas", "Thriller", 2022),
                new Film("Un funeral de muerte", "Comedia", 2011 ),
                new Film("Mar adentro", "Drama", 2012),
                new Film("El secreto de sus ojos", "Thriller", 2010)
        );

        // TODO configura aquí la tabla


        // TODO configura aquí la navegación desde el botón de añadir

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        FilmsApp myForm = new FilmsApp();
        frame.setContentPane(myForm.mainPanel);
        frame.pack();
        frame.setVisible(true);
        frame.repaint();
        frame.revalidate();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
