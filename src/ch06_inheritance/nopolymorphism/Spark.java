package ch06_inheritance.nopolymorphism;

public class Spark {
    private String name;
    private int price;
    private String maker; //제조회사

    public Spark(String name, int price, String maker) {
        this.name = name;
        this.price = price;
        this.maker = maker;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getMaker() {
        return maker;
    }
}
