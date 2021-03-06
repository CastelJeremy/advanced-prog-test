package net.jeremycastel.advancedprog.musicians;

public class MusicianFactory {
    public static Musician create(Instrument instrument, String name) {
        switch(instrument) {
            case PIANO: 
                return new Pianist(name);
            case VIOLIN:
                return new Violinist(name);
            case TRUMPET:
                return new Trumpeter(name);
            default:
                return null;
        }
    }
}