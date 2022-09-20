package com.execute233.person100;

import java.util.ArrayList;
import java.util.List;

//提供随机数生成的类
public class Random {
    private final List<Integer> list;

    //生成一个从start到end之间的数(包含他们两个)
    public static int random(int start,int end) {
        return new java.util.Random().nextInt(end - start + 1) + start;
    }
    //构造此类,用于生成不重复的int数值,其最多只能生成end-Start+1个
    public Random(int start,int end) {
        //初始化随机队列
        list = new ArrayList<>();
        int i = 0;
        while (true) {
            list.add(start + i);
            if ((start + i) == end) {
                break;
            }
            ++i;
        }
    }
    //获取不重复的int数值
    public int getRandomInt() {
        Integer result = list.get(new java.util.Random().nextInt(list.size()));
        list.remove(result);
        return result;
    }
    //获取不重复的int数组
    public int[] getRandomIntArray() {
        int[] result = new int[list.size()];
        int i = 0;
        while (true) {
            if (list.isEmpty()) {
                return result;
            }
            result[i] = getRandomInt();
            i++;
        }
    }
}
