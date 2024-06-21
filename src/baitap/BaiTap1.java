package baitap;

import java.util.ArrayList;
import java.util.Collections;

public class BaiTap1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add( (int) Math.floor(Math.random()*100));

        }
        System.out.println(list);
        Integer max= Collections.max(list);
        System.out.println(max);
        Collections.reverse(list);
        System.out.println("Đảo ngược: "+list);

        Collections.sort(list);
        System.out.println("Sắp xếp:"+list);

        ArrayList<Integer> list2=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list2.add( (int) Math.floor(Math.random()*100));
        }
        System.out.println(list2);
        list.addAll(list2);
        System.out.println("List 1 và 2: "+list);
    }
}
