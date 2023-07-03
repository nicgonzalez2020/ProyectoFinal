package ControlesGUI;
import Logicas.*;
import com.sun.source.tree.IfTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

/**
 * clase panel de botones utilizados para alimentar a los habitats
 */
public class PanelAlim extends JPanel{
    /**
     * imagenes que seran los iconos de los botones para alimentar a los habitats
     */
    ImageIcon Alim[]=new ImageIcon[7];
    /**
     * el habitat que sera alimentado mediante este panel
     */
    Habitat xyy;
    /**
     * los botones utilizados para alimentar los habitats
     */
    JButton bcarne, bhojas, bbambu, bpasto, bpescado, bfishfood, bagua;
    /**
     * propiedad para hacer referencia a si mismo
     */
    PanelAlim thiss;

    /**
     * se añaden los iconos a los botones se designa su funcion y se añaden al panel
     */
    public PanelAlim(){

        thiss=this;
        this.setLayout(new GridLayout(1,7));
        Alim[0]= new ImageIcon("src/carne.png");
        Alim[1]= new ImageIcon("src/hoja.png");
        Alim[2]= new ImageIcon("src/bambo.png");
        Alim[3]= new ImageIcon("src/pasto.png");
        Alim[4]= new ImageIcon("src/pescado.png");
        Alim[5]= new ImageIcon("src/comidapez.png");
        Alim[6]= new ImageIcon("src/agua.png");

        bcarne=new JButton("");
        bhojas=new JButton("");
        bbambu=new JButton("");
        bpasto=new JButton("");
        bpescado=new JButton("");
        bfishfood=new JButton("");
        bagua=new JButton("");

        bcarne.setIcon(Alim[0]);
        bcarne.setLocation(0,0);
        bhojas.setIcon(Alim[1]);
        bhojas.setLocation(35,0);
        bbambu.setIcon(Alim[2]);
        bbambu.setLocation(70,0);
        bpasto.setIcon(Alim[3]);
        bpasto.setLocation(105,0);
        bpescado.setIcon(Alim[4]);
        bpescado.setLocation(140,0);
        bfishfood.setIcon(Alim[5]);
        bfishfood.setLocation(175,0);
        bagua.setIcon(Alim[6]);
        bagua.setLocation(210,0);
        bcarne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(xyy!=null){
                    if(xyy.tipocomidaha<100){
                        if(xyy.tipocomidaha==2){
                            xyy.nivelC=3;
                        }else{
                            JOptionPane.showMessageDialog(thiss, "Tipo de comida no compatible con los animales");
                        }

                    }else{
                        JOptionPane.showMessageDialog(thiss, "Tipo de comida no definido");
                    }
                }else{
                    JOptionPane.showMessageDialog(thiss, "Habitat no creado");
                }
            }
        });

        bhojas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(xyy!=null){
                if(xyy.tipocomidaha<100){
                    if(xyy.tipocomidaha==1){
                        xyy.nivelC=3;
                    }else{
                        JOptionPane.showMessageDialog(thiss, "Tipo de comida no compatible con los animales");
                    }

                }else{
                    JOptionPane.showMessageDialog(thiss, "Tipo de comida no definido");
                };
            }else{
                    JOptionPane.showMessageDialog(thiss, "Habitat no creado");
                }
            }
        });

        bbambu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(xyy!=null){
                if(xyy.tipocomidaha<100){
                    if(xyy.tipocomidaha==3){
                        xyy.nivelC=3;
                    }else{
                        JOptionPane.showMessageDialog(thiss, "Tipo de comida no compatible con los animales");
                    }

                }else{
                    JOptionPane.showMessageDialog(thiss, "Tipo de comida no definido");
                }
            }else{
                    JOptionPane.showMessageDialog(thiss, "Habitat no creado");
                }
            }
        });

        bpasto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(xyy!=null){
                if(xyy.tipocomidaha<100){
                    if(xyy.tipocomidaha==0 ||xyy.tipocomidaha==6 ){
                        xyy.nivelC=3;
                    }else{
                        JOptionPane.showMessageDialog(thiss, "Tipo de comida no compatible con los animales");
                    }

                }else{
                    JOptionPane.showMessageDialog(thiss, "Tipo de comida no definido");
                }
            }else{
                    JOptionPane.showMessageDialog(thiss, "habitat no creado");
                }
            }
        });

        bpescado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(xyy!=null){
                if(xyy.tipocomidaha<100){
                    if(xyy.tipocomidaha==5){
                        xyy.nivelC=3;
                    }else{
                        JOptionPane.showMessageDialog(thiss, "Tipo de comida no compatible con los animales");
                    }

                }else{
                    JOptionPane.showMessageDialog(thiss, "Tipo de comida no definido");
                }
            }else{
                    JOptionPane.showMessageDialog(thiss, "habitat no creado");
                }
            }
        });
        bfishfood.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(xyy!=null){
                if(xyy.tipocomidaha<100){
                    if(xyy.tipocomidaha==4){
                        xyy.nivelC=3;
                    }else{
                        JOptionPane.showMessageDialog(thiss, "Tipo de comida no compatible con los animales");
                    }

                }else{
                    JOptionPane.showMessageDialog(thiss, "Tipo de comida no definido");
                }
            }else{
                    JOptionPane.showMessageDialog(thiss, "Tipo de comida no definido");
                }
            }
        });

        bagua.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(xyy!=null){
                xyy.nivelA=3;
                }else{
                    JOptionPane.showMessageDialog(thiss, "habitat no creado");
                }
            }
        });



        this.setOpaque(false);
        this.setVisible(true);

    }

    /**
     * metodo para designar el habitat al cual este panel va a alimentar
     * @param habbb el habitat el cual se va poder alimentar y dar agua mediante este panel
     */
    public void givehab(Habitat habbb){
        xyy=habbb;
    }

    /**
     * metodo para desvincular el habitat vinculado a este panel
     */
    public void remhabfrpan(){
        xyy=null;
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(0, 0, 0, 0)); // Establece un color transparente
        g.fillRect(0, 0, getWidth(), getHeight());
        this.setOpaque(false);
        this.add(bcarne);
        this.add(bhojas);
        this.add(bbambu);
        this.add(bpasto);
        this.add(bpescado);
        this.add(bfishfood);
        this.add(bagua);



    }

}
