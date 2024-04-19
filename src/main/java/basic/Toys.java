package basic;

public class Toys extends Shop{


    private int price;
    private String brand;
    private int frequency;

    public Toys( String toys, int price, String brand, int frequency){
        super(toys);
        this.price = price;
        this.brand = brand;
        this.frequency = frequency;
    }
    public Toys(){
        super(null);
    }
    @Override
    public String toString() {
        return String.format("Игрушка: %s, Цена: %d, Бренд: %s, Шанс выпадения: %d", toys,price,brand,frequency);
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public int getFrequency() {
        return frequency;
    }
}
