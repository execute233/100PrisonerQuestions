package com.execute233.person100;
//此类代表一个囚犯
public class Person {
    //序号
    private final int number;
    //已打开的箱子数
    private int openedBoxNumber = 0;
    //是否是找到序号的人
    private boolean isFound = false;
    //生成一定数量囚犯，他们的序号不重复并且是有序的
    public static Person[] summon(int count) {
        Person[] result = new Person[count];
        for (int i = 0;i < count;i++) {
            result[i] = new Person(i + 1);
        }
        return result;
    }
    //打开一个箱子,返回的是该箱子的数值
    public int open(Box box) {
        if (number == box.getMessage()) {
            isFound = true;
            openedBoxNumber++;
            return box.getMessage();
        }
        openedBoxNumber++;
        return box.getMessage();
    }
    //打开指定编号的箱子，并以里面的数值作为下一个打开的箱子，一直打开，直到打开一定数量为止
    public void openForWithMessage(int number,int count) {
        //下一个箱子的编号
        int nextNumber = number;
        for (int i = 0;i < count;i++) {
            Box box = BoxList.list.find(nextNumber);//打开的箱子
            if (box == null) {
                System.out.println(nextNumber);
            }
            nextNumber = open(box);
            if (isFound) {
                break;
            }
        }
    }

    public int getNumber() {
        return number;
    }
    public Person(int number) {
        this.number = number;
    }

    public boolean isFound() {
        return isFound;
    }

    @Override
    public String toString() {
        return "Person{" +
                "number=" + number +
                '}';
    }
}
