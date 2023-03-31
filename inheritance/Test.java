package hello.inheritance;

public class Test {
    public static void main(String[] args) {
        // Derived r = new Derived();
        Derived d = new Derived("생성ㅇㅇㅇ");
        // Derived 클래스 내에 String 인자를 받는 생성자가 없기 때문에 오류
    }
}
