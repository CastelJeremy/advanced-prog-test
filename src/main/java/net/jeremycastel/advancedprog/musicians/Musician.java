package net.jeremycastel.advancedprog.musicians;

import java.util.ArrayList;
import net.jeremycastel.advancedprog.observer.IObserver;
import net.jeremycastel.advancedprog.partitions.Partition;

public abstract class Musician implements IObserver {
    protected String name;
    protected Instrument instrument;
    protected ArrayList<Partition> partitions;

    protected Musician(String name, Instrument instrument) {
        this.name = name;
        this.instrument = instrument;
        this.partitions = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public Instrument getInstrument() {
        return this.instrument;
    }

    public ArrayList<Partition> getPartitions() {
        return this.partitions;
    }

    @Override
    public void partitionAdded(Partition partition) {
        this.partitions.add(partition);
    }
}