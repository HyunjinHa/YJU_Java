public class Television {
    int channel;         // 채널번호
    int vol;        // 볼륨
    boolean isOn;   // 전원상태

    void prt() {
        System.out.println("채널은 " + channel + "이고 볼륨은 " + vol + "입니다.");
    }

    int getCh() {
        return channel;
    }

    void setCh(int ch) {
        channel = ch;
    }
}
