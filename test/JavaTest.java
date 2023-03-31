public class JavaTest {

    // member method
    // instance method
    double square(double df) {
        test();
        return df * df;        
    }

    int square(int num) {
        return num * num;
    }

    void test() {
        System.out.println("test method called");
    }


    public static void main(String[] args) {
        // double r = square(4.0);

        if (args.length == 0) {
            System.out.println("Usage: java JavaTest name");
            return;
        }
        else {
            System.out.println("Hello " + args[0]);
        }


        JavaTest jt = new JavaTest();
        int result = jt.square(3);
        System.out.println(result);

        double result2 = jt.square(3.14);
        System.out.println(result2);
    }
}