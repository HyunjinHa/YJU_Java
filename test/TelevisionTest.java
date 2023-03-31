public class TelevisionTest {
    public static void main(String[] args) {
        
        Television myTV = new Television();

        myTV.channel = 7;
        myTV.vol = 9;
        myTV.isOn = true;
        myTV.prt();
        myTV.setCh(11);
        int ch = myTV.getCh();
        System.out.println("현재 채널은 " + ch + "입니다.");

        Television yourTV = new Television();
        
        yourTV.channel = 9;
        yourTV.vol = 12;
        yourTV.isOn = true;
        yourTV.prt();
    }
    
}
