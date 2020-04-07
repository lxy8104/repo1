package cn.itcast.demo6;

import java.util.Scanner;

public class Demo01RegisterException  {
    static String[] usernames={"张三","李四","王五"};

    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        System.out.print("输入注册的用户名:");
        String str = sca.next();
        checkUsername(str);
    }

    private static void checkUsername(String userName)  {
        for (String name : usernames) {
            if(name.equals(userName)){
                try {
                    throw new RegisterException();
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("注册成功");
    }
}
