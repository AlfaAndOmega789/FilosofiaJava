package Chapter7.RepeatUsing218;

class Line extends Shape {
    private int start, end;
    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Рисуем линию Line: " + start + ", " + end);
    }
    void dispose() {

        System.out.println("Стираем линию Line: " + start + ", " + end);
        super.dispose();
    }
}
