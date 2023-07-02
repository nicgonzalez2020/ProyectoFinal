import ControlesGUI.Ventana;
import ElemnPanel.PanelZoo;
import Logicas.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class HabitatTest {
    private Habitat habitat;
    @BeforeEach
    void setUp() {
        habitat = new Habitat(1);
    }
    @AfterEach
    void tearDown() {
    }
    @Test
    @DisplayName("test añadir mas animales del maximo permitido por habitat")
    public void testanadirmasde6animales() throws Exception {
        Animal a[] = new Animal[7];
        for (int i = 0; i < 7; i++) {
            a[i] = new Elefante();
        }
        for (int i = 0; i < 7; i++) {
            habitat.addAnimal(a[i]);
        }
    }
    @Test
    @DisplayName("test añadir animal incompatible con el resto")
    public void testanadiranimalincompatible() throws Exception {
        Animal a1 = new Elefante();
        Animal a2 = new Panda();
        habitat.addAnimal(a1);
        habitat.addAnimal(a2);
    }
    @Test
    @DisplayName("test añadir animal incompatible con el habitat")
    public void testanadiranimalincompatibleconhabitat() throws Exception {
        Animal a1 = new Leon();
        habitat.addAnimal(a1);
    }
}