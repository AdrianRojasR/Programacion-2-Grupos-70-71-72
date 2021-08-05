/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiFormulario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author danie
 */
public class Formulario extends JFrame implements ActionListener,ChangeListener {
    
   private JLabel lPesos,lDolares, lresolucion ;
   private JTextField tPesos, tDolares;
   private JButton boton1, boton2;
   private JRadioButton radio1, radio2;
   private ButtonGroup bg;
   
   
   
   public Formulario(){
       setLayout(null);
       lPesos = new JLabel("Pesos");
       lPesos.setBounds(10, 20, 100, 30);
       add(lPesos);
       
       lDolares = new JLabel("Dolares");
       lDolares.setBounds(10, 60, 100, 30);
       add(lDolares);
       
       lresolucion = new JLabel("Resolución");
       lresolucion.setBounds(20, 140, 100, 30);
       add(lresolucion);
      
       tPesos = new JTextField();
       tPesos.setBounds(110, 20, 150, 30);
       add(tPesos);
               
       tDolares = new JTextField();
       tDolares.setBounds(110, 60, 150, 30);
       add(tDolares);
       
       boton2 = new JButton("Convertir");
       boton2.setBounds(180, 100, 100,30);
       add(boton2);
       boton2.addActionListener((ActionListener) this);
       bg= new ButtonGroup();
       
       boton1 = new JButton("cerrar");
       boton1.setBounds(180, 240, 100,30);
       add(boton1);
       boton1.addActionListener((ActionListener) this);
       bg= new ButtonGroup();
       
       radio1 = new JRadioButton("640*480");
       radio1.setBounds(60, 160, 100, 30);
       radio1.addChangeListener(this);
       add(radio1);
       bg.add(radio1);
       
       radio2 = new JRadioButton("800*680");
       radio2.setBounds(60,210, 100, 30);
       radio2.addChangeListener(this);
       add(radio2);
       bg.add(radio2);
   }
   
       @Override
    public void stateChanged(ChangeEvent e) {
        if (radio1.isSelected()){
            setSize(640, 480);
        }
        if (radio2.isSelected()){
            setSize(800, 680);
        }
        
    }
    
       @Override
    public void actionPerformed(ActionEvent e) {
      
      if(e.getSource() == boton1){
        System.exit(0);
       }
       if(e.getSource() == boton2){
        double pesos = Double.valueOf(tPesos.getText());
        double dolares = pesos/3500;
        tDolares.setText(String.valueOf(dolares));
       }
    }
 
   
   public static void main(String[] arg){
   Formulario form= new Formulario();
   form.setBounds(10, 10, 400, 400);
   form.setVisible(true);
   form.setDefaultCloseOperation(EXIT_ON_CLOSE);
   
   
   }




   
    
}
