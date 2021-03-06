package net.jeremycastel.advancedprog.observer;

import java.util.ArrayList;
import net.jeremycastel.advancedprog.partitions.Partition;

public abstract class Subject {
    private ArrayList<IObserver> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public boolean addObserver(IObserver observer) {
        return this.observers.add(observer);
    }

    public void notifyObservers(Partition partition) {
        for (IObserver observer : this.observers) {
            observer.partitionAdded(partition);
        }
    }

    public boolean removeObserver(IObserver observer) {
        return this.observers.remove(observer);
    }
}
