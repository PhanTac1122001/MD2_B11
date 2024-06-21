package baitap;

import java.util.ArrayList;

public class BaiTap4 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) Math.floor(Math.random()*100));

        }
        System.out.println(list);

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(i)) {
                    i = j;
                }
            }
            int temp = list.get(i);
            list.set(i, list.get(i));
            list.set(i, temp);
        }
        System.out.println(list);
    }
}
