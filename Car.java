package hello.lab;

public class Car {
    private int speed;
    private String name;

    public Car() {
        speed = 100;
        System.out.println("속도는 " + speed);
    }
    //인스턴스 초기화 블록 (instance initialization block)
    {
        speed = 100;
    }

    public Car(String name) {
        this.name = name;
        System.out.println("속도는 " + speed);
    }

}
