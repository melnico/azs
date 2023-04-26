package org.example;


import java.util.Arrays;

public class colon {
    int speed = 20;
    car[] cars = {};
    double queue;
    private static car[] append(car[] arr, car car)
    {
        car[] array = new car[arr.length + 1];
        System.arraycopy(arr, 0, array, 0, arr.length);
        array[arr.length] = car;
        return array;
    }
    public double ostalostime(){
        double x = 0;
        for(int i = 0; i < this.cars.length; i++) {
            x += cars[i].time;
        }
        return x;
    }
    private static car[] remove(car[] arr, car car)
    {
        car[] array = new car[arr.length - 1];
        System.arraycopy(arr, 1, array, 0, arr.length - 1);
        return array;
    }

    public void addcar(car car){
        this.cars = append(cars, car);
        this.cars[cars.length - 1].time = car.wish/this.speed;
    }
    public void remcar(car car ){this.cars = remove(cars, car);}

    @Override
    public String toString() {
        return "colon{" +
                "cars=" + Arrays.toString(cars) +
                '}';
    }
}
