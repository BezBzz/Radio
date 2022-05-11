package ru.netology.radio;

public class Radio {
    private int currentRadioWave;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int volumeLevel;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int sumRadioStation) {
        this.maxRadioStation = sumRadioStation - 1;
    }

    public Radio() {
    }

    public int getCurrentRadioWave() {

        return currentRadioWave;
    }

    public void setCurrentRadioWave(int currentRadioWave) {
        if (currentRadioWave < minRadioStation) {
            return;
        }
        if (currentRadioWave > maxRadioStation) {
            return;
        }
        this.currentRadioWave = currentRadioWave;
    }

    public void setNext() {
        int nextCurrentRadioWave = currentRadioWave + 1;
        {
            if (nextCurrentRadioWave > maxRadioStation) {
                nextCurrentRadioWave = minRadioStation;
            }
        }
        this.currentRadioWave = nextCurrentRadioWave;
    }

    public void setPrev() {
        int prevCurrentRadioWave = currentRadioWave - 1;
        {
            if (prevCurrentRadioWave < minRadioStation) {
                prevCurrentRadioWave = maxRadioStation;
            }
        }
        this.currentRadioWave = prevCurrentRadioWave;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (volumeLevel < minVolume) {
            return;
        }
        if (volumeLevel > maxVolume) {
            return;
        }
        this.volumeLevel = volumeLevel;
    }

    public void setNextVolumeLevel() {
        int nextVolumeLevel = volumeLevel + 1;
        {
            if (nextVolumeLevel > maxVolume) {
                nextVolumeLevel = maxVolume;
            }
        }
        this.volumeLevel = nextVolumeLevel;
    }

    public void setPrevVolumeLevel() {
        int prevVolumeLevel = volumeLevel - 1;
        {
            if (prevVolumeLevel < minVolume) {
                prevVolumeLevel = minVolume;
            }
        }
        this.volumeLevel = prevVolumeLevel;
    }

}


