/*
PLANTILLA BASE PARA CREACION DE ESCENARIOS.
 */
package Ejercicio0;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {

    private int xref;
    private int yref;
    private Timer timer;
    
    public Board(){
        this.xref = 10;
        this.timer = new Timer (25, this);
        this.timer.start();
        this.yref = 10;
    }
    @Override
    
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        dibujarEscenario(g);
        g.setColor(Color.BLUE);
        int w = 10;
        int z = 100;
         
//        g.drawLine(0,1,100, 100);
//        g.drawString("puntaje= 100", 80, 10);
//        g.drawOval(80, 20, 10, 20);
//        g.drawRect(10, 10, 20, 20);
        g.drawRect(this.xref, z-20, 50, 10);
        
        g.fillRect(this.xref, z-20, 50, 10);
        int x[] = {this.xref+20, this.xref+10, this.xref+40, this.xref+30 };
        int y []= {z-30, z-20, z-20, z-30};
        g.setColor(Color.BLACK);
        g.drawOval(this.xref+10, z-10, 10, 10);
        g.fillOval(this.xref+10, z-10, 10, 10);
        g.drawOval(this.xref+30, z-10, 10, 10);
        g.fillOval(this.xref+30, z-10, 10, 10);
        g.drawLine(this.xref, z, this.xref, z);
        g.drawPolygon(x , y, 4);
        
        g.fillPolygon(x, y, 4);
        
       
       g.drawRect(this.xref, 120, 50, 10);
       Rectangle rect = new Rectangle (this.xref, 150, 50, 10);
       g.drawOval(200, this.yref, 15, 15);
       Rectangle oval = new Rectangle (this.xref, 150, 50, 10);
       
       if (rect.intersects(oval)){
           this.timer.stop();
       }
      
        
    }
 @Override
    public void actionPerformed(ActionEvent e) {
          this.xref++;
        repaint();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void dibujarEscenario(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
//        //the first two parameters are the position (x,y) and after comes the width and the height
//        g2d.fillOval(0, 0, 30, 30);
//        g2d.drawOval(0, 50, 30, 30);
//               
//        g2d.fillRect(50, 0, 30, 30); 
//        g2d.drawRect(50, 50, 30, 30);
//        
//        g2d.drawString("Puntaje del Juego", 100, 100);
//        
    }

   
}