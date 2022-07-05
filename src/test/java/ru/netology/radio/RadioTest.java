package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    void shouldNotSetCurrentRadioStationNumberBigger() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(12);
        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void shouldNotSetCurrentRadioStationNumberLess() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(-2);
        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void shouldSetCurrentRadioStationNumber() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(8);
        int actual = rad.getCurrentRadioStationNumber();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNext() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(8);
        rad.next();
        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotNext() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(9);
        rad.next();
        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrev() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(6);
        rad.prev();
        int actual = rad.getCurrentRadioStationNumber();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotPrev() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(0);
        rad.prev();
        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseCurrentVolumeLevel() {
        Radio rad = new Radio();
        rad.increaseCurrentVolumeLevel();
        rad.increaseCurrentVolumeLevel();
        int actual = rad.getCurrentVolumeLevel();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseCurrentVolumeLevel() {
        Radio rad = new Radio();
        rad.increaseCurrentVolumeLevel();
        rad.increaseCurrentVolumeLevel();
        rad.increaseCurrentVolumeLevel();
        rad.decreaseCurrentVolumeLevel();
        int actual = rad.getCurrentVolumeLevel();
        int expected = 2;
        assertEquals(expected, actual);
    }


}
