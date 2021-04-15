package hw_09042021.timer_gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Start");

    public SimpleGUI() {
        super("Timer");
        this.setBounds(800, 400, 350, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));

        button.addActionListener(new ButtonEvent());
        container.add(button);
    }

    class ButtonEvent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Таймер запущен");
            while (true) {
                try {
                    Thread.sleep(10 * 1000);
                } catch (InterruptedException exc) {
                    exc.getMessage();
                }
                String message = "Прошло 10 секунд";
                JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
            }
        }

    }
}


