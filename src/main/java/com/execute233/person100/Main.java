package com.execute233.person100;

public class Main {
    public static void main(String[] args) {
        final int count = 10000;
        int trueTimes = 0;
        for (int i = 0;i < count;i++) {
            if (run()) {
                trueTimes++;
            }
        }
        System.out.println(trueTimes);
    }
    //运行一次该程序
    public static boolean run() {
        Person[] people = Person.summon(100);
        Random random = new Random(1,100);
        BoxList.init(Box.summonWithNumber(random.getRandomIntArray()));
        for(Person person:people) {
            person.openForWithMessage(person.getNumber(),50);
            if (!person.isFound()) {
                return false;
            }
        }
        return true;
    }
}
