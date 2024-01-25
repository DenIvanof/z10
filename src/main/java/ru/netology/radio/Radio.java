package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data

public class Radio {
    private int minRadioStationNumber = 0;
    private int maxRadioStationNumber;
    private int currentRadioStationNumber;
    private int volume;

    public Radio(int radioStation) {
        this.maxRadioStationNumber = radioStation - 1;
        this.currentRadioStationNumber = minRadioStationNumber;
    }

    public int getRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < minRadioStationNumber) {
            return;
        }
        if (newRadioStationNumber > maxRadioStationNumber) {
            return;
        }
        currentRadioStationNumber = newRadioStationNumber;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void increaseRadioStation() {
        if (currentRadioStationNumber < maxRadioStationNumber) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else {
            currentRadioStationNumber = minRadioStationNumber;
        }
    }

    public void decreaseRadioStation() {
        if (currentRadioStationNumber > minRadioStationNumber) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = maxRadioStationNumber;
        }
    }

    public void increaseVolume() {

        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}