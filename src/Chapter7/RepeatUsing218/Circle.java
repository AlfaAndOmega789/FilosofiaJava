package Chapter7.RepeatUsing218;


class Circle extends Shape {
    Circle(int i) {
        super(i);
        System.out.println("Рисуем окружность Circle");
    }
    void dispose() {
        System.out.println("Стираем окружность Circle");
        super.dispose();
    }
}
