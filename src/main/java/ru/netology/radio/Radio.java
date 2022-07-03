package ru.netology.radio;

public class Radio {
    private int currentRadioStationNumber;

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if ((newCurrentRadioStationNumber >= 0) && (newCurrentRadioStationNumber <= 9)) {
            currentRadioStationNumber = newCurrentRadioStationNumber;
        }
        return;
    }
    public int getCurrentRadioStationNumber(){
        return currentRadioStationNumber;
    }
    public int next() {
        if (currentRadioStationNumber == 9) {
            return 0;
        }
        currentRadioStationNumber += 1;
        return currentRadioStationNumber;
    }

    public int prev() {
        if(currentRadioStationNumber==0){
        return 9;}
        currentRadioStationNumber-=1;
        return currentRadioStationNumber;
    }
    private int currentVolumeLevel;
    public void increaseCurrentVolumeLevel(){
        if(currentVolumeLevel<10){
            currentVolumeLevel+=1;
        }
        return;
    }
    public void decreaseCurrentVolumeLevel(){
        if(currentVolumeLevel>0){
            currentVolumeLevel-=1;
        }
        return;
    }
    public int getCurrentVolumeLevel(){
       return currentVolumeLevel;
    }
}
