package ru.netology.radio;

public class Radio {
    public int radioStationNumber;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            return;
        }
        if (newRadioStationNumber > 9) {
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void increaseRadioStation(int radioStationNumber) {
        if (radioStationNumber < 9) {
            radioStationNumber = radioStationNumber + 1;
        }
    }
    public void decreaseRadioStation(int radioStationNumber) {
        if (radioStationNumber > 0) {
            radioStationNumber = radioStationNumber - 1;
        }
    }

    //громкость

    public int volume;

    public int getVolume() {
        return volume;
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

    public void increaseVolume(int volume) {
        if (volume < 100) {
            volume = volume + 1;
        }
    }
    public void decreaseVolume(int volume) {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
