package ru.netology.radio;

public class Radio {
    private int currentRadioStationNumber;
    private int currentVolumeLevel;
    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber<0){
            return;
        }
        if(newCurrentRadioStationNumber>9){
            return;
        }
        this.currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int getCurrentRadioStationNumber() {
        return this.currentRadioStationNumber;
    }

    public int next() {
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
            return currentRadioStationNumber;
        }
        currentRadioStationNumber ++;
        return currentRadioStationNumber;
    }

    public int prev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
            return currentRadioStationNumber;
        }
        currentRadioStationNumber -= 1;
        return currentRadioStationNumber;
    }
    

    public void increaseCurrentVolumeLevel() {
        if (currentVolumeLevel < 10) {
            currentVolumeLevel ++;
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
