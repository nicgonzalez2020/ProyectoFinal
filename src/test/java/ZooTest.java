import ControlesGUI.Ventana;
import ElemnPanel.PanelZoo;
import Logicas.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ZooTest {
    private Zoo zoo;
    private PanelZoo panelzoo;
    Ventana v ;
    @BeforeEach
    void setUp() {
        v=new Ventana();
        panelzoo= new PanelZoo(v);
        zoo= new Zoo(panelzoo);
    }
    @AfterEach
    void tearDown() {
    }
    @Test
    @DisplayName("Añadir Habitat al Zoo")
    public void testaddHab() throws Exception {
        Habitat hab[]=new Habitat[7];
        for(int i=0;i<7;i++){
            hab[i]= new Habitat(1);
        }
        for(int i=0;i<7;i++){
            zoo.addHab(hab[i]);
        }

    }
    @Test
    @DisplayName("Añadir Animales al Zoo")
    public void testAddAn() throws Exception {
        Habitat hab=new Habitat(4);
        Animal a= new Leon();
        Animal b= new Elefante();
        Animal c= new Zebra();
        zoo.addHab(hab);
        zoo.AddAn(b,0);
        zoo.AddAn(a,0);
        zoo.AddAn(c,0);


    }


}
