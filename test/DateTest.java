package hello.lab;

public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(2023, "3월", 16);
        Date date2 = new Date(2020);
        Date date3 = new Date();
        
        System.out.println(date1.getDate());
        System.out.println(date2.getDate());
        System.out.println(date3.getDate());
    }
}
