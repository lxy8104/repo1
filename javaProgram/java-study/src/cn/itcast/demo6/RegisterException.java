package cn.itcast.demo6;

public class RegisterException extends RuntimeException {
    public RegisterException() {
        super();
    }
    public RegisterException(String str){
        super(str);
    }
}
