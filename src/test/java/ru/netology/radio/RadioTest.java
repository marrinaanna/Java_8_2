package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    void shouldNotSetCurrentRadioStationNumberBigger() {
        Radio rad = new Radio(20);
        rad.setCurrentRadioStationNumber(22);
        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentRadioStationNumberLess() {
        Radio rad = new Radio(8);
        rad.setCurrentRadioStationNumber(-2);
        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentRadioStationNumber() {
        Radio rad = new Radio(20);
        rad.setCurrentRadioStationNumber(8);
        int actual = rad.getCurrentRadioStationNumber();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNext() {
        Radio rad = new Radio(20);
        rad.setCurrentRadioStationNumber(8);
        rad.next();
        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotNext() {
        Radio rad = new Radio(10);
        rad.setCurrentRadioStationNumber(9);
        rad.next();
        int actual = rad.getCurrentRadioStationNumber();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrev() {
        Radio rad = new Radio(8);
        rad.setCurrentRadioStationNumber(6);
        rad.prev();
        int actual = rad.getCurrentRadioStationNumber();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotPrev() {
        Radio rad = new Radio(10);
        rad.setCurrentRadioStationNumber(0);
        rad.prev();
        int actual = rad.getCurrentRadioStationNumber();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseCurrentVolumeLevel() {
        Radio rad = new Radio(1);
        rad.setCurrentVolumeLevel(3);
        rad.increaseCurrentVolumeLevel();
        int actual = rad.getCurrentVolumeLevel();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseCurrentVolumeLevel() {
        Radio rad = new Radio();
        rad.setCurrentVolumeLevel(rad.maxVolumeLevel);
        rad.increaseCurrentVolumeLevel();
        int actual = rad.getCurrentVolumeLevel();
        int expected = rad.maxVolumeLevel;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseCurrentVolumeLevel() {
        Radio rad = new Radio();
        rad.setCurrentVolumeLevel(rad.maxVolumeLevel);
        rad.decreaseCurrentVolumeLevel();
        int actual = rad.getCurrentVolumeLevel();
        int expected = 99;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseCurrentVolumeLevel() {
        Radio rad = new Radio();
        rad.decreaseCurrentVolumeLevel();
        int actual = rad.getCurrentVolumeLevel();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetVolumeLevelBigger() {
        Radio rad = new Radio(20);
        rad.setCurrentVolumeLevel(rad.maxVolumeLevel + 1);
        int actual = rad.getCurrentVolumeLevel();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetVolumeLevelLess() {
        Radio rad = new Radio(8);
        rad.setCurrentVolumeLevel(-2);
        int actual = rad.getCurrentVolumeLevel();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeLevel() {
        Radio rad = new Radio(20);
        rad.setCurrentVolumeLevel(20);
        int actual = rad.getCurrentVolumeLevel();
        int expected = 20;
        assertEquals(expected, actual);
    }

}
