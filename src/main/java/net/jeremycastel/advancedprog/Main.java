package net.jeremycastel.advancedprog;

import net.jeremycastel.advancedprog.musicians.Musician;
import net.jeremycastel.advancedprog.musicians.MusicianFactory;
import net.jeremycastel.advancedprog.musicians.Instrument;

public class Main {
    public static void main(String [] args) {
        Musician m = MusicianFactory.create(Instrument.PIANO, "jonas");

        System.out.println("Hello World !");
    }
}
