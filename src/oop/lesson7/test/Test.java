package oop.lesson7.test;

public class Test {
    private String model;
    private int price;
    private String color;

    public Test(int price, String model, String color) {
        this.price = price;
        this.model = model;
        this.color = color;
    }

//    Getter
    public String getModel() {
        return this.model;
    }

    public int getPrice(){
          return this.price;
    }

//    Setters
    public void setModel(String newModel){
        this.model = newModel;
    }


    @Override
    public String toString() {
        return "Test{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }
}
