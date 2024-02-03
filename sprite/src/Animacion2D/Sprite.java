package Animacion2D;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class Sprite extends JFrame implements Runnable{
    
    int Ancho=500;
    int Alto=400;
    
    Image all;
    Thread Hilo;
    int Incremento=0;
    BufferedImage BI;
    
    
    public Sprite(){
        setSize(Ancho,Alto);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Animacion");
        setResizable(false);
        Hilo = new Thread(this);
        BI = new BufferedImage(Ancho, Alto, BufferedImage.TYPE_INT_RGB);
        Toolkit Herramienta = Toolkit.getDefaultToolkit();
        all = Herramienta.getImage(getClass().getResource("/Imagenes/wolf.png"));
        
        Hilo.start();
        
    }

    @Override
    public void paint(Graphics G) {
        Graphics2D G2D;
        G.drawImage(BI, 0, 0, this);
        G2D = BI.createGraphics();
        G2D.fillRect(0, 0, Ancho, Alto);
        int MVX = (Incremento&7)*86;
        int MVY = (Incremento/7)*90; 
        G2D.drawImage(all, 200,200,200+86,200+90,MVX,MVY,MVX+86,MVY+90, this);
        repaint();
        
        
    }
    
    

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sprite.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Incremento++;
            
            if(Incremento>20){
                Incremento=0;
            }
        }
        
    }
    
    public static void main(String[] args) {
        new Sprite().setVisible(true);
    }
    
}
