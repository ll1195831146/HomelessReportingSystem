/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
    import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;
/**
 *
 * @author linke
 */
public class MyJPanel extends JPanel {
        int index;
        ImageIcon[] imgs = {
                new ImageIcon("src/images/Homework8.png"),
                new ImageIcon("src/images/assignment3-desktop.png"),
            };
                @Override
            public void paint(Graphics g) {
                super.paint(g);
                g.drawImage(imgs[index%imgs.length].getImage(), 0, 0,this);
                index++;
            }
}
