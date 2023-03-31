package hello.inheritance.polymorphism;

public class Polygon extends Shape {
    private int p;

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }
    @Override
    public void draw() {
        System.out.println("Polygon Draw [" + p + "]");
    }
}
