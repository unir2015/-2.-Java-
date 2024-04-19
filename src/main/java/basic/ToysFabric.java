package basic;

import java.util.Random;

public class ToysFabric {
    private static Random random = new Random();

    public static MyArrayList<Toys> generateToys(int len) {

        MyArrayList<Toys> toysMyArrayList = new MyArrayList<>(new Toys[len]);
        String[] toys = new String[]{"Воздущные шарики", "Машина", "Кукла", "Тракторы", "Радио управляеая машинка", "Радио управляеая робот", "Домик", "Палатка", "Конструктор", "Кубик рубик", "Планшет для рисования"};
        String[] brand = new String[]{"Fix price", "Светофор", "Magic", "Amazoon", "Leomax"};
        Toys netoys;
        for (int i = 0; i < len; i++) {
            int price = random.nextInt(500, 5001);
            int frequency = random.nextInt(20, 90);
            netoys = new Toys(toys[random.nextInt(toys.length)], price, brand[random.nextInt(brand.length)], frequency);
            toysMyArrayList.add(netoys);
        }

        return  toysMyArrayList;

    }

}






