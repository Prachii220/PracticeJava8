package LambdaExpression_Examples;

//https://www.youtube.com/watch?v=tCwg16PUZyo&t=234s

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {

    public static void main(String[] args) {

        //window: Object of JFrame
        JFrame frame = new JFrame(" MyWindow");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());



        //create button
        JButton button = new JButton("CLick me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Click me ");
                JOptionPane.showMessageDialog(null, "Hey , I'm button");
            }
        });
        frame.add(button);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }
}
