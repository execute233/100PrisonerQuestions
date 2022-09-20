package com.execute233.person100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//存放箱子的地方
public class BoxList extends ArrayList<Box>{
    public static BoxList list;
    //寻找指定编号的箱子
    public Box find(int number) {
        for (Box box:this) {
            if (box.getNumber() == number) {
                return box;
            }
        }
        return null;
    }
    //初始化存箱子的地方
    public static void init(Box[] boxes) {
        list = new BoxList();
        list.addAll(Arrays.asList(boxes));
    }
}
