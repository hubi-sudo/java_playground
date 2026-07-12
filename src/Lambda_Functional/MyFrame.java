package Lambda_Functional;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {


    JButton myButton = new JButton("MY BUTTON");
    JButton myButton2 = new JButton("MY BUTTON2");
    MyFrame() {


        myButton.setBounds(250, 250, 200, 100);
        myButton.addActionListener(

            (e) -> System.out.println("You clicked the first button")
        );


        myButton2.setBounds(250, 450, 200, 100);
        myButton2.addActionListener(

                (e) -> System.out.println("You clicked the second button")
        );



        this.add(myButton);
        this.add(myButton2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(676,676);
        this.setLayout(null);
        this.setVisible(true);
    }
}
