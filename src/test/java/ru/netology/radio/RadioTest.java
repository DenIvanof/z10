package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void volumeIndicator() {
        Radio rad = new Radio();

        rad.setVolume(101);
        int expected = 0;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStation() {
        Radio rad = new Radio();

        rad.setRadioStationNumber(9);
        int expected = 9;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }


}
