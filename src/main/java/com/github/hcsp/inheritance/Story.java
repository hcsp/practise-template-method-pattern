package com.github.hcsp.inheritance;

//import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class Story {
    public final void tellStory() {
        startStory();
        story();
        endStory();
        endListen();

    }

    private void endListen() {
        System.out.println("你还想听吗");
    }

    public void startStory() {
        System.out.println("开始讲故事啦");
    }

    public void story() {
        System.out.println("从前有个老和尚");
    }

    public void endStory() {
        System.out.println("故事讲完啦");
    }

    public static void main(String[] args) {
        new Story().tellStory();
    }
}
