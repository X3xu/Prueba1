/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Xexu
 */
public class Ventana extends JFrame {
    private Controlador controlador;
    private final ImageIcon ESTRELLA_AMARILLA = new ImageIcon(getClass().getResource("./../imagenes/estrellaAmarilla.jpg"));
    private final ImageIcon ESTRELLA_AZUL = new ImageIcon(getClass().getResource("./../imagenes/estrellaAzul.jpg"));
    private JLabel estrella, tecla, raton, chivato;
    private JPanel marcoSuperior, marcoIntermedio, marcoInferior;
    
    public Ventana() {

        this.setLayout(new GridLayout(3, 0));
        this.addWindowListener(controlador);
        crearFilaSuperior();
        crearFilaIntermedia();
        crearFilaInferior();
        setSize(750, 500);
        setVisible(true);
    }
    
    public void crearFilaSuperior(){
       marcoSuperior = new JPanel(new FlowLayout());
       this.add(marcoSuperior);
       marcoSuperior.setSize(300,200);
       estrella = new JLabel(ESTRELLA_AMARILLA);
       marcoSuperior.add(estrella);
    }
   
    public void crearFilaIntermedia(){
        marcoIntermedio = new JPanel(new FlowLayout());
        this.add(marcoIntermedio);
        tecla = new JLabel("A");
        raton = new JLabel("200px");
        marcoIntermedio.add(tecla);
        marcoIntermedio.add(raton);
        
    }
    
    public void crearFilaInferior(){
        marcoInferior = new JPanel(new FlowLayout());
        this.add(marcoInferior);
        chivato = new JLabel("Estas en Narnia amigo.");
        marcoInferior.add(chivato);
    }
}
