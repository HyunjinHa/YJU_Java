package hello.lab;

public class Box {
    private int width;
    private int length;
    private int height;
    //private int volume;

    public Box (int w, int l, int h) {
        width = w;
        length = l;
        height = h;
        //volume = w * l * h;
    }

    public int getVolume() {
        return width * length * height;
    }
    public static Box whoIsLargerBox(Box box1, Box box2) {
        if (box1.getVolume() > box2.getVolume()) {
            return box1;
        }
        return box2; 
    }

    public static void main(String[] args) {
        Box b1 = new Box(18, 20, 49);
        Box b2 = new Box(38, 15, 26);
        System.out.println("첫 번째 박스의 부피 = " + b1.getVolume());
        System.out.println("두 번째 박스의 부피 = " + b2.getVolume());

        Box largerBox = Box.whoIsLargerBox(b1, b2);
        System.out.println("더 큰 박스의 부피 = " + largerBox.getVolume());
    }
}
