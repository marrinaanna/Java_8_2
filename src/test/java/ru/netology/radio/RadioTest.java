package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    void shouldSetCurrentRadioStationNumber() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(8);
        int actual=rad.getCurrentRadioStationNumber();
        int expected=8;
        assertEquals(expected, actual);
    }
    @Test
    void shouldNext() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(8);
        rad.next();
        int actual=rad.getCurrentRadioStationNumber();
        int expected=9;
        assertEquals(expected, actual);
    }
    @Test
    void shouldPrev() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(6);
        rad.prev();
        int actual=rad.getCurrentRadioStationNumber();
        int expected=5;
        assertEquals(expected, actual);
    }
    @Test
    void shouldIncreaseCurrentVolumeLevel() {
        Radio rad = new Radio();
        rad.increaseCurrentVolumeLevel();
        int actual=rad.getCurrentVolumeLevel();
        int expected=1;
        assertEquals(expected, actual);
    }
    @Test
    void shouldDecreaseCurrentVolumeLevel() {
        Radio rad = new Radio();
        rad.decreaseCurrentVolumeLevel();
        int actual=rad.getCurrentVolumeLevel();
        int expected=0;
        assertEquals(expected, actual);
    }

}
