package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {


    private int radioStationNumber;
    private int maxRadioStationNumber;
    private int volume;

    public void increaseRadioStation() {
        if (radioStationNumber < maxRadioStationNumber) {
            radioStationNumber = radioStationNumber + 1;
        } else {
            radioStationNumber = 0;
        }
    }

    public void decreaseRadioStation() {
        if (radioStationNumber > 0) {
            radioStationNumber = radioStationNumber - 1;
        } else {
            radioStationNumber = maxRadioStationNumber;
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