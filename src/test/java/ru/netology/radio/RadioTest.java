package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentRadioWave() {
        Radio cond = new Radio();
        cond.setCurrentRadioWave(9);
        int expected = 9;
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
    void setPrev() {
        Radio cond = new Radio();
        cond.setCurrentRadioWave(0);
        cond.setPrev();
        int expected = 9;
        int actual = cond.getCurrentRadioWave();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeLevel() {
        Radio cond = new Radio();
        cond.setVolumeLevel(9);
        int expected = 9;
        int actual = cond.getVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    void nextVolumeLevel() {
        Radio cond = new Radio();
        cond.setVolumeLevel(10);
        cond.setNextVolumeLevel();
        int expected = 10;
        int actual = cond.getVolumeLevel();
        assertEquals(expected, actual);
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
}