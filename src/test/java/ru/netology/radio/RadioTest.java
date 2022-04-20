package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentRadioWave() {
        Radio cond = new Radio();
        cond.setCurrentRadioWave(8);
        int expected = 8;
        int actual = cond.getCurrentRadioWave();
        assertEquals(expected, actual);
    }
    @Test
    void setCurrentRadioWaveBelow() {
        Radio cond = new Radio();
        cond.setCurrentRadioWave(-1);
        int expected = 0;
        int actual = cond.getCurrentRadioWave();
        assertEquals(expected, actual);
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
    void setVolumeLevelHigher() {
        Radio cond = new Radio();
        cond.setVolumeLevel(11);
        int expected = 0;
        int actual = cond.getVolumeLevel();
        assertEquals(expected, actual);
    }

    @Test
    void nextVolumeLevelHigher() {
        Radio cond = new Radio();
        cond.setVolumeLevel(10);
        cond.setNextVolumeLevel();
        int expected = 10;
        int actual = cond.getVolumeLevel();
        assertEquals(expected, actual);
    }
    @Test
    void nextVolumeLevel() {
        Radio cond = new Radio();
        cond.setVolumeLevel(8);
        cond.setNextVolumeLevel();
        int expected = 9;
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