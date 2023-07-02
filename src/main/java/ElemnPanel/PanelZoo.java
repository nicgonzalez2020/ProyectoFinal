package ElemnPanel;

import ControlesGUI.Ventana;
import Logicas.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelZoo extends JPanel{
    private ImageIcon imagen;

    private Zoo zoo;
    Ventana v;

    boolean si=true;
    public PanelZoo(Ventana vv){
        v=vv;
        this.setOpaque(false);
        zoo = new Zoo(this);
        imagen = new ImageIcon("src/zoo.png");
    }

    public Zoo GetZoo(){
        return zoo;
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen.getImage(), 0, 0, null);
        int[] cordx =new int[6];
        int[] cordy =new int[6];
        cordx[0]=290;
        cordy[0]=35;

        cordx[1]=630;
        cordy[1]=-90;

        cordx[2]=980;
        cordy[2]=50;

        cordx[3]=630;
        cordy[3]=158;

        cordx[4]=888;
        cordy[4]=350;

        cordx[5]=368;
        cordy[5]=354;


        for(int i=0;i<zoo.getNumH();i++){


            PanelHab panelhab=new PanelHab(cordx[i],cordy[i], zoo.getHab(i) );
            this.add(panelhab);



        }





    }
}
