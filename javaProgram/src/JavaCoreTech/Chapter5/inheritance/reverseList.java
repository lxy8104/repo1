package JavaCoreTech.Chapter5.inheritance;
import java.util.*;

public class reverseList {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void reverseL(int[] num){
        int len = num.length;
        int left=0;
        int right = len-1;
        while(left<right){
            int temp = num[left];
            num[left] = num[right];
            num[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,6};
        reverseList.reverseL(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        final int length = "asdqiwenqwe".length();


    }

}
