package StackoverflowJava;

import org.apache.commons.lang3.ArrayUtils;


public class ContainsTest {
    public static void main(String[] args) {
        String[] test = {"id", "name", "birhdate"};
        if(ArrayUtils.contains(test,"name")){
            System.out.println("true");
        }
    }
}
