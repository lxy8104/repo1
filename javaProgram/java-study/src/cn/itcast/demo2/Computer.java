package cn.itcast.demo2;

public class Computer {
    public void powerOn(){
        System.out.println("开机");
    }

    public void powerOff(){
        System.out.println("关机");
    }

    public void useDevice(USB usb){
        usb.open();
        if(usb instanceof Keyboard){
            ((Keyboard) usb).type();
        }else if(usb instanceof Mouse){
            ((Mouse) usb).click();
        }

        usb.close();
    }


}
