package cn.itcast.demo6;

import java.util.List;

public class MultiExceptionTest {
    public static void main(String[] args) {
        try{
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
            System.out.println("=======");
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
            System.out.println("=======");
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
