package hello.lab;

public class Date {
    private int year;
    private String month;
    private int day;

    public Date(int y, String m, int d) {
        year = y;
        month = m;
        day = d;
    }

    public Date(int y) {
        this(y,"1월",1);
    }

    public Date() {
        this(1990,"1월",1);
    }

    public String getDate() {
        return "Date [year = " + year + ", month = " + month + ", day = " + day + "]"; 
    }
}
