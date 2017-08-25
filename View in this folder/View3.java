package MyGame;
import java.awt.*;
import javax.swing.*;
import javax.sound.midi.*;
import java.lang.reflect.Array;
import java.util.*;
import java.awt.event.*;

public class View3 {
    public JPanel mainPanel;
    JFrame theFrame;
    ArrayList<JButton> buttons = new ArrayList<>();

    MouseListener mL = new View3.Listener();

    JButton button1 = new JButton("А");
    JButton button2 = new JButton("Р");
    JButton button3 = new JButton("Т");
    JButton button4 = new JButton("У");
    JButton button5 = new JButton("П");
    JButton button6 = new JButton("М");
    JButton button7 = new JButton("К");
    JButton button8 = new JButton("Х");
    JButton button9 = new JButton("О");



    public void go() {
        theFrame = new JFrame("FillWord by CoolTeam");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel background = new JPanel(new BorderLayout());
        background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        theFrame.getContentPane().add(background);
        background.add(BorderLayout.NORTH, new JLabel("Тема: Лето"));

        GridLayout grid = new GridLayout(3,3);
        /*grid.setHgap(1);
        grid.setVgap(1);*/
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        buttons.add(button5);
        buttons.add(button6);
        buttons.add(button7);
        buttons.add(button8);
        buttons.add(button9);

        mainPanel = new JPanel(grid);
        mainPanel.setBackground(Color.BLUE);
        background.add(BorderLayout.CENTER, mainPanel);

        //создание поля и сразу добавление слушателей к кнопкам
        button1.addMouseListener(mL);
        mainPanel.add(button1);
        button2.addMouseListener(mL);
        mainPanel.add(button2);
        button3.addMouseListener(mL);
        mainPanel.add(button3);
        button4.addMouseListener(mL);
        mainPanel.add(button4);
        button5.addMouseListener(mL);
        mainPanel.add(button5);
        button6.addMouseListener(mL);
        mainPanel.add(button6);
        button7.addMouseListener(mL);
        mainPanel.add(button7);
        button8.addMouseListener(mL);
        mainPanel.add(button8);
        button9.addMouseListener(mL);
        mainPanel.add(button9);
        //создание поля окончено


        theFrame.setResizable(false);
        theFrame.pack();
        theFrame.setVisible(true);
    }

    class Listener implements MouseListener {
        public void mouseEntered(MouseEvent e) {
            //курсор мыши вошел в область наблюдаемого объекта
            JButton button = (JButton)e.getSource();
            button.setBackground(Color.GREEN);

        }
        public void mouseClicked(MouseEvent e) {
            //выполнен щелчок мышкой на наблюдаеом объекте
            JButton button = (JButton)e.getSource();
            button.setBackground(Color.CYAN);
        }

        public void mouseExited(MouseEvent e) {
            //курсор мыши вышел из области наблюдаемого объекта

        }

        public void mousePressed(MouseEvent e) {
            //кнопка мышши нажата в момент, когда курсор
            //находится над наблюдаемым объектом
            JButton button = (JButton)e.getSource();
            button.setBackground(Color.CYAN);


        }

        public void mouseReleased(MouseEvent e) {
            //кнопка мыши отпущена в момент, когда курсор
            //находится над наблюдаемым объектом

        }
    }
}
