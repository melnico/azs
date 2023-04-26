package org.example;

import java.util.Arrays;

public class azs {

    int numcolons = 0;
    colon[] colons = {};


    public void newcar(car car, colon colon)
    {
        double min =  1000000000;
        int imin = 0;
        for(int i =0; i<this.colons.length; i++)
        {
            if(this.colons[i].ostalostime()<min)
            {
                min = this.colons[i].ostalostime();
                imin = i;
            }
        }
        colons[imin].addcar(car);
        ///System.out.println("Добавлена новая машина");
        ///System.out.println(car.toString());
        if(min>12)
        {
            this.addcolon(colon);
            System.out.println("Добавлена новая колонна");
            this.numcolons ++;
            System.out.println("Количество коллон = " + colons.length);
        }
    }

    private static colon[] append(colon[] arr, colon colon)
    {
        colon[] array = new colon[arr.length + 1];
        System.arraycopy(arr, 0, array, 0, arr.length);
        array[arr.length] = colon;
        return array;
    }

    public void addcolon(colon colon){
        this.colons = append(colons, colon);
        this.numcolons += 1;
    }


}
