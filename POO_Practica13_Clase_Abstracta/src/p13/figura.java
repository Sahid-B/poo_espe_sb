package p13;

public abstract class figura {
    double x;
    double y;

    public figura() {
    }

    public figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea();
}