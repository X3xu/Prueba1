/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Xexu
 */
public class Controlador implements WindowListener, KeyListener, MouseMotionListener, MouseListener {

    private Ventana ventana;

    public Controlador() {

        this.ventana = new Ventana();
        ventana.addWindowListener(this);
        ventana.addWindowListener(this);
        ventana.addKeyListener(this);
        ventana.addMouseMotionListener(this);
        ventana.addMouseListener(this);
    }

    @Override
    public void windowOpened(WindowEvent we) {

    }

    @Override
    public void windowClosing(WindowEvent we) {
        int opcion = JOptionPane.showConfirmDialog(ventana, "¿Quieres salir del programa?", "Salir", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("Ventana cerrada.");
    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("Ventana minimizada. ");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        System.out.println("Ventana maximizada.");
    }

    @Override
    public void windowActivated(WindowEvent we) {

    }

    @Override
    public void windowDeactivated(WindowEvent we) {

    }

    @Override
    public void keyTyped(KeyEvent ke) {
        String caracter = Character.toString(ke.getKeyChar());

        ventana.modificarTecla(caracter);
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        String caracter = Character.toString(ke.getKeyChar());

        ventana.modificarTecla(caracter);
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        String caracter = Character.toString(ke.getKeyChar());

        ventana.modificarTecla(caracter);
    }

    @Override
    public void mouseDragged(MouseEvent me) {

    }

    @Override
    public void mouseMoved(MouseEvent me) {
        int x = 0;
        int y = 0;

        x = me.getX();
        y = me.getY();

        ventana.devuelveX(x);
        ventana.devuelveY(y);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        ventana.cambiarEstrella();
    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if (me.getSource().getClass().equals(JLabel.class)) {
            ventana.cambiarEstrella();
        }
        if (me.getSource().getClass().equals(Label.class)) {
           // Label etq = (Label)me.getSource();
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
          if (me.getSource().getClass().equals(JLabel.class)) {
            ventana.cambiarEstrella();
        }
    
    }

}
