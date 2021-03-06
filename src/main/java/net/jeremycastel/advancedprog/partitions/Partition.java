package net.jeremycastel.advancedprog.partitions;

public class Partition {
    private String name;
    private Tonality tonality;

    public Partition(String name, Tonality tonality) {
        this.name = name;
        this.tonality = tonality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setTonality(Tonality tonality) {
        this.tonality = tonality;
    }

    public Tonality getTonality() {
        return this.tonality;
    }
}
