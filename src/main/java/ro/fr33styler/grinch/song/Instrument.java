package ro.fr33styler.grinch.song;

import org.bukkit.Sound;

public class Instrument {

    public static Sound getInstrument(byte instrument) {
        switch (instrument) {
          case 0:
            case 3:
                return Sound.NOTE_BASS_DRUM;
          case 1:
            case 4:
                return Sound.NOTE_BASS;
            default:
            return Sound.NOTE_BASS_GUITAR;
        }
    }
}