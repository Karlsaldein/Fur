package Ejercicio0;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener{
    private int xref;
    private int yref;
    private int Sec;
    private Timer timer; 
    
    public Board(){
      this.xref = 10;
      this.yref = 0;
      this.Sec = 0;
      this.timer = new Timer(25, this);
      this.timer.start();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        Image Font = loadImage("Landscape.jpg");
        g.drawImage(Font, 0, 0, 1920, 1080, this);
        Image Dragon = loadImage("sofa1.png");
        g.drawImage(Dragon, (1920-132), 0, 1920, 99, 0, 0, 660, 495, this);
        Image Scooter = loadImage("scooter.gif");
        g.drawImage(Scooter, 127+this.xref, 550+380, 25+this.xref, 550+446, 0, 0, 102, 66, this);      
        Image Cat = loadImage("cats.gif");
        g.drawImage(Cat, 0+this.xref, 550+350, 132+this.xref, 550+430, 132*this.Sec, 0, 132*(this.Sec+1), 80, this);
        
    }

    public void actionPerformed(ActionEvent e) {
        if(this.xref>1024){
            this.xref=0;
        }
        this.xref+=80;
        this.yref++;
        if(this.Sec==5){
            this.Sec = -1;
        }
        this.Sec+=0;
        repaint();
    }

    public Image loadImage(String IName){
        ImageIcon II = new ImageIcon(IName);
        Image I = II.getImage();
        return I;
    }

    
}