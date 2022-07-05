package ru.netology.radio;

public class Radio {
    private int currentRadioStationNumber;
    private int currentVolumeLevel;
    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber<0){
            return;
        }
        if (newCurrentRadioStationNumber>9){
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
            return;
        }
        currentRadioStationNumber += 1;
    }

    public void prev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
            return;
        }
        currentRadioStationNumber -= 1;
    }
    

    public void increaseCurrentVolumeLevel() {
        if (currentVolumeLevel < 10) {
            currentVolumeLevel += 1;
        }
    }

    public void decreaseCurrentVolumeLevel() {
        if (currentVolumeLevel > 0) {
            currentVolumeLevel -= 1;
        }
    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }
}
