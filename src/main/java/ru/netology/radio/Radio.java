package ru.netology.radio;

public class Radio {
    private int currentRadioStationNumber;
    private int currentVolumeLevel;
    private int stationCount=10;
    public int maxVolumeLevel = 100;

    public Radio(int stationCount)
    {
        this.stationCount = stationCount;
    }
    public Radio()
    {
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > this.stationCount - 1) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber == this.stationCount - 1) {
            currentRadioStationNumber = 0;
            return;
        }
        currentRadioStationNumber += 1;
    }

    public void prev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = this.stationCount - 1;
            return;
        }
        currentRadioStationNumber -= 1;
    }


    public void increaseCurrentVolumeLevel() {
        if (currentVolumeLevel < maxVolumeLevel) {
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

    public void setCurrentVolumeLevel(int newCurrentVolumeLevel) {
        if (newCurrentVolumeLevel < 0) {
            return;
        }
        if (newCurrentVolumeLevel > maxVolumeLevel) {
            return;
        }
        currentVolumeLevel = newCurrentVolumeLevel;
    }
}
