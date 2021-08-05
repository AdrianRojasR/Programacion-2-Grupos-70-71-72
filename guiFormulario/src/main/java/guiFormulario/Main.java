
package guiFormulario;

import javax.swing.*;


public class Main   {

    
    public Main(){
        JFrame ventana = new JFrame("Mi Ventana");
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
        ventana.add(new JLabel(""));
         ventana.add(new JButton(""));
          ventana.add(new JLabel(""));
           ventana.add(new JLabel(""));
            ventana.add(new JLabel(""));
    }
  
    public static void main(String[] args) {
        Main ventana = new Main();
    }
    
}
