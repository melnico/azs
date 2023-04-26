package org.example;

public class car {
    double volume;
    double perc;
    double wish;

    double time;

    public void makecar(double x)
    {
        this.volume = x*50;
        this.perc = x*20;
        this.wish = x*90;
    }

    @Override
    public String toString() {
        return "car{" +

                ", time=" + time +
                '}';
    }
}
