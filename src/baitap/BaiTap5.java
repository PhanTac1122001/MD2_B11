package baitap;

import java.util.ArrayList;
import java.util.Arrays;

public class BaiTap5 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,2,3,14,22,20,6,7,8,9,10));

        ArrayList<Integer> evenList=new ArrayList<>();

        for (Integer n :list){
            if (n%2 !=0){
                evenList.add(n);
            }
        }
        System.out.println(evenList);
    }
}
