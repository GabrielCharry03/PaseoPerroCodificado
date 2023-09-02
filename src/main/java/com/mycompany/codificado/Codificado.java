/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.codificado;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author gabri
 */
public class Codificado extends JFrame implements ActionListener {

    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    JLabel l6;
    JLabel l7;
    JLabel l8;
    JLabel l9;
    JLabel l10;
    JLabel l11;
    JLabel l12;
    JLabel l13;
    JLabel l14;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;

    JButton b1;

    public static void main(String[] args) {
        Codificado obj = new Codificado();

    }

    public Codificado() {
        setSize(500, 500);
        setLayout(null);
        JPanel p1 = new JPanel();
        l1 = new JLabel("Tamaño grande");
        l2 = new JLabel("Tamaño mediano");
        l3 = new JLabel("Tamaño pequeño");
        l4 = new JLabel("Horas");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);
        l5 = new JLabel("Precio perro grande");
        l6 = new JLabel("Precio perro mediano");
        l7 = new JLabel("Precio perro pequeño");
        l8 = new JLabel("");
        l9 = new JLabel("");
        l10 = new JLabel("");
        l11 = new JLabel("Decuento");
        l12 = new JLabel("Total");
        l13 = new JLabel("");
        l14 = new JLabel("");

        b1 = new JButton("Calcular");
        // Tamaño perros
        l1.setBounds(100, 140, 100, 50);
        l2.setBounds(100, 100, 100, 50);
        l3.setBounds(100, 60, 100, 50);
        l4.setBounds(100, 20, 100, 50);
        //Precio Perro
        l5.setBounds(100, 250, 150, 50);
        l6.setBounds(100, 280, 150, 50);
        l7.setBounds(100, 310, 150, 50);
        l11.setBounds(100, 340, 150, 50);
        l12.setBounds(100, 370, 150, 50);

        // Precio valor perro
        l8.setBounds(300, 250, 150, 50);
        l9.setBounds(300, 280, 150, 50);
        l10.setBounds(300, 310, 150, 50);
        l13.setBounds(300, 340, 150, 50);
        l14.setBounds(300, 370, 150, 50);
        // Cantidad
        t1.setBounds(250, 155, 100, 25);
        t2.setBounds(250, 115, 100, 25);
        t3.setBounds(250, 75, 100, 25);
        t4.setBounds(250, 35, 100, 25);
        b1.setBounds(150, 200, 200, 50);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(l9);
        add(l10);
        add(l11);
        add(l12);
        add(l13);
        add(l14);

        b1.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();
        if (accion.equals("Calcular")) {
            int h = Integer.parseInt(t4.getText());
            int g = (Integer.parseInt(t1.getText()) * 10000 * h);
            int m = (Integer.parseInt(t2.getText()) * 5000 * h);
            int p = (Integer.parseInt(t3.getText()) * 3000 * h);
            int d = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText()) + Integer.parseInt(t3.getText());
            l8.setText("" + g);
            l9.setText("" + m);
            l10.setText("" + p);
            double total = g + m + p;
            if (d > 1) {
                double descuento = total * 0.1;
                double totald = total - descuento;
                l13.setText("" + descuento);
                l14.setText("" + totald);
            } else {
                l13.setText("0");
                l14.setText("" + total);
            }
        }

    }
}
