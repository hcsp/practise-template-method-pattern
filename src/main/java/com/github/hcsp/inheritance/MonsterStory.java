package com.github.hcsp.inheritance;

public class MonsterStory extends Story {
    // 请补全本类，使得main方法可以输出以下内容：
    //
    // 开始讲故事啦
    // 从前有个老妖怪
    // 故事讲完啦
    // 你还想听吗
    @Override
    public void startStory() {
        System.out.print("开始讲故事啦");
    }

    @Override
    public void story() {
        System.out.print("从前有个老妖怪");
    }

    @Override
    public void endStory() {
        System.out.print("故事讲完啦");
    }

    public void continueStory() { System.out.print("你还想听吗"); }

    public static void main(String[] args) {
        MonsterStory monsterStory = new MonsterStory();
        monsterStory.tellStory();
        monsterStory.continueStory();
    }
}
