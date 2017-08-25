package MyGame;
import java.awt.*;
import javax.swing.*;
import javax.sound.midi.*;
import java.lang.reflect.Array;
import java.util.*;
import java.awt.event.*;

public class FillWord {
    JPanel mainPanel;
    JFrame theFrame;
    ArrayList<Integer> tempWord = new ArrayList<>();

    public void go() {
        theFrame = new JFrame("FillWord by CoolTeam");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel background = new JPanel(new BorderLayout());
        background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        ArrayList<String> words = new ArrayList<>();
        words.add("1271213"); //арбуз
        words.add("6111617"); //море
        words.add("18232221"); //пляж
        words.add("91419202524"); //остров
        words.add("83451015"); // отпуск
        /*Box nameBox = new Box(BoxLayout.Y_AXIS);
        //здесь идет добавление элементов в список слева
        nameBox.add(new Label("1 simple word"));
        nameBox.add(new Label("2 simple word"));
        //
        background.add(BorderLayout.WEST, nameBox)*/;
        theFrame.getContentPane().add(background);
        background.add(BorderLayout.NORTH, new JLabel("Тема: Лето"));

        GridLayout grid = new GridLayout(5,5);
        grid.setHgap(1);
        grid.setVgap(1);

        mainPanel = new JPanel(grid);
        mainPanel.setBackground(Color.BLUE);
        background.add(BorderLayout.CENTER, mainPanel);

        //создание поля и сразу добавление слушателей к кнопкам
        MouseListener mL = new Listener();

        JButton button1 = new JButton("А");
        button1.addMouseListener(mL);
        mainPanel.add(button1);

        JButton button2 = new JButton("Р");
        button2.addMouseListener(mL);
        mainPanel.add(button2);

        JButton button3 = new JButton("Т");
        button3.addMouseListener(mL);
        mainPanel.add(button3);

        JButton button4 = new JButton("П");
        button4.addMouseListener(mL);
        mainPanel.add(button4);

        JButton button5 = new JButton("У");
        button5.addMouseListener(mL);
        mainPanel.add(button5);

        JButton button6 = new JButton("М");
        button6.addMouseListener(mL);
        mainPanel.add(button6);

        JButton button7 = new JButton("Б");
        button7.addMouseListener(mL);
        mainPanel.add(button7);

        JButton button8 = new JButton("О");
        button8.addMouseListener(mL);
        mainPanel.add(button8);

        JButton button9 = new JButton("О");
        button9.addMouseListener(mL);
        mainPanel.add(button9);

        JButton button10 = new JButton("С");
        button10.addMouseListener(mL);
        mainPanel.add(button10);

        JButton button11 = new JButton("О");
        button11.addMouseListener(mL);
        mainPanel.add(button11);

        JButton button12 = new JButton("У");
        button12.addMouseListener(mL);
        mainPanel.add(button12);

        JButton button13 = new JButton("З");
        button13.addMouseListener(mL);
        mainPanel.add(button13);

        JButton button14 = new JButton("С");
        button14.addMouseListener(mL);
        mainPanel.add(button14);

        JButton button15 = new JButton("К");
        button15.addMouseListener(mL);
        mainPanel.add(button15);

        JButton button16 = new JButton("Р");
        button16.addMouseListener(mL);
        mainPanel.add(button16);

        JButton button17 = new JButton("Е");
        button17.addMouseListener(mL);
        mainPanel.add(button17);

        JButton button18 = new JButton("П");
        button18.addMouseListener(mL);
        mainPanel.add(button18);

        JButton button19 = new JButton("Т");
        button19.addMouseListener(mL);
        mainPanel.add(button19);

        JButton button20 = new JButton("Р");
        button20.addMouseListener(mL);
        mainPanel.add(button20);

        JButton button21 = new JButton("Ж");
        button21.addMouseListener(mL);
        mainPanel.add(button21);

        JButton button22 = new JButton("Я");
        button22.addMouseListener(mL);
        mainPanel.add(button22);

        JButton button23 = new JButton("Л");
        button23.addMouseListener(mL);
        mainPanel.add(button23);

        JButton button24 = new JButton("В");
        button24.addMouseListener(mL);
        mainPanel.add(button24);

        JButton button25 = new JButton("О");
        button25.addMouseListener(mL);
        mainPanel.add(button25);


        button1.setBackground(Color.CYAN);
        //создание поля окончено



        //как правильно реализовать слушателя?
        //есть два варианта:
        // 1 - сделать одного слушателя и придумать, как он будет реальзовывать возврат результата - тяжеловато реализовать
        //2 - сделать соответственно столько слушателей, сколько и самих кнопок. - огромный расход лишней памяти
        //
        //
        //как сделать drag&drop?
        //Изначально я подумал про MouseListener, но что-то не прокатило

        //Как сверять набранный результат с существующими словами
        //
        //

        theFrame.setResizable(false);
        theFrame.pack();
        theFrame.setVisible(true);
    }
    class Listener implements MouseListener {
        public void mouseEntered(MouseEvent e) {
            //курсор мыши вошел в область наблюдаемого объекта

        }
        public void mouseClicked(MouseEvent e) {
            //выполнен щелчок мышкой на наблюдаеом объекте
            int k = 0;
            for (int i = 0; i < 25; i++) {
                if (e.getSource().equals("button" + i))
                    k = i;
            }

            tempWord.add(k);
        }

        public void mouseExited(MouseEvent e) {
            //курсор мыши вышел из области наблюдаемого объекта
            System.out.println("mouseExited");

        }

        public void mousePressed(MouseEvent e) {
            //кнопка мышши нажата в момент, когда курсор
            //находится над наблюдаемым объектом
            int k = 0;
            for (int i = 0; i < 25; i++) {
                if (e.getSource().equals("button" + i))
                    k = i;
            }
           // e.getSource().notify();
            tempWord.add(k);
        }

        public void mouseReleased(MouseEvent e) {
            //кнопка мыши отпущена в момент, когда курсор
            //находится над наблюдаемым объектом
            System.out.println("отпущена");
            tempWord.clear();

            //
            //Попробовать через MVP // Presenter - model - view
            //
            //
        }
    }
}
