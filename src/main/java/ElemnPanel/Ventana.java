package ElemnPanel;

import Logicas.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana extends JFrame {

    int[] cordx =new int[6];
    int[] cordy =new int[6];

    private JMenuBar menuBar;
    private JMenu menu1, menu2,  submenu11,submenu12,menuanadir, menuquitar ;
    private JMenu h1plus, h2plus, h3plus, h4plus, h5plus ,h6plus;
    private JMenu h1minus, h2minus, h3minus, h4minus, h5minus, h6minus;
    private JMenuItem[][] PlusAn, MinusAn;
    private JMenuItem item11,item12, item13, item14;
    private JMenuItem item21,item22, item23, item24,item25,item26;
    public PanelAlim panelim[];
    Ventana v;
    public Ventana(){
        super();
        panelim = new PanelAlim[6];

        cordx[0]=290;
        cordy[0]=97;

        cordx[1]=630;
        cordy[1]=190;

        cordx[2]=980;
        cordy[2]=112;

        cordx[3]=630;
        cordy[3]=440;

        cordx[4]=988;
        cordy[4]=412;

        cordx[5]=268;
        cordy[5]=406;

        this.setTitle("esta Ventana");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1300,702);
        this.setLayout(null);
        this.setResizable(false);
        PanelZoo a = new PanelZoo(this);
        Zoo b = a.GetZoo();
        v=this;
        for(int i=0;i<6;i++){
            panelim[i] = new PanelAlim();
            panelim[i].setBounds(cordx[i],cordy[i],270,50);
            panelim[i].setVisible(true);
            panelim[i].setOpaque(false);
            this.add(panelim[i]);
        }
        a.setBounds(0,0,1300,702);
        a.setVisible(true);
        this.add(a);


        menuBar = new JMenuBar();

        menu1 = new JMenu("Manejar Habitats");
        submenu11 = new JMenu("Añadir Habitat");
        submenu12 = new JMenu("Quitar Habitat");

        item11= new JMenuItem("Pradera");
        item11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Habitat hab = new Habitat(1);
                try {
                    b.addHab(hab);
                    if(b.getNumH()==1){
                        panelim[0].givehab(hab);
                    }
                    if(b.getNumH()==2){
                        panelim[1].givehab(hab);
                    }
                    if(b.getNumH()==3){
                        panelim[2].givehab(hab);
                    }
                    if(b.getNumH()==4){
                        panelim[3].givehab(hab);
                    }
                    if(b.getNumH()==5){
                        panelim[4].givehab(hab);
                    }
                    if(b.getNumH()==6){
                        panelim[5].givehab(hab);
                    }
                    v.revalidate();
                } catch (LimiteDeHabitatException ex) {
                    JOptionPane.showMessageDialog(Ventana.this, "Se alcanzo el limite de Habitats");
                }
            }
        });

        item12= new JMenuItem("Polar");
        item12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Habitat hab = new Habitat(2);
                try {
                    b.addHab(hab);
                    if(b.getNumH()==1){
                        panelim[0].givehab(hab);
                    }
                    if(b.getNumH()==2){
                        panelim[1].givehab(hab);
                    }
                    if(b.getNumH()==3){
                        panelim[2].givehab(hab);
                    }
                    if(b.getNumH()==4){
                        panelim[3].givehab(hab);
                    }
                    if(b.getNumH()==5){
                        panelim[4].givehab(hab);
                    }
                    if(b.getNumH()==6){
                        panelim[5].givehab(hab);
                    }
                    v.revalidate();
                } catch (LimiteDeHabitatException ex) {
                    JOptionPane.showMessageDialog(Ventana.this, "Se alcanzo el limite de Habitats");
                }
            }
        });
        item13= new JMenuItem("Acuario");
        item13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Habitat hab = new Habitat(3);
                try {
                    b.addHab(hab);
                    if(b.getNumH()==1){
                        panelim[0].givehab(hab);
                    }
                    if(b.getNumH()==2){
                        panelim[1].givehab(hab);
                    }
                    if(b.getNumH()==3){
                        panelim[2].givehab(hab);
                    }
                    if(b.getNumH()==4){
                        panelim[3].givehab(hab);
                    }
                    if(b.getNumH()==5){
                        panelim[4].givehab(hab);
                    }
                    if(b.getNumH()==6){
                        panelim[5].givehab(hab);
                    }
                    v.revalidate();
                } catch (LimiteDeHabitatException ex) {
                    JOptionPane.showMessageDialog(Ventana.this, "Se alcanzo el limite de Habitats");
                }
            }
        });
        item14= new JMenuItem("Sabana");
        item14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Habitat hab = new Habitat(4);
                try {
                    b.addHab(hab);
                    if(b.getNumH()==1){
                        panelim[0].givehab(hab);
                    }
                    if(b.getNumH()==2){
                        panelim[1].givehab(hab);
                    }
                    if(b.getNumH()==3){
                        panelim[2].givehab(hab);
                    }
                    if(b.getNumH()==4){
                        panelim[3].givehab(hab);
                    }
                    if(b.getNumH()==5){
                        panelim[4].givehab(hab);
                    }
                    if(b.getNumH()==6){
                        panelim[5].givehab(hab);
                    }
                    v.revalidate();
                } catch (LimiteDeHabitatException ex) {
                    JOptionPane.showMessageDialog(Ventana.this, "Se alcanzo el limite de Habitats");
                }
            }
        });

        submenu11.add(item11);
        submenu11.add(item12);
        submenu11.add(item13);
        submenu11.add(item14);



        item21= new JMenuItem("Habitat 1");
        item21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>0){
                    b.remHab(0);
                    panelim[0].remhabfrpan();
                    v.revalidate();
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat no Creado");
                }
            }
        });
        item22= new JMenuItem("Habitat 2");
        item22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>1){
                    b.remHab(1);
                    panelim[1].remhabfrpan();
                    v.revalidate();
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat no Creado");
                }
            }
        });
        item23= new JMenuItem("Habitat 3");
        item23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>2){
                    b.remHab(2);
                    panelim[2].remhabfrpan();
                    v.revalidate();
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat no Creado");
                }
            }
        });
        item24= new JMenuItem("Habitat 4");
        item24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>3){
                    b.remHab(3);
                    panelim[3].remhabfrpan();
                    v.revalidate();
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat no Creado");
                }
            }
        });
        item25= new JMenuItem("Habitat 5");
        item25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>4){
                    b.remHab(4);
                    panelim[4].remhabfrpan();
                    v.revalidate();
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat no Creado");
                }
            }
        });
        item26= new JMenuItem("Habitat 6");
        item26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>5){

                    b.remHab(5);
                    panelim[5].remhabfrpan();
                    v.revalidate();
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat no Creado");
                }
            }
        });


        submenu12.add(item21);
        submenu12.add(item22);
        submenu12.add(item23);
        submenu12.add(item24);
        submenu12.add(item25);
        submenu12.add(item26);

        menu1.add(submenu11);
        menu1.add(submenu12);

        menu2 = new JMenu("Manejar Animales");
        menuanadir = new JMenu("Añadir animal");
        menuquitar = new JMenu("Quitar Animal");

        h1plus= new JMenu("Habitat 1");
        h1minus=new JMenu("Habitat 1");
        h2plus= new JMenu("Habitat 2");
        h2minus=new JMenu("Habitat 2");
        h3plus= new JMenu("Habitat 3");
        h3minus=new JMenu("Habitat 3");
        h4plus= new JMenu("Habitat 4");
        h4minus=new JMenu("Habitat 4");
        h5plus= new JMenu("Habitat 5");
        h5minus=new JMenu("Habitat 5");
        h6plus= new JMenu("Habitat 6");
        h6minus=new JMenu("Habitat 6");

        PlusAn = new JMenuItem[6][7];
        MinusAn= new JMenuItem[6][7];

        for(int i=0;i<6;i++){
            for(int j=1;j<8;j++){
                if(j==1){
                    PlusAn[i][j-1]= new JMenuItem("Añadir Elefante");
                    MinusAn[i][j-1]= new JMenuItem("Quitar Elefante");
                }
                if(j==2){
                    PlusAn[i][j-1]= new JMenuItem("Añadir Girafa");
                    MinusAn[i][j-1]= new JMenuItem("Quitar Girafa");
                }
                if(j==3){
                    PlusAn[i][j-1]= new JMenuItem("Añadir Leon");
                    MinusAn[i][j-1]= new JMenuItem("Quitar Leon");
                }
                if(j==4){
                    PlusAn[i][j-1]= new JMenuItem("Añadir Panda");
                    MinusAn[i][j-1]= new JMenuItem("Quitar Panda");
                }
                if(j==5){
                    PlusAn[i][j-1]= new JMenuItem("Añadir Pez");
                    MinusAn[i][j-1]= new JMenuItem("Quitar Pez");
                }
                if(j==6){
                    PlusAn[i][j-1]= new JMenuItem("Añadir Pinguino");
                    MinusAn[i][j-1]= new JMenuItem("Quitar Pinguino");
                }
                if(j==7){
                    PlusAn[i][j-1]= new JMenuItem("Añadir Zebra");
                    MinusAn[i][j-1]= new JMenuItem("Quitar Zebra");
                }
            }
        }
        PlusAn[0][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Elefante();
                if(b.getNumH()>0){
                    try {
                        b.AddAn(animalcreado,0);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    } catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[0][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Girafa();
                if(b.getNumH()>0){
                    try {
                        b.AddAn(animalcreado,0);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    } catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[0][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Leon();
                if(b.getNumH()>0){
                    try {
                        b.AddAn(animalcreado,0);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    } catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[0][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Panda();
                if(b.getNumH()>0){
                    try {
                        b.AddAn(animalcreado,0);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    } catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[0][4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Pez();
                if(b.getNumH()>0){
                    try {
                        b.AddAn(animalcreado,0);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    } catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[0][5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Pinguino();
                if(b.getNumH()>0){
                    try {
                        b.AddAn(animalcreado,0);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    } catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[0][6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Zebra();
                if(b.getNumH()>0){
                    try {
                        b.AddAn(animalcreado,0);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    } catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });
        ////////////////////////
        ////////////////////////
        PlusAn[1][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Elefante();
                if(b.getNumH()>1){
                    try {
                        b.AddAn(animalcreado,1);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    } catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[1][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Girafa();
                if(b.getNumH()>1){
                    try {
                        b.AddAn(animalcreado,1);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[1][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Leon();
                if(b.getNumH()>1){
                    try {
                        b.AddAn(animalcreado,1);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[1][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Panda();
                if(b.getNumH()>1){
                    try {
                        b.AddAn(animalcreado,1);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[1][4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Pez();
                if(b.getNumH()>1){
                    try {
                        b.AddAn(animalcreado,1);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[1][5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Pinguino();
                if(b.getNumH()>1){
                    try {
                        b.AddAn(animalcreado,1);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[1][6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Zebra();
                if(b.getNumH()>1){
                    try {
                        b.AddAn(animalcreado,1);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[2][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Elefante();
                if(b.getNumH()>2){
                    try {
                        b.AddAn(animalcreado,2);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[2][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Girafa();
                if(b.getNumH()>2){
                    try {
                        b.AddAn(animalcreado,2);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[2][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Leon();
                if(b.getNumH()>2){
                    try {
                        b.AddAn(animalcreado,2);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[2][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Panda();
                if(b.getNumH()>2){
                    try {
                        b.AddAn(animalcreado,2);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[2][4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Pez();
                if(b.getNumH()>2){
                    try {
                        b.AddAn(animalcreado,2);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[2][5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Pinguino();
                if(b.getNumH()>2){
                    try {
                        b.AddAn(animalcreado,2);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[2][6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Zebra();
                if(b.getNumH()>2){
                    try {
                        b.AddAn(animalcreado,2);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[3][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Elefante();
                if(b.getNumH()>3){
                    try {
                        b.AddAn(animalcreado,3);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });


        PlusAn[3][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Girafa();
                if(b.getNumH()>3){
                    try {
                        b.AddAn(animalcreado,3);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[3][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Leon();
                if(b.getNumH()>3){
                    try {
                        b.AddAn(animalcreado,3);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[3][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Panda();
                if(b.getNumH()>3){
                    try {
                        b.AddAn(animalcreado,3);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[3][4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Pez();
                if(b.getNumH()>3){
                    try {
                        b.AddAn(animalcreado,3);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[3][5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Pinguino();
                if(b.getNumH()>3){
                    try {
                        b.AddAn(animalcreado,3);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[3][6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Zebra();
                if(b.getNumH()>3){
                    try {
                        b.AddAn(animalcreado,3);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[4][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Elefante();
                if(b.getNumH()>4){
                    try {
                        b.AddAn(animalcreado,4);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[4][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Girafa();
                if(b.getNumH()>4){
                    try {
                        b.AddAn(animalcreado,4);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[4][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Leon();
                if(b.getNumH()>4){
                    try {
                        b.AddAn(animalcreado,4);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[4][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Panda();
                if(b.getNumH()>4){
                    try {
                        b.AddAn(animalcreado,4);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[4][4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Pez();
                if(b.getNumH()>4){
                    try {
                        b.AddAn(animalcreado,4);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[4][5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Pinguino();
                if(b.getNumH()>4){
                    try {
                        b.AddAn(animalcreado,4);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[4][6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Zebra();
                if(b.getNumH()>4){
                    try {
                        b.AddAn(animalcreado,4);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[5][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Elefante();
                if(b.getNumH()>5){
                    try {
                        b.AddAn(animalcreado,5);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[5][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Girafa();
                if(b.getNumH()>5){
                    try {
                        b.AddAn(animalcreado,5);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[5][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Leon();
                if(b.getNumH()>5){
                    try {
                        b.AddAn(animalcreado,5);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[5][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Panda();
                if(b.getNumH()>5){
                    try {
                        b.AddAn(animalcreado,5);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[5][4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Pez();
                if(b.getNumH()>5){
                    try {
                        b.AddAn(animalcreado,5);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[5][5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Pinguino();
                if(b.getNumH()>5){
                    try {
                        b.AddAn(animalcreado,5);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        PlusAn[5][6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal animalcreado = new Zebra();
                if(b.getNumH()>5){
                    try {
                        b.AddAn(animalcreado,5);
                        a.revalidate();
                        a.repaint();
                    } catch (AnimalIncompatibleConHabitatException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con el Habitat");
                    } catch (AnimalIncompatibleConLosDemasException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Animal Incompatible con los demas animales");
                    }catch (HabitatLLenoException ex) {
                        JOptionPane.showMessageDialog(Ventana.this, "Habitat esta lleno");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });


        ////////////////////////////////////////
        //////////////////////////////////////////////
        //////////////////////////////////////////
        MinusAn[0][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>0){
                    if(b.getHab(0).tipocomidaha==0){
                        b.getHab(0).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[0][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>0){
                    if(b.getHab(0).tipocomidaha==1){
                        b.getHab(0).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[0][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>0){
                    if(b.getHab(0).tipocomidaha==2){
                        b.getHab(0).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[0][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>0){
                    if(b.getHab(0).tipocomidaha==3){
                        b.getHab(0).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[0][4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>0){
                    if(b.getHab(0).tipocomidaha==4){
                        b.getHab(0).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[0][5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>0){
                    if(b.getHab(0).tipocomidaha==5){
                        b.getHab(0).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[0][6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>0){
                    if(b.getHab(0).tipocomidaha==6){
                        b.getHab(0).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });
        ////////////////////////
        ////////////////////////

        MinusAn[1][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>1){
                    if(b.getHab(1).tipocomidaha==0){
                        b.getHab(1).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[1][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>1){
                    if(b.getHab(1).tipocomidaha==1){
                        b.getHab(1).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[1][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>1){
                    if(b.getHab(1).tipocomidaha==2){
                        b.getHab(1).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[1][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>1){
                    if(b.getHab(1).tipocomidaha==3){
                        b.getHab(1).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[1][4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>1){
                    if(b.getHab(1).tipocomidaha==4){
                        b.getHab(1).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[1][5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>1){
                    if(b.getHab(1).tipocomidaha==5){
                        b.getHab(1).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[1][6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>1){
                    if(b.getHab(1).tipocomidaha==6){
                        b.getHab(1).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[2][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>2){
                    if(b.getHab(2).tipocomidaha==0){
                        b.getHab(2).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[2][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>2){
                    if(b.getHab(2).tipocomidaha==1){
                        b.getHab(2).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[2][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>2){
                    if(b.getHab(2).tipocomidaha==2){
                        b.getHab(2).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[2][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>2){
                    if(b.getHab(2).tipocomidaha==3){
                        b.getHab(2).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[2][4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>2){
                    if(b.getHab(2).tipocomidaha==4){
                        b.getHab(2).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[2][5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>2){
                    if(b.getHab(2).tipocomidaha==5){
                        b.getHab(2).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[2][6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>2){
                    if(b.getHab(2).tipocomidaha==6){
                        b.getHab(2).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });
        MinusAn[3][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>3){
                    if(b.getHab(3).tipocomidaha==0){
                        b.getHab(3).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[3][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>3){
                    if(b.getHab(3).tipocomidaha==1){
                        b.getHab(3).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[3][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>3){
                    if(b.getHab(3).tipocomidaha==2){
                        b.getHab(3).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[3][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>3){
                    if(b.getHab(3).tipocomidaha==3){
                        b.getHab(3).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[3][4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>3){
                    if(b.getHab(3).tipocomidaha==4){
                        b.getHab(3).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[3][5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>3){
                    if(b.getHab(3).tipocomidaha==5){
                        b.getHab(3).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[3][6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>3){
                    if(b.getHab(3).tipocomidaha==6){
                        b.getHab(3).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[4][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>4){
                    if(b.getHab(4).tipocomidaha==0){
                        b.getHab(4).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[4][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>4){
                    if(b.getHab(4).tipocomidaha==1){
                        b.getHab(4).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[4][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>4){
                    if(b.getHab(4).tipocomidaha==2){
                        b.getHab(4).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[4][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>4){
                    if(b.getHab(4).tipocomidaha==3){
                        b.getHab(4).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[4][4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>4){
                    if(b.getHab(4).tipocomidaha==4){
                        b.getHab(4).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[4][5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>4){
                    if(b.getHab(4).tipocomidaha==5){
                        b.getHab(4).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[4][6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>4){
                    if(b.getHab(4).tipocomidaha==6){
                        b.getHab(4).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[5][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>5){
                    if(b.getHab(5).tipocomidaha==0){
                        b.getHab(5).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[5][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>5){
                    if(b.getHab(5).tipocomidaha==1){
                        b.getHab(5).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[5][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>5){
                    if(b.getHab(5).tipocomidaha==2){
                        b.getHab(5).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[5][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>5){
                    if(b.getHab(5).tipocomidaha==3){
                        b.getHab(5).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[5][4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>5){
                    if(b.getHab(5).tipocomidaha==4){
                        b.getHab(5).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[5][5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>5){
                    if(b.getHab(5).tipocomidaha==5){
                        b.getHab(5).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });

        MinusAn[5][6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b.getNumH()>5){
                    if(b.getHab(5).tipocomidaha==6){
                        b.getHab(5).QuitarAnimal(0);
                        a.revalidate();
                        a.repaint();

                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "No hay de ese animal");
                    }
                }else{
                    JOptionPane.showMessageDialog(Ventana.this, "Habitat No Creado");
                }
            }
        });


        for(int i=0;i<7;i++){
            h1plus.add(PlusAn[0][i]);
            h2plus.add(PlusAn[1][i]);
            h3plus.add(PlusAn[2][i]);
            h4plus.add(PlusAn[3][i]);
            h5plus.add(PlusAn[4][i]);
            h6plus.add(PlusAn[5][i]);
            h1minus.add(MinusAn[0][i]);
            h2minus.add(MinusAn[1][i]);
            h3minus.add(MinusAn[2][i]);
            h4minus.add(MinusAn[3][i]);
            h5minus.add(MinusAn[4][i]);
            h6minus.add(MinusAn[5][i]);
        }
        menuanadir.add(h1plus);
        menuanadir.add(h2plus);
        menuanadir.add(h3plus);
        menuanadir.add(h4plus);
        menuanadir.add(h5plus);
        menuanadir.add(h6plus);
        menuquitar.add(h1minus);
        menuquitar.add(h2minus);
        menuquitar.add(h3minus);
        menuquitar.add(h4minus);
        menuquitar.add(h5minus);
        menuquitar.add(h6minus);

        menu2.add(menuanadir);
        menu2.add(menuquitar);





        menuBar.add(menu1);
        menuBar.add(menu2);
        this.setJMenuBar(menuBar);
        this.setVisible(true);

        Timer timer = new Timer(15000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0;i<b.getNumH();i++){
                    if(b.getHab(i).nivelC>0&&b.getHab(i).nivelA>0){
                        b.getHab(i).nivelC=b.getHab(i).nivelC-1;
                        b.getHab(i).nivelA=b.getHab(i).nivelA-1;
                        if(b.getHab(i).nivelA==0){
                            JOptionPane.showMessageDialog(Ventana.this, "Alerta habitat "+ i+1 +" sin agua");
                        }
                        if(b.getHab(i).nivelC==0){
                            JOptionPane.showMessageDialog(Ventana.this, "Alerta habitat "+ i+1 +" sin comida");
                        }
                    }
                }
            }
        });
        timer.start();
        Timer timer1 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a.revalidate();
            }
        });
        timer1.start();





    }

}