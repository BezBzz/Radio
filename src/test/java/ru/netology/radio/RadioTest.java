package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentRadioWaveMin() {
        Radio cond = new Radio();
        int expected = 0;
        cond.setCurrentRadioWave(-1);

        assertEquals(expected, cond.getCurrentRadioWave());
    }

    @Test
    void setCurrentRadioWaveDefault() {
        Radio cond = new Radio();
        int expected = 0;
        cond.setCurrentRadioWave(12);

        assertEquals(expected, cond.getCurrentRadioWave());
    }

    @Test
    void setCurrentRadioWaveCustom() {
        int sumStation = 15;
        Radio cond = new Radio(sumStation);
        int expected = 14;
        cond.setCurrentRadioWave(14);
        assertEquals(expected, cond.getCurrentRadioWave());
    }

    @Test
    void setCurrentRadioWaveHigher() {
        Radio cond = new Radio();
        cond.setCurrentRadioWave(10);
        int expected = 0;
        int actual = cond.getCurrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    void setNext() {
        Radio cond = new Radio();
        cond.setCurrentRadioWave(9);
        cond.setNext();
        int expected = 0;
        int actual = cond.getCurrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    void setNextWave() {
        Radio cond = new Radio();
        cond.setCurrentRadioWave(5);
        cond.setNext();
        int expected = 6;
        int actual = cond.getCurrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    void setPrev() {
        Radio cond = new Radio();
        cond.setCurrentRadioWave(0);
        cond.setPrev();
        int expected = 9;
        int actual = cond.getCurrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    void setPrevWave() {
        Radio cond = new Radio();
        cond.setCurrentRadioWave(5);
        cond.setPrev();
        int expected = 4;
        int actual = cond.getCurrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeLevel() {
        Radio cond = new Radio();
        cond.setVolumeLevel(-1);
        int expected = 0;
        int actual = cond.getVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeLevelMax() {
        Radio cond = new Radio();
        cond.setVolumeLevel(101);
        int expected = 0;
        int actual = cond.getVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeLevelMaximum() {
        Radio cond = new Radio();
        cond.setVolumeLevel(101);
        int expected = 0;
        int actual = cond.getVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeLevelHigher() {
        Radio cond = new Radio();
        cond.setVolumeLevel(101);
        int expected = 0;
        int actual = cond.getVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    void nextVolumeLevelHigher() {
        Radio cond = new Radio();
        cond.setVolumeLevel(10);
        cond.setNextVolumeLevel();
        int expected = 11;
        int actual = cond.getVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    void nextVolumeLevel() {
        Radio cond = new Radio();
        cond.setVolumeLevel(100);
        cond.setNextVolumeLevel();
        int expected = 100;
        int actual = cond.getVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    void nextVolumeLevelMax() {
        Radio cond = new Radio();
        cond.setVolumeLevel(101);
        cond.setNextVolumeLevel();
        int expected = 1;
        assertEquals(expected, cond.getVolumeLevel());
    }

    @Test
    void prevVolumeLevel() {
        Radio cond = new Radio();
        cond.setVolumeLevel(1);
        cond.setPrevVolumeLevel();
        int expected = 0;
        int actual = cond.getVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    void prevVolumeLevelBelow() {
        Radio cond = new Radio();
        cond.setVolumeLevel(0);
        cond.setPrevVolumeLevel();
        int expected = 0;
        int actual = cond.getVolumeLevel();
        assertEquals(expected, actual);
    }
}