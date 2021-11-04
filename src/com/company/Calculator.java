package com.company;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private double mem1= 0;
    private double mem2= 0;
    private double mem3= 0;
    private JRadioButton func1;
   private JRadioButton func2;
    private JLabel result;



    public Calculator() {

        super("Calculator");

        ButtonGroup myButtons = new ButtonGroup();


        func1 = new JRadioButton("Первая функция", true);
        func2 = new JRadioButton("Вторая функция", false);
        myButtons.add(func1);
        myButtons.add(func2);

       result = new JLabel("Результат: " + result);
     //   GridLayout myLayout2 = new GridLayout(5, 4, 10, 5);



        //Подготавливаем временные компоненты
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        //Расставляем компоненты по местам
        buttonsPanel.add(result, BorderLayout.NORTH); //О размещении компонент поговорим позже

        buttonsPanel.add(func1);
        buttonsPanel.add(func2);

        add(buttonsPanel, BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }



}
