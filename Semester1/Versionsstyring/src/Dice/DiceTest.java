package Dice;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DiceTest {

    @org.junit.jupiter.api.Test
    void rollMultiple() {
        Dice rafle = new Dice();
        for (int i = 0; i < 60000; i++) {
            int resultat = rafle.roll();
            assertTrue(resultat >= 1 && resultat <= 6);
        }


    }
}