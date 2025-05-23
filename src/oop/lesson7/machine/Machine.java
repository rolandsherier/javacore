package oop.lesson7.machine;

public class Machine {
    // Абстракция — это процесс выделения важных свойств объекта и отбрасывания ненужных деталей.
    // Атрибуты (поля) — это характеристики объекта, которые описывают его состояние.
    String color;
    String model;
    int speed;

    // Конструктор отвечает за инициализацию объекта — он задаёт начальные значения для полей. Чтобы создать его быстро нажимаем сочетание cmd + n -> constructor и выбрать все поля.
    public Machine(String carColor, String carModel, int maxSpeed) {
        this.color = carColor;
        this.model = carModel;
        this.speed = maxSpeed;
    }

    // Пишем метод, который ничего не будет возвращать то если вызвать и попытаться сохранить в переменную то, не будет сохранен в переменную. Если вместо слова void был String, то смог бы сохранить в переменную
    public void moveCar(String someModel) {
//        Добавляем строковую подстановку %s
        System.out.printf("Машина модели %s поехала\n", someModel);
    }

    public String race(boolean isFirst) {
//        На return происходит выход из функции и дальнейший код не будет работать
        if (isFirst) {
            return "Машина финишировала первой";
        }
        return "Машина финишировала последней";
    }

    public String race(boolean isFirst, boolean success) {
        if (success) {
            if (isFirst) {
                return " Первое место";
            }
            return "Последнее место";
        }
        return "Ничего";
    }

    public void race(String timesOfDay) {
        if (timesOfDay.equals("Lamborgini")) {
            System.out.println("Luxuary");
        } else {
            System.out.println("Common");
        }
    }

    // Метод toString() переопределяется для того, чтобы при выводе объекта на экран отображались все его важные свойства в удобочитаемом виде.
    // Чтобы быстро сгенерировать метод toString() в IDEA, нажимаем CMD + N → toString() → выбираем нужные поля.
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}