package Versionsstyring_og_testmetoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Rumfangtest {
    @Test
    void RumfangTest(){
        double rumfang = Rumfang.Rumfangudregner(5,5);
        assertEquals(392.7,rumfang,0.001);

    }
}
