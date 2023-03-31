package hello.lab;

public class MyCounter {
    
    public static void addOne(int val) {
        val  = val + 1;
    }

    private int value;

    public void serValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void increase(MyCounter cntObj) {
        int v = cntObj.getValue() + 1;
        cntObj.serValue(v);
    }

    public static void main(String[] args) {
        // int val = 10;
        // MyCounter.addOne(val);
        // System.out.println(val);

        MyCounter mc = new MyCounter();
        mc.serValue(10);
        MyCounter.increase(mc);
        System.out.println(mc.getValue());

    }

}
