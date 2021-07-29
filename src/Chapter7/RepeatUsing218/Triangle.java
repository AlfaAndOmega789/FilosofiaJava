package Chapter7.RepeatUsing218;

class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        System.out.println("Рисуем треугольник Shape");}
    void dispose() {
        System.out.println("Стираем треугольник Shape");
        super.dispose();
    }
}

