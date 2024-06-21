package baitap;

import java.util.ArrayList;
import java.util.Arrays;

public class BaiTap2 {
    public static void main(String[] args) {
        String str="Rikkei Academy để nông dân biết code";
         String[] arrString=str.split(" ");
        ArrayList<String> list=new ArrayList<>(Arrays.asList(arrString));
        System.out.println(list);

        for (String a :list) {
            if(a.length()>3){
                System.out.println(a);
            }
        }
    }
}
