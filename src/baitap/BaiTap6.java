package baitap;

import java.util.*;

public class BaiTap6 {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,8,8,9));
        System.out.println(list);
        Set<Integer> setList=new LinkedHashSet<>(list);
        System.out.println(setList);
    }
}
