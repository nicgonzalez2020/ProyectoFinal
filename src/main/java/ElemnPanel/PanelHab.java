package ElemnPanel;
import Logicas.*;
import com.sun.source.tree.IfTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

/**
 * clase panel que muestra un habitat y sus animales
 */
public class PanelHab extends JPanel{
    int type;
    int x,y;
    ImageIcon imghab[]= new ImageIcon[4];
    ImageIcon imgAn[]= new ImageIcon[5];
    ImageIcon NivelA[]= new ImageIcon[4];
    ImageIcon NivelC[]= new ImageIcon[4];


    Habitat thishab;
    ArrayList<Animal> LosAnimales;
    private Timer timer;
    private Random random;
    PanelHab thispanel;
    int[] Ax= new int[5];
    int[] Ay= new int[5];
    int ax;
    int ay;

    public PanelHab(int x,int y,Habitat b){
        thishab=b;
        thispanel=this;
        LosAnimales=thishab.VerAnimales();
        type=thishab.tipo;
        this.x=x;
        this.y=y;

        this.setOpaque(false);
        this.setBounds(x,y,270,270);
        imghab[0]= new ImageIcon("src/pradhab.png");
        imghab[1]= new ImageIcon("src/polarhab.png");
        imghab[2]= new ImageIcon("src/acuariohab.png");
        imghab[3]= new ImageIcon("src/sab.png");
        NivelA[0]= new ImageIcon("src/barraaguanv0.png");
        NivelA[1]= new ImageIcon("src/barraaguanv1.png");
        NivelA[2]= new ImageIcon("src/barraaguanv2.png");
        NivelA[3]= new ImageIcon("src/barraaguanv3.png");
        NivelC[0]= new ImageIcon("src/barracomidanv0.png");
        NivelC[1]= new ImageIcon("src/barracomidanv1.png");
        NivelC[2]= new ImageIcon("src/barracomidanv2.png");
        NivelC[3]= new ImageIcon("src/barracomidanv3.png");








        ////
        random = new Random();
        for(int i=0;i<LosAnimales.size();i++){
            Ax[i] = random.nextInt(130)+20;
            Ay[i] = random.nextInt(100)+70;
        }



    }



    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(int i=0;i<LosAnimales.size();i++){
            if(LosAnimales.get(i).esp==1){
                imgAn[i]=new ImageIcon("src/elefante.png");
            }
            if(LosAnimales.get(i).esp==2){
                imgAn[i]=new ImageIcon("src/girafa.png");
            }
            if(LosAnimales.get(i).esp==3){
                imgAn[i]=new ImageIcon("src/leon.png");
            }
            if(LosAnimales.get(i).esp==4){
                imgAn[i]=new ImageIcon("src/panda.png");
            }
            if(LosAnimales.get(i).esp==5){
                imgAn[i]=new ImageIcon("src/pez.png");
            }
            if(LosAnimales.get(i).esp==6){
                imgAn[i]=new ImageIcon("src/pinguino.png");
            }
            if(LosAnimales.get(i).esp==7){
                imgAn[i]=new ImageIcon("src/zebra.png");
            }
        }



        if(type==1){
            g.drawImage(imghab[0].getImage(), 0, 0, null);
        }
        if(type==2){
            g.drawImage(imghab[1].getImage(), 0, 0, null);
        }
        if(type==3){
            g.drawImage(imghab[2].getImage(), 0, 0, null);
        }
        if(type==4){
            g.drawImage(imghab[3].getImage(), 0, 0, null);
        }

        for(int i=0;i< LosAnimales.size();i++){
            g.drawImage(imgAn[i].getImage(),Ax[i],Ay[i],null);
        }
        for(int i=0;i<4;i++){
            if(thishab.nivelA==i){
                g.drawImage(NivelA[i].getImage(),0,0,null);
            }
            if(thishab.nivelC==i){
                g.drawImage(NivelC[i].getImage(),30,0,null);
            }

        }





    }

}
