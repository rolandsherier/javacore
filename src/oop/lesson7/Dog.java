package oop.lesson7;

public class Dog {
    // 🔐 Приватные поля — недоступны напрямую снаружи
    private String name = "Lord";
    private int weight = 50;
    private String owner = "Fedor";

//    Блок инициализации
    {
        System.out.println("Собака создалась");
    }


    // 🔧 Конструктор — инициализирует объект
    public Dog() {

    }

    // Вместо дублирования логики здесь — вызываем setWeight()
    public Dog(String name, int weight, String owner) {
        this.name = name;
        this.owner = owner;
        setWeight(weight); // ✅ логика проверки веса централизована
    }

    // ✅ Сеттер с защитой: не даёт установить вес < 1
    public void setWeight(int newWeight) {
        if (newWeight < 1) {
            this.weight = 5; // значение по умолчанию
        } else {
            this.weight = newWeight;
        }
    }

    // ✅ Геттер — возвращает имя владельца с префиксом
    public String getOwner() {
        return "Mr." + owner;
    }

    // 🧾 Переопределяем toString(), чтобы красиво печатать объект
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}