package org.iesfm.examen.layouts;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ListenerExercise extends JPanel {

    private JComboBox<String> leftComboBox;
    private JButton addButton;
    private JList<Object> rightList;
    private DefaultListModel<Object> rightListModel;


    public ListenerExercise() {
        setBorder(new EmptyBorder(new Insets(10, 10, 10, 10)));
        add(getLeftComboBox());
        add(getAddButton());
        add(getRightList());
    }

    private JComboBox<String> getLeftComboBox() {
        if (leftComboBox == null) {
            leftComboBox = new JComboBox<>();
            leftComboBox.addItem("Opción 1");
            leftComboBox.addItem("Opción 2");
            leftComboBox.addItem("Opción 3");
            leftComboBox.addItem("Opción 4");
        }
        return leftComboBox;
    }

    private JList<Object> getRightList() {
        if (rightList == null) {
            rightList = new JList<>();
            rightListModel = new DefaultListModel<>();
            rightList.setModel(rightListModel);
            rightList.setPreferredSize(new Dimension(100, 100));
        }
        return rightList;
    }

    private JButton getAddButton() {
        if (addButton == null) {
            addButton = new JButton("Añadir");
            addButton.setBackground(Color.lightGray);
            // TODO Programar aquí el/los listener del botón

        }
        return addButton;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setContentPane(new ListenerExercise());
        frame.pack();
        frame.setVisible(true);
        frame.repaint();
        frame.revalidate();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
