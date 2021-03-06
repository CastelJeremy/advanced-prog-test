package net.jeremycastel.advancedprog.observer;

import net.jeremycastel.advancedprog.partitions.Partition;

public interface IObserver {
    public void partitionAdded(Partition partition);
}
