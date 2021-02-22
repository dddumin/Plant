package program;

import model.Garden;
import model.Plant;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Plant plant1 = new Plant();
        Plant plant2 = new Plant("Ромашка", 50);
        Plant plant3 = new Plant("Роза", "red", 10, 1, 100, 10, 20);
        Plant plant4 = new Plant("Хризантема", "red", 10, 1, 100, 15, 10);
        Plant plant5 = new Plant("Кактус", "red", 10, 1, 100, 10, 30);

       /* System.out.println(plant1);
        System.out.println(plant2);
        System.out.println(plant3);*/


       /* plant1.evalCount(5);

        System.out.println(plant1);
        System.out.println(plant2.getPrice());*/


        Garden garden1 = new Garden(3);

        Garden garden2 = new Garden(5);
        garden2.add(plant1);
        garden2.add(plant2);
        garden2.add(plant3);
        garden2.add(plant4);
        garden2.add(plant5);


        garden1.add(plant1);
        garden1.add(plant2);
        garden1.add(plant3);



     //   System.out.println(garden2.delete("Ромашка"));

/*        System.out.println(garden2);

        System.out.println(garden2.delete(plant1));

        System.out.println(garden2);*/

        /*System.out.println(garden1.delete(plant4));
        System.out.println(garden1.delete(plant2));

        System.out.println(garden1);

        System.out.println(garden1.insert(plant2, 1));

        System.out.println(garden1);*/


        System.out.println(garden1.string());








    }
}
