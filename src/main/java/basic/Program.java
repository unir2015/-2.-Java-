package basic;

import java.util.Enumeration;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random random = new Random();
        MyArrayList<Toys> toysMyArrayList = ToysFabric.generateToys(100);


        MyArrayList<Toys> twentyThirty = new MyArrayList<>(new Toys[100]);
        MyArrayList<Toys> thirtySixty = new MyArrayList<>(new Toys[100]);
        MyArrayList<Toys> sixtyNinety = new MyArrayList<>(new Toys[100]);

        for (int k = 0; k < toysMyArrayList.size(); k++) {
            System.out.println(toysMyArrayList.get(k));
        }


        for (int i = 0; i < toysMyArrayList.size(); i++){
            if(toysMyArrayList.get(i).getFrequency() > 20 | toysMyArrayList.get(i).getFrequency() > 25) {
                twentyThirty.add(toysMyArrayList.get(i));
            }
            else if(toysMyArrayList.get(i).getFrequency() > 25 | toysMyArrayList.get(i).getFrequency() > 45) {
                thirtySixty.add(toysMyArrayList.get(i));
            } else if (toysMyArrayList.get(i).getFrequency() > 45 | toysMyArrayList.get(i).getFrequency() > 90) {
                sixtyNinety.add(toysMyArrayList.get(i));
            }
        }
        System.out.println("");
        System.out.println("***");
        System.out.println("");




        int res = random.nextInt(20, 90);

        if(res < 20 | res < 25){
            int a = random.nextInt(twentyThirty.size());
            System.out.println("Выпал: " + twentyThirty.get(a));
        } else if (res < 25 | res > 45) {
            int a = random.nextInt(twentyThirty.size());
            System.out.println("Выпал: " + twentyThirty.get(a));
        } else if (res < 45 | res > 45) {
            int a = random.nextInt(twentyThirty.size());
            System.out.println("Выпал: " + twentyThirty.get(a));
        }


    }
}
