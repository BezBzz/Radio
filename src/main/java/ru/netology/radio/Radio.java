package ru.netology.radio;

public class Radio {
    private int currentRadioWave;
    private int volumeLevel;

    public int getCurrentRadioWave() {
        return currentRadioWave;
    }

    public void setCurrentRadioWave(int currentRadioWave) {
        if (currentRadioWave < 0) {
            return;
        }
        if (currentRadioWave > 9) {
            return;
        }
        this.currentRadioWave = currentRadioWave;
    }

    public void setNext() {
        int nextCurrentRadioWave = currentRadioWave + 1;
        {
            if (nextCurrentRadioWave > 9) {
                nextCurrentRadioWave = 0;
            }
        }
        this.currentRadioWave = nextCurrentRadioWave;
    }

    public void setPrev() {
        int prevCurrentRadioWave = currentRadioWave - 1;
        {
            if (prevCurrentRadioWave < 0) {
                prevCurrentRadioWave = 9;
            }
        }
        this.currentRadioWave = prevCurrentRadioWave;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (volumeLevel < 0) {
            return;
        }
        if (volumeLevel > 10) {
            return;
        }
        this.volumeLevel = volumeLevel;
    }

    public void setNextVolumeLevel() {
        int nextVolumeLevel = volumeLevel + 1;
        {
            if (nextVolumeLevel > 10) {
                nextVolumeLevel = 10;
            }
        }
        this.volumeLevel = nextVolumeLevel;
    }

    public void setPrevVolumeLevel() {
        int prevVolumeLevel = volumeLevel - 1;
        {
            if (prevVolumeLevel < 0) {
                prevVolumeLevel = 0;
            }
        }
        this.volumeLevel = prevVolumeLevel;
    }

}


