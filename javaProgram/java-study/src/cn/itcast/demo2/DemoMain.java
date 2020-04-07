package cn.itcast.demo2;

public class DemoMain {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.powerOn();

        USB usb =new Mouse();
        com.useDevice(usb);

        Keyboard keyboard = new Keyboard();
        com.useDevice(keyboard);

        com.powerOff();
    }
}
