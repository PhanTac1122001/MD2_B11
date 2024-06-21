package baitap;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BaiTap3 {
    public static void main(String[] args) {
        String str="Abc tên là gi vậy";
        String[] arrString=str.split(" ");
        ArrayList<String> list =new ArrayList<>(Arrays.asList(arrString));
//        String min = Collections.min(list, Comparator.comparing(String::length));
        String min =list.get(0);
        for (String s: list){
            if(s.length()<min.length()){
                min=s;
            }
        }
        System.out.println(min);
    }
}
