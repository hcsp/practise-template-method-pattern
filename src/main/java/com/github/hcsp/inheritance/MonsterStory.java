package com.github.hcsp.inheritance;

import org.w3c.dom.ls.LSOutput;

public class MonsterStory extends Story {
    // 请补全本类，使得main方法可以输出以下内容：
    //
    // 开始讲故事啦
    // 从前有个老妖怪
    // 故事讲完啦
    // 你还想听吗
    @Override
    public  void tellStory() {
        super.startStory();
        story();
        super.endStory();
        listen();
    }

    @Override
    public void story() {
        System.out.println("从前有个老妖怪");
    }

    //
//    @Override
//    public void endStory() {
//        System.out.println("故事讲完啦");
//        System.out.println("你还想听吗");
//    }
    private void listen() {
        System.out.println("你还想听吗");
    }


    public static void main(String[] args) {
        new MonsterStory().tellStory();
    }
}
