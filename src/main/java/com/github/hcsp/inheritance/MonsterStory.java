package com.github.hcsp.inheritance;

public class MonsterStory  {
    // 请补全本类，使得main方法可以输出以下内容：
    //
    // 开始讲故事啦
    // 从前有个老妖怪
    // 故事讲完啦
    // 你还想听吗
    Story story = new Story();

    public static void main(String[] args) {
        new MonsterStory().tellStory();
    }

    public void tellStory() {
       story.tellStory();
       System.out.println("你还想听吗");
    }
}
