package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int minRadioStationNumber = 0;
    private int maxRadioStationNumber;
    private int currentRadioStationNumber;
    private int volume;
    private int minVolume;
    private int maxVolume;

}