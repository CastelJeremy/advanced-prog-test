package net.jeremycastel.advancedprog;

import java.util.ArrayList;
import net.jeremycastel.advancedprog.musicians.Musician;
import net.jeremycastel.advancedprog.partitions.Partition;
import net.jeremycastel.advancedprog.observer.Subject;

public class Server extends Subject {
    private static Server instance = null;

    private ArrayList<Musician> musicians;
    private ArrayList<Partition> partitions;

    private Server() {
        this.musicians = new ArrayList<>();
        this.partitions = new ArrayList<>();
    }

    public static Server getInstance() {
        if (Server.instance == null) {
            Server.instance = new Server();
        }

        return Server.instance;
    }

    public boolean addMusician(Musician musician) {
        if (this.musicians.add(musician)) {
            this.addObserver(musician);

            return true;
        }

        return false;
    }

    public boolean removeMusician(Musician musician) {
        if (this.musicians.remove(musician)) {
            this.removeObserver(musician);

            return true;
        }

        return false;
    }

    public boolean addPartition(Partition partition) {
        if (this.partitions.add(partition)) {
            this.notifyObservers(partition);

            return true;
        }

        return false;
    }

    public boolean removePartition(Partition partition) {
        return this.partitions.remove(partition);
    }
}