package org.example;

public class Main {
    public static void main(String[] args) {
        azs azs = new  azs();
        colon colon1 = new colon();
        azs.addcolon(colon1);






            int deltatime = 1000;

            while(true) {

                double x = Math.random();
                car car = new car();
                car.makecar(x);
                colon colon2 = new colon();
                azs.newcar(car, colon2);


                for(int i = 0; i< azs.colons.length; i++)
                {
                    System.out.println("column " + i + " need to wait " + azs.colons[i].ostalostime());

                    ///for(int j = 0; j< azs.colons[i].cars.length; i++)
                    {
                        ///System.out.println("car " + j + " time = " + azs.colons[i].cars[j].time);
                    }
                    System.out.println(azs.colons[i].toString());
                    System.out.println("\n");
                }
                System.out.println(">>>>>>>>>>>>>>\n");









                try {
                    Thread.sleep(deltatime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                ///System.out.println("col" + azs.colons[azs.colons.length - 1].cars.length);
                ///System.out.println(azs.colons[0].cars[0].time);

                for(int i = 0; i< azs.colons.length; i++)
                {
                    if(azs.colons[i].cars.length > 0) {
                        azs.colons[i].cars[0].time -= deltatime/1000;
                        if (azs.colons[i].cars[0].time <= 0) {
                            azs.colons[i].remcar(azs.colons[i].cars[0]);
                        }
                    }

                }


            }

    }
}