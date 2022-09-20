package com.execute233.person100;
//表示一个箱子
public class Box {
    //该箱子的编号
    private final int number;
    //箱子里的数数值
    private final int message;


    public Box(int number, int message) {
        this.number = number;
        this.message = message;
    }

    public int getNumber() {
        return number;
    }

    public int getMessage() {
        return message;
    }
    //生成指定数量的箱子,其数量为传入数组的长度，其中的每个值都作为每个箱子里的数值
    public static Box[] summonWithNumber(int[] value) {
        Box[] result = new Box[value.length];
        for (int i = 0;i < value.length;i++) {
            result[i] = new Box(i + 1   ,value[i]);
        }
        return result;
    }
}
