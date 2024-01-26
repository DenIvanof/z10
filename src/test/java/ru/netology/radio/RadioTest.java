package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio();

    @Test
    public void upVolume() {
        rad.setVolume(50);
        int expected = 50;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setStation() {
        rad.setCurrentRadioStationNumber(8);

        int expected = 8;
        int actual = rad.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }


}
