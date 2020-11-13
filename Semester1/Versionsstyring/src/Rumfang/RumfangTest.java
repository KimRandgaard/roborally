package Rumfang;

import static org.junit.jupiter.api.Assertions.*;

class RumfangTest {

    @org.junit.jupiter.api.Test
    void rumfangudregner() {
        double rumfang = Rumfang.Rumfangudregner(5,5);
        assertEquals(392.7,rumfang,0.001);

    }
}